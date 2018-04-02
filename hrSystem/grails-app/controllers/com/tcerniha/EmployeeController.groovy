package com.tcerniha

class EmployeeController {

    def scaffold = Employee

	def advSearch(){
		
	}	
	
	def advResult(){	
	
		def employeeProps = Employee.metaClass.properties*.name
		// list of employees
		def employees= Employee.with Criteria{
			"${params.queryType}"{
				params.each{
			   	field, value->
					if (employeeProps.grep(field) && value){
						ilike(field, value)				
					}
				}
			}
		}
	}
	//return[employees:employees]

}
