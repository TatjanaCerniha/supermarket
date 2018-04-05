package com.tcerniha

import grails.converters.*
	

class TaskController {
  static allowedMethods = [index:"GET", show:"GET",delete:"DELETE"]
   def scaffold = Task
	
	def index(Task task){
	 //  display all instances
	   render Task.list() as XML
	     if (index){
	         render Task.findById(params.id) as XML
	      }
	       else {
	          render "There are currently no tasks in Database"
	     }
	}

	  

	def show(Task task){
	 if(params.id && Task.exists(params.id)){
		render Task.findById(params.id) as XML
	           if(task.taskCompleted ==false){
		        render Task.findById(params.id) as XML
	            }else{
		      render "This task is not completed yet"
	             }
		}
	   else{
	      render Task.list() as XML 
	 }
	}
	
	  

	def delete (Task task){
	    render Task.findById(params.id) as XML
	}	

	def advSearch(){
	
	}

	def advResults(){
	   def taskProps=Task.metaClass.properties*.name
	   def tasks = Task.withCriteria{
		"${params.queryType}" {
		    params.each {field, value ->
			if (taskProps.grep(field) && value) {
			    ilike(field, value)
			}
		    }		
		}
	   }
	return[tasks:tasks]
	}
}
