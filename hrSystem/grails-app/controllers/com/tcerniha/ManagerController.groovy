package com.tcerniha

class ManagerController {

    def scaffold = Manager
	
	def login(){

	}

	// validate login details
	def validate(){
		
		def user=Manager.findByUserName(params.userName)
		if (user && user.password == params.password){
			session.user = user
			render view:'home'
		}
		else {
			flash.message = "Invalid username and password"
			render view:'login'
		}
	}

	// logout action
	def logout = {
		session.user = null
		redirect(uri:'/')
	}
}
