package com.tcerniha

class Team {
	String teamName
	int numberOfEmployees
	String sectionName
	String description
	Shift shift

	String toString(){
		return teamName
	}

	static hasMany=[employees:Employee, tasks:Task]
 
    static constraints = {
	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false, min:10, max:30
	sectionName blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	shift blank:false, nullable:false
    }
}
