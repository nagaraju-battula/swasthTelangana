<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
   <meta charset="utf-8">
    <title>Swasth Telangana work desk</title>
    <meta name="description" content="Aarogya telangana work desk"/>

    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">

    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/dist/js/vendor/jquery.js"></script> 
	<script type="text/javascript" src="<%=request.getContextPath()%>/resources/dist/js/app/apputils.js"></script>
	
    <!-- Loading Bootstrap -->
    <link href="<%=request.getContextPath()%>/resources/dist/css/vendor/bootstrap.min.css" rel="stylesheet">

    <!-- Loading Flat UI -->
    <link href="<%=request.getContextPath()%>/resources/dist/css/flat-ui.css" rel="stylesheet">
    <link href="<%=request.getContextPath()%>/resources/docs/assets/css/demo.css" rel="stylesheet">

    <link rel="shortcut icon" href="img/favicon.ico">
    
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <link rel="icon" href="../../../favicon.ico">
  
</head>
<body bgcolor="#edeff1">
<div class="container">
   <br>
   <div class="row demo-row">
        <div class="col-xs-12">
          <nav class="navbar navbar-inverse navbar-embossed" role="navigation">
            <div class="navbar-header">
              <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
                <span class="sr-only">Toggle navigation</span>
              </button>
              <a class="navbar-brand" href="#" onclick="submitForm('/account/backtohome.action', 'NO-DATA', 'containerdiv');">Home</a>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse-01">
              <ul class="nav navbar-nav navbar-left">
                <li><a href="#" onclick="submitForm('/account/underconstruction.action', 'NO-DATA', 'containerdiv');">Menu Item<span class="navbar-unread">1</span></a></li>
                <li class="dropdown">
                  <a href="#" class="dropdown-toggle" data-toggle="dropdown"onclick="submitForm('/account/underconstruction.action', 'NO-DATA', 'containerdiv');">Messages <b class="caret"></b></a>
                  <span class="dropdown-arrow"></span>
                  <ul class="dropdown-menu">
                    <li><a href="#">Action</a></li>
                    <li><a href="#">Another action</a></li>
                    <li><a href="#">Something else here</a></li>
                    <li class="divider"></li>
                    <li><a href="#">Separated link</a></li>
                  </ul>
                </li>
                <li><a href="#"onclick="submitForm('/account/underconstruction.action', 'NO-DATA', 'containerdiv');">About Us</a></li>
               </ul>
               <form class="navbar-form navbar-right" action="#" role="search">
                <div class="form-group">
                  <div class="input-group">
                    <span>
                      <button type="submit" class="btn" onclick="return false"><span>Welcome ${userDetails.displayName}</span></button>
                    </span>
                  </div>
                </div>
              </form>
            </div><!-- /.navbar-collapse -->
          </nav><!-- /navbar -->
        </div>
      </div> <!-- /row -->
	 
      <div class="row demo-samples">
        <div class="col-xs-4">
          <div class="todo">
            <div class="todo-search">
            <label class="todo-search-field">Select Below Operation</label>
              <!-- <input class=""  value="" placeholder="" />Select Below Operation -->
            </div>
            <ul>            
              <li class="todo-done">
                <div class="todo-icon fui-user"></div>
                <div class="todo-content">
                  <h4 class="todo-name">
                  	<a href="#" onclick="submitForm('/account/enterPatientDetails.action', 'NO-DATA', 'containerdiv');"><strong>New Patient Entry</strong></a></br>
                  </h4>	
                  	<a href="#" onclick="submitForm('/account/patientNameReportDetails.action', 'NO-DATA', 'containerdiv');"><strong>Search Patient by Name</strong></a></br>
                  	<a href="#" onclick="submitForm('/account/patientIdReportDetails.action', 'NO-DATA', 'containerdiv');"><strong>Search Patient by ID</strong></a>                    
                </div>
              </li>
              
              <li>
                <div class="todo-icon fui-eye"></div>
                <div class="todo-content">
                  <h4 class="todo-name">
                  	<a href="#" onclick="submitForm('/account/totalfinancereport.action', 'NO-DATA', 'containerdiv');"><strong>Total finance report</strong></a>
                  </h4>
                  With export excel option
                </div>
              </li>
              <li>
                <div class="todo-icon fui-list"></div>
                <div class="todo-content">
                  <h4 class="todo-name">
                    <a href="#" onclick="submitForm('/account/enterFormDetails.action', 'NO-DATA', 'containerdiv');"><strong>Create Form F</strong></a></br>
                  </h4>
                    <a href="#" onclick="submitForm('/account/formIdReportDetails.action', 'NO-DATA', 'containerdiv');"><strong>Search Form by ID</strong></a></br>
                    <a href="#" onclick="submitForm('/account/formDateReportDetails.action', 'NO-DATA', 'containerdiv');"><strong>Search Form by Date</strong></a>
                </div>
              </li>
              <li>
                <div class="todo-icon fui-eye"></div>
                <div class="todo-content">
                  <h4 class="todo-name">
                    <a href="#" onclick="submitForm('/account/enterFormDetails.action', 'NO-DATA', 'containerdiv');"><strong>Form F View</strong></a>
                  </h4>
                  Restricted by the role  
                </div>
              </li>
              <li>
                <div class="todo-icon fui-time"></div>
                <div class="todo-content">
                  <h4 class="todo-name">
                    <a href="#" onclick="submitForm('/account/accountmanagement.action', 'NO-DATA', 'containerdiv');"><strong>Account management</strong></a>
                  </h4>Can update user passwords
                </div>
              </li>
            </ul>
          </div><!-- /.todo -->
        </div><!-- /.col-xs-4 -->

        <div class="col-xs-8, col-lg-8 col-md-8">        
	        <div id="containerdiv">	          
	        </div>	       
        </div>
        <div class="col-xs-8, col-lg-8 col-md-8">
	        <div id="searchResultdiv">	        	
	        </div>	       
        </div>
      </div>
	  </div>
	</body>  
</html>