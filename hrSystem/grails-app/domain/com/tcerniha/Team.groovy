package com.tcerniha

class Team {
	String teamName
	int numberOfEmployees
	String sectionName
	String description
	Shift shift
	TeamLeader teamLeader
	
	static hasMany=[employees:Employee, tasks:Task]

	String toString(){
		
		// testing domain class Team using a method toString()
		return "$teamName, $sectionName"

		return teamName
	}

 
    static constraints = {
	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false, min:10, max:30
	sectionName blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	shift blank:false, nullable:false
	teamLeader blank:false, nullable:false
    }
}
