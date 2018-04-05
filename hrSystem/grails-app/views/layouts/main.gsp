<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>

    
	<div class= "row">
		<asset:image src = "supermarket.jpg"  align= "center"  width = "900px" height="300" />
		<g:loginToggle />
	</div>
	<!----------------------------- nav bar----------------------------->
	<!-- <nav class="navbar navbar-default">
     <div class="container-fluid">
     <!-- <div class="navbar-header">
       <a class="navbar-brand" href="/">Supermarket</a>
     </div> -->
   <!-- <ul class="nav navbar-nav"> -->
    <!-- <li class="active"><a href='${createLink(controller:'home')}'>Home</a></li> -->
     <!-- <li>  <g:link controller = "manager" action = "home">Search Employee</g:link></li> 
	
    </ul>
  </div>
</nav> -->

    <g:layoutBody/>

    <div class="footer" role="contentinfo"></div>

    <div id="spinner" class="spinner" style="display:none;">
        <g:message code="spinner.alt" default="Loading&hellip;"/>
    </div>

    <asset:javascript src="application.js"/>

</body>
</html>
