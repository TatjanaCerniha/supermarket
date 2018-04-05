package com.tcerniha

class TeamLeaderController {

    def scaffold = TeamLeader

	def login(){

	}
	
	// validate login details
	def validate(){
		
		def user=TeamLeader.findByLeaderEmail(params.leaderEmail)		
		if (user && user.password == params.password){
			session.user = user
			render view:'home'
		}
		else {
			flash.message = "Invalid leaderEmail or password"			
			render view:'login'
		}
	}

	// logout action
	def logout = {
		session.user = null
		redirect(uri:'/')
	}
}
