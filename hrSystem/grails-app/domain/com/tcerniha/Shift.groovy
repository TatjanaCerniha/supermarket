package com.tcerniha

class Shift {
	String timeOfDay
	String dayOfWeek
	int numberOfHours
	String startingTime

    static constraints = {
	enum timeOfDay {Morning, Afternoon,Evening} blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false, min:4, max:10
	startingTime blank:false, nullable:false
    }
}
