<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Yang Wang
  Date: 16/2/1
  Time: 下午4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

  <!-- Bootstrap -->
  <link href="<c:url value="/bootstrap/css/bootstrap.min.css" />" rel="stylesheet">

  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->

  <title>登录</title>

</head>
<body class="body">

<div align="center">
  <div class="well" style="background:transparent; border: 0; width: 40%; margin: 0 20%  20px 20% ;">

    <h1 class="text-center">登录</h1>
    <c:if test="${param.failed eq 'true'}">
      <div class="col-sm-10 alert alert-danger" role="alert">
        Username , password or role is not match.
      </div>
    </c:if>
    <div>
      <!-- Tab panes -->
      <div class="tab-content">
        <div role="tabpanel" class="tab-pane active">
          <form action="<c:url value="/j_spring_security_check"/>" method="post" class="form-horizontal">
            <div class="form-group">

            </div>
            <div class="form-group">

              <div class="col-sm-12 form-group-lg">
                <input id="userName" type="text" name="name" class="form-control" placeholder="Username">
              </div>
            </div>

            <div class="form-group">

              <div class="col-sm-12 form-group-lg">
                <input id="passWord" type="password" name="password" class="form-control"
                       placeholder="Password">
              </div>
            </div>

            <div class="form-group">
              <div class="col-sm-12" align="center">
                <button type="submit" class="btn btn-primary btn-lg btn-block " id="submitBtn">Sign in</button>
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-12" align="center">
                <a href="user/create">注册</a>
                <a>忘记密码?</a>
              </div>
            </div>
          </form>
        </div>
      </div>

    </div>
  </div>
</div>
</body>
</html>
