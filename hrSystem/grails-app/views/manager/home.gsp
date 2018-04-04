<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket System | HOME page</title>
	<asset:stylesheet src = "home.css" />
</head>
<body>
   <div class= "row">
   <div class = "first">
	<h3>Search Employees </h3><br>	
	<!-- <button type= "button" class = "btn btn-success">  </button> -->
	    <g:link controller = "employee" action = "advSearch">Search Employee</g:link>	
   </div>
  </div>
   </div class = "container">
    <div class = "row">
        <section>         
            <div id="controllers" role="navigation">               
		<div class = "row">	
		  <div class = "col-sm-3">		
			<button type = "button button1" class= "btn btn-success">
			    <g:link controller = "employee" action = "create"> Add Employees</g:link>
			</button><br>
		  </div>		
		  <div class = "col-sm-3">				
			<button type = "button button1" class= "btn btn-success">
			    <g:link controller = "team" action = "create"> Create a Team</g:link>
			</button><br>
		  </div>
		  <div class = "col-sm-3">			
			<button type = "button button1" class= "btn btn-success">
			    <g:link controller = "teamLeader" action = "create">Add Team Leaders</g:link>
			</button><br>
		  </div>
		  <div class = "col-sm-3">			
			<button type = "button button1" class= "btn btn-success">
			    	<g:link controller = "shift" action = "create">Create a Shift</g:link>
			</button><br>
		 </div>	
		   <div class = "col-sm-3">			
			<button type = "button button1" class= "btn btn-success">
			    	<g:link controller = "employee" action = "index">Assign Employees to Team</g:link>
			</button><br>
		 </div>		     
             </div>
          </div>
        </section>
  </div>
 </div>
</body>
</html>
