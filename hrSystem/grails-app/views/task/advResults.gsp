<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket System | Advanced Search</title>
    <asset:stylesheet src = "home.css" />
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
	<div class= "row">
	   <h1>Supermarket Mego System</h1>	  
		<h3>Advanced Results</h3>
	  <!-- 	<p>Searched ${totalTasks} records for task matching<em>${term}</em>. -->
		<p>Searched for task matching<em>${term}</em>.
		    Found <strong>${tasks.size()}</strong>tasks.</p>
		  <ul>
		     <g:each var="task" in="${tasks}">
		     <li>
			<g:link controller="task" action="show" id="${task.id}">${task.taskName}</g:link>
			
	             </li>
		     </g:each>
		  </ul>
		   <g:link action="advSearch">Search Again</g:link>	   
	</div>
</body>
</html>
