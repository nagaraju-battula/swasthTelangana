<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Swasth telangana</title>
    <meta name="description"
          content="Flat UI Kit Free is a Twitter Bootstrap Framework design and Theme, this responsive framework includes a PSD and HTML version."/>

    <meta name="viewport"
          content="width=1000, initial-scale=1.0, maximum-scale=1.0">
    <link rel="shortcut icon" href="img/favicon.ico">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="<%=request.getContextPath()%>/resources/img/login/icon.png">
</head>
<body>
<div class="container" style="margin-top:40px" id="canvas" name="canvas">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <strong> Sign in to continue</strong>
                </div>
                <div class="panel-body">
                    <form role="form" method="POST" name="loginform" id="loginform" commandName="loginUser"
                          enctype="multipart/form-data">
                        <fieldset>
                            <div class="row">
                                <div class="center-block">
                                    <img class="profile-img"
                                         src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
                                         alt="">
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-12 col-md-10  col-md-offset-1 ">
                                    <div class="form-group">
                                        <div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-user"></i>
												</span>
                                            <input class="form-control" placeholder="Username" name="userName"
                                                   id="userName"
                                                   type="text" autofocus>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <div class="input-group">
												<span class="input-group-addon">
													<i class="glyphicon glyphicon-lock"></i>
												</span>
                                            <input class="form-control" placeholder="Password" name="password"
                                                   id="password"
                                                   type="password" value="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <a href="#" class="btn btn-lg btn-primary btn-block"
                                           onclick="submitForm('/account/loginsubmission.action', 'loginform', 'canvas');"
                                           value="Sign in"> Sign in</a>
                                    </div>
                                    <div class="panel-footer">
                                        <c:if test="${error != null}">
                                            <div class="alert alert-danger" role="alert">${error}</div>
                                        </c:if>
                                    </div>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/resources/dist/js/vendor/jquery-2.1.3.js"></script>
<script type="text/javascript"
        src="<%=request.getContextPath()%>/resources/dist/js/app/apputils.js"></script>
<!-- Loading Bootstrap -->
<link
        href="<%=request.getContextPath()%>/resources/dist/css/vendor/bootstrap.min.css"
        rel="stylesheet">
<link
        href="<%=request.getContextPath()%>/resources/dist/css/vendor/style.css"
        rel="stylesheet">
</body>
</html>
