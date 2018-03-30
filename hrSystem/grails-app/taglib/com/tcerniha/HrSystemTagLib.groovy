package com.tcerniha

class HrSystemTagLib {
   // static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	// define a custom tag loginToggle
	 def loginToggle= {

		out << "<div style='margin:15px 0 40px;'>"
      		  if (request.getSession(false) && session.user){

			// this code dispaly Welcome messaage
			out << "<span style='float:left;margin-left:20px'>"
		  	out << " Welcome ${session.user}."
			out << "</span><span style ='float:right;margin-right:20px'>"	

			//if the session has been created Create LOGOUT link
		  	 out << "<a href='${createLink(controller:'manager',action:'logout')}'>"
			 out << "Logout</a></span>"
		   }
			//if a session has been not created a LOGIN link is created
		else {	
			out << "<span style='float:right; margin-right:20px'>"
			out << "<a href='${createLink(controller:'manager', action:'login')}'>"
			out << "Login</a></span>"
		}

		out << "</div><br/>"
    }
}
