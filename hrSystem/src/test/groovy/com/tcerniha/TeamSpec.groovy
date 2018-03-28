package com.tcerniha

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {
       when:"Team has teamName and sectionName"
	def packing=new Team (
		teamName: 'Team Packing',		
		sectionName: 'Butcher'	
	)
	then:"the toString method will merge them."
	packing.toString()=='Team Packing, Butcher'
    }
}
