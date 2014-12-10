<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css"/>
    <meta name="layout" content="bootstrap">
    <title>Login</title>
</head>
<body>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<div class="panel panel-primary">
<div class="panel-heading">Library Management</div>
    <div class="panel-body">
        <form class="form-horizontal" role="form" action="authenticate" method="post">
            <g:if test="${flash.message}">
                <div class="alert alert-warning alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert">
                        <span aria-hidden="true">&times;</span>
                        <span class="sr-only">Close</span>
                    </button>
                    <strong> Warning!</strong>${flash.message}
                </div>
            </g:if>
            <div class="form-group">
                <label for="userName" class="col-sm-2 control-label">User Name:</label>
                <div class="col-sm-5">
                    <input type="text" class="form-control" name="userName" id="userName" placeholder="userName"/>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">Password:</label>
                <div class="col-sm-5">
                    <input type="password" name="password" class="form-control" id="password" placeholder="password"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2  col-sm-5">
                    <button type="submit" class="btn btn-default">Sign in</button>
                    <a href="registration" class="btn btn-default">Don't Have an account Yet? Click here to register</a>
                </div>
            </div>
        </form>
    </div>
   <div class="panel-footer"></div>
</div>
</body>
</html>