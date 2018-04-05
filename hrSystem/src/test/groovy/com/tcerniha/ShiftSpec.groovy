package com.tcerniha

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void validatingShift() {
       when:"Shift is created with time Of Day and number Of Hours"
	def shiftMon = new Shift(
		timeOfDay: 'Morning',
		numberOfHours: 2
	)
	then: 'Validation should fail'
	shiftMon.validate()

	
    }
}
