package com.tcerniha

class Task {
	String taskName
	int numberOfPeople
	String sectionName
	String department
	String timeRequired
	String description
	Boolean taskCompleted
	

	String toString(){
		return taskName
	}

	static hasMany=[teams:Team, shifts:Shift, employees:Employee]
	static belongsTo=[Team, Employee]

    static constraints = {
	taskName blank:false, nullable:false
	numberOfPeople blank:false, nullable:false, min:2, max:10
	sectionName blank:false, nullable:false
	department blank:false, nullable:false
	timeRequired blank:false, nullable:false
	description blank:false, nullable:false, maxSize:1000, widget:'textarea'
	taskCompleted blank:false, nullable:false
	
    }
}
