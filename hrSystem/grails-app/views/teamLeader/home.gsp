<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket System | HOME page</title>
	<asset:stylesheet src = "home.css" />
</head>
<body>	
   <div class = "row">
    <div class = "search">
	 <h3>Search a Task</h3><br>			
	    <g:link controller = "task" action = "advSearch"> Search Tasks<br><br></g:link>	
    </div>
  </div>
   </div class = "container">
    <div class = "row">	 
           <section>       
              
	       <div id="controllers" role="navigation"> 
		<div class = "row">	
		  <div class = "col-sm-3">		
			<button type = "button" class= "btn btn-success">
			    <g:link controller = "task" action = "create"> Create a Task</g:link>
			</button><br>
		  </div>
		 </div>			   	
		  <div class = "row">
		      <div class = "col-sm-3">					
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "employee" action = "index"> Display Employees</g:link>
			</button><br>
		      </div>
		  </div>
		  <div class = "row">
		     <div class = "col-sm-3">				
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "team" action = "index">Display Teams</g:link>
			</button><br>
		     </div>
		  </div>
		 <div class = "row">
		  <div class = "col-sm-3">			
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "task" action = "index">List of Tasks</g:link>
			</button><br>
		  </div> 
		 </div>	
		  <div class = "row">	 
		     <div class = "col-sm-3">
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "task" action = "show"> Display Tasks</g:link>
			</button><br>		  
		  </div>
		 </div>			     
          
          </div>
        </section>
  </div>
 </div>

</body>
</html>
