
package com.tcerniha

class Employee {
	String employeeID
	String fullName
	Date dateOfBirth
	String residence
	double horlyRate 
	Date dateEmployed
	String taxCode
	String contract

	TeamLeader teamLeader
	Shift shift
	Manager manager
	Team team
	Task task

	String toString(){
		return fullName
	}
	
	static belongsTo=[Team]


	double calculateWagePerWeek(){
		horlyRate*4*2
	}

	
    static constraints = {
	fullName blank:false, nullable:false
	dateOfBirth blank:false, nullable:false
	residence blank:false, nullable:false
	horlyRate blank:false, nullable:false, scale:2
	employeeID blank:false, nullable:false, size:1..6
	dateEmployed blank:false, nullable:false
	taxCode blank:false, nullable:false, size:1..5
	contract blank:false, nullable:false
	shift blank:false, nullable:false
	teamLeader blank:false, nullable:false
	manager blank:false, nullable:false
	team blank:false, nullable:false
	task blank:false, nullable:false
    }
}
