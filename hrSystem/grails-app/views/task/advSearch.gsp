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
	   <formset>
		<legend>Advanced Search for Task</legend>
		<table>
	          <g:form action = "advResults">
		      <tr>
			 <td>Task name</td>
			 <td><g:textField name = "taskName" /></td>
		      </tr>
		      <tr>
			<td>Section name</td>
			<td><g:textField name = "sectionName" /></td>
		      </tr>
		        <tr>
			<td>Number of people required</td>
			<td><g:textField name = "numberOfPeople" /></td>
		      </tr>
		      <tr>
			 <td>Query Type</td>
			 <td><g:radioGroup name="queryType" labels = "['And', 'Or', 'Not']"
				        values= "['and', 'or', 'not']" value = "and" >
					${it.radio} ${it.label} 
			     </g:radioGroup>
			 </td>
		      </tr>
		      <tr>
			 <td/>
			 <td><g:submitButton name="search" value="Search" /></td>
		      </tr>
		  </g:form>
		</table>
	   </formset>
	</div>

</body>
</html>
