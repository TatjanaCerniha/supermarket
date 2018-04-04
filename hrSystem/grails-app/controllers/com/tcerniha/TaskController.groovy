package com.tcerniha
//import grails.converters.*
	

class TaskController {
  //static allowedMethods = [index:"GET", show:"GET"]
   def scaffold = Task
	
	//def index(Task task){
	   //display all instances
	  // render Task.list() as XML
	//}

	//def show(Task task){
	//  if(params.id && Task.exists(params.id)){
	//	render task.findById(params.id) as XML
	//  }
	//  else{
	//     render Task.list() as XML 
	//  }
	//}
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
