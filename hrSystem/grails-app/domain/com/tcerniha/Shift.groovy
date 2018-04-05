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
	timeOfDay  blank:false, nullable:false, inList: ['Morning', 'Afternoon', 'Evening']
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false, min:4, max:8
	startingTime blank:false, nullable:false, inList: ['6:00am', '09:00am','12:00am', '6:00pm', '11:00pm']
    }
}
