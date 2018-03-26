package com.tcerniha

class TeamLeader {
	String fullName
	String department
	String employeeID
	String sectionName
	String officePhone
	String leaderEmail
	String password
	Manager manager
	Team team
	

	String toString(){
		return fullName
	}

   	static hasMany=[employees:Employee, shifts:Shift]
	static belongsTo=[Team]
	

    static constraints = {
	fullName 	blank:false, nullable:false
	department	blank:false, nullable:false
	employeeID 	blank:false, nullable:false, unique:true , size:1..6
	sectionName 	blank:false, nullable:false 
	officePhone 	blank:false, nullable:false, scale:8 // validating phone number 
	leaderEmail 	blank:false, nullable:false,  email:true
	password 	blank:false, nullable:false
	manager 	blank:false, nullable:false
	team 		blank:false, nullable:false
    }
}
