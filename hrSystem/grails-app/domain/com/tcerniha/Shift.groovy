package com.tcerniha

class Shift {
	String timeOfDay
	String dayOfWeek
	int numberOfHours
	String startingTime
 
	String toString(){
		return timeOfDay
	}

	static hasMany=[employees:Employee, teams:Team, tasks:Task]
	static belongsTo=[Team,Task]

    static constraints = {
	timeOfDay  blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false, min:4, max:10
	startingTime blank:false, nullable:false
    }
}
