package com.tcerniha

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification


class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void wagePerWeek() {
      when: "An Employee has name and horlyRate"

	def employee1 = new Employee (
		fullName: 'Tatjana',
		horlyRate:7.5		
	)
	then: "calculateWagePerWeek method will count total horlyRate"
	employee1.calculateWagePerWeek() == 60
    }
}
