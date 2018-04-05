<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket System | HOME page</title>
	<asset:stylesheet src = "home.css" />
</head>
<body>
  
   <div class= "row">
	<!-- <g:link controller = "manager" action = "/">HOME<br><br></g:link>-->
	 <!-- <a controller = "manager" class="home" href="/">H<a>  -->
   <div class = "search">
	<h3>Search Employees </h3><br>		
	    <g:link controller = "employee" action = "advSearch">Search Employee<br><br></g:link>	
   </div>
  </div>
   </div class = "container">
    <div class = "row">
        <section>     
	  <h3>Select relevant button</h3>
            <div id="controllers" role="navigation">               
		<div class = "row">	
		  <div class = "col-sm-3">		
			<button type = "button button1" class= "btn btn-success">
			    <g:link controller = "employee" action = "create"> Add Employees</g:link>
			</button><br>
		  </div>
		</div>
	        <div class = "row">	
		  <div class = "col-sm-3">				
			<button type = "button button1" class= "btn btn-success">
			    <g:link controller = "team" action = "create"> Create a Team</g:link>
			</button><br>
		  </div>
	       </div>
	        <div class = "row">
		  <div class = "col-sm-3">			
			<button type = "button button1" class= "btn btn-success">
			    <g:link controller = "teamLeader" action = "create">Add Team Leaders</g:link>
			</button><br>
		  </div>
	       </div>
	       <div class = "row">
		  <div class = "col-sm-3">			
			<button type = "button button1" class= "btn btn-success">
			    	<g:link controller = "shift" action = "create">Create a Shift</g:link>
			</button><br>
		 </div>
	       </div>	
	       <div class = "row">
		   <div class = "col-sm-3">			
			<button type = "button button1" class= "btn btn-success">
			    	<g:link controller = "employee" action = "index">Assign Employees to Team</g:link>
			</button><br>
		  </div>		     
              </div>
	     
        </section>
  </div>
 </div>
</body>
</html>
