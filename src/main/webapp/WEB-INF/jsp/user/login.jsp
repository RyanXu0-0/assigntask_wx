<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2018/12/7
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/lib/bootstrap-3.3.7/css/bootstrap.min.css" />
    <link rel="stylesheet" href="lib/bootstrap-3.3.7/css/bootstrap-theme.min.css"/>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="lib/bootstrap-3.3.7/js/bootstrap.min.js"></script>
    <script src="js/user.js"></script>
    <title>login</title>
    <style type="text/css">
        .form-signin{
            max-width: 330px;
            padding: 15px;
            margin: 0 auto;
        }
        input{
            margin-bottom: 3px;
        }
    </style>
</head>
<body>
<div class="container">
    <form class="form-signin" role="form" >
        <h2 class="form-signin-heading">欢迎登录</h2>
        <input type="text" class="form-control" id="username" placeholder="请输入用户名"/>
        <input type="password" class="form-control" id="password" placeholder="请输入登录密码"/>
        <button id = "login_form" type="button" class="btn btn-lg btn-primary btn-block">登录</button>
    </form>
</div>

</body>
</html>