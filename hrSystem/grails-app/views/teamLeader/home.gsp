<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket System | HOME page</title>
	<asset:stylesheet src = "home.css" />
</head>
<body>
   </div class = "container">
    <div class = "row">
        <section>         
            <div id="controllers" role="navigation">
                <h2>Available Choices:</h2>
		<!-- <button type = "button button1" class= "btn btn-success">  </button><br>  -->
			    <g:link controller = "task" action = "advSearch"> Search Tasks</g:link>
			
		<div class = "row">	
		  <div class = "col-sm-2">		
			<button type = "button" class= "btn btn-success">
			    <g:link controller = "task" action = "create"> Create a Task</g:link>
			</button><br>
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "task" action = "show"> Show all Tasks</g:link>
			</button><br> 
		  </div>	
		  <div class = "col-sm-2">				
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "employee" action = "index"> Display Employees</g:link>
			</button><br>
		  </div>
		  <div class = "col-sm-2">			
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "team" action = "index">Display Teams</g:link>
			</button><br>
		  </div>
		  <div class = "col-sm-2">			
			<button type = "button " class= "btn btn-success">
			    <g:link controller = "task" action = "index">Display list of Tasks(index)</g:link>
			</button><br>
		  </div>
			     
             </div>
          </div>
        </section>
  </div>
 </div>

</body>
</html>
