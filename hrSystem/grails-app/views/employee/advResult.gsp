<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket Employee Search</title>
    <asset:stylesheet src= "home.css" />
</head>
<body>
   <div class= "row">
	<h1Supermarket Employee Search</h1>
   	
		<h3>Results</h3>
		 <p>Searched for employee matching <em>${term}</em>.
			Found<strong>${employees.size()}</strong> employees.
		</p>
		<ul>
			<g:each var = "employee" in = "${employees}">
			  <li>
			    <g:link controller = "employee" action = "show" id="${employee.id}">${employee.name}<g:link>
			  </li>
			</g:each>
		</ul>
		<g:link action = 'advSearch'>Search Again</g:link>
		
    
  </div>
</body>
</html>
