<!DOCTYPE html>
<html>
<head>
	<meta name = "layout" content = "main" />
	<title>Team Leader Login</title>
	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />	
	<asset:stylesheet src = "home.css" />
</head>
<body>
    <div class = "row">
	<!-- the code displays message on the form-->
	<g:if test="${flash.message}">
		<div class="message">${flash.message}</div>
	</g:if>

	<!-- form validation-->
	<g:form action= "validate">
		<input type = "hidden" name= "cName" value = "${cName}">
		<input type = "hidden" name= "aName" value = "${aName}">
		<h2 align = "center"> Team Leader Login System</h2>
		<table>
       		    <tr class="prop">
         	       <td class="name">
         	           <label for="leaderEmail">Email:</label> 				
          	       </td>	
			<td class="value">
           	 	   <input type="leaderEmail" id="leaderEmail" name="leaderEmail" value="">
          		</td>	              	    
		    </tr>
        	   <tr class="prop">
        	 	<td class="name">
          	  	    <label for="password">Password:</label>
         	 	</td>
          		<td class="value">
           	 	   <input type="password" id="password" name="password" value="">
          		</td>
		   </tr>
        	   <tr><td></td>
         	        <td>
			  <button type="submit" value="login">Login</button>           		
          		</td></tr>
      		</table>
    	</g:form>
      </div>
</body>
</html>
