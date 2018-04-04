<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket Employee Search</title>
    <asset:stylesheet src= "home.css" />
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />	
</head>
<body>
  <div class="row">
	<h1>Supermarket Mego Employment System</h1>
	<h3>Advanced Results</h3>
	<p>Searched for employees matching<em>${term}</em>. 
		Found <strong>${employees.size()}</strong>employees.
	</p>
	    <ul>
		<g:each var="employee" in="${employees}">
		   <li>
		      <g:link controller="employee" action="show" id="${employee.id}"> 
				${employee.fullName}</g:link> 		   	  
		   </li>
		</g:each>
	    </ul>
	    <g:link action= 'advSearch'>Search again</g:link>	  
  </div>
</body> 
</html>
