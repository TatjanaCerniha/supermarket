<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Supermarket Employee Search</title>
    <asset:stylesheet src= "home.css" />
</head>
<body>
   <div class= "row">
	<h1>Supermarket Employee Search</h1>
   	<formset>
		<legend>Search for Employee</legend>
		  <table>
			<g:form action= "advResult">
			    <tr>
				<td>Full Name</td>
				<td><g:textField name="fullName" /></td>
			    </tr>
			    <tr>
				<td>Employee ID</td>
				<td><g:textField name="employeeID" /></td>
			    </tr>
			    <tr>
				<td>Tax Code</td>
				<td><g:textField name="taxCode" /></td>
			    </tr>
			    <tr>
				<td>Query Type:</td>
				<td><g:radioGroup name="qyeryType" labels = "['And', 'Or', 'Not']"
				        values= "['and', 'or', 'not']" value = "and" >
					${it.radio} ${it.label} </g:radioGroup>
				</td>
			    </tr>
			    <tr>				
				<td><g:submitButton name = "search" value = "Search" /></td>
			    </tr>

			</g:form>
		  </table>
		
	</formset>	    
  </div>
</body>
</html>
