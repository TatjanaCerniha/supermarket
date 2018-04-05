package com.tcerniha

class HrSystemTagLib {
   // static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	// define a custom tag loginToggle
	 def loginToggle= {

		out << "<div style='margin:5px 0 20px;'>"
      		  if (request.getSession(false) && session.user){

			// this code dispaly Welcome message
			out << "<span style='float:left;margin-left:20px'>"
		  	out << " Welcome ${session.user}."
			out << "</span><span style ='float:right;margin-right:20px'>"	

			//if the session has been created for Manager then create LOGOUT link
		  	 out << "<a href='${createLink(controller:'manager',action:'logout')}'>"
			 out << "Logout</a></span>"

			//if the session has been created for TeamLeader then create LOGOUT link
		  	// out << "<a href='${createLink(controller:'teamLeader',action:'logout')}'>"
			// out << "Logout</a></span>"
			
		   }
			//if a session has been not created a LOGIN link is created
		else {	
			out << "<span style='float:right; margin-right:20px'>"
			out << "<a href='${createLink(controller:'manager', action:'login')}'>"
			out << "Login Manager</a></span>"

			out << "<span style='float:right; margin-right:20px'>"
			out << "<a href='${createLink(controller:'teamLeader', action:'login')}'>"
			out << "Login TeamLeader</a></span>"
		}

		out << "</div><br/>"
    }
}
