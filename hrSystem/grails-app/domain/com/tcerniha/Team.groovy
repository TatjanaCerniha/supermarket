package com.tcerniha

class Team {
	String teamName
	int numberOfEmployees
	String sectionName
	String description
 
    static constraints = {
	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false, min:10, max:30
	sectionName blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }
}
