<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <link rel="stylesheet" type="text/css" href="../../resources/css/bootstrap.css">
        <script type="text/javascript" src="../../resources/js/jquery-1.11.3.js"></script>
        <script type="text/javascript" src="../../resources/js/bootstrap.js"></script>
    </head>

    <body>
        <div class="container">

            <c:url var="home" value="/" />
            <div class="col-md-4">
                <a href="${home}" class="btn btn-default">Home</a>
            </div>
            <div class="col-md-4">
                <form name="form" role="form" method="POST" action="${pageContext.request.contextPath}/register">
                    <center>
                        <h2>Please, register!</h2>
                    </center>

                    <input type="text" id="userName" name="userName" class="form-control" placeholder="User name">
                    <input type="email" id="email" name="email" class="form-control" placeholder="Email address">
                    <select id="gender" name="gender">
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                    </select>
                    <input type="password" id="password" name="password" class="form-control" placeholder="Password">
                    <input type="password" id="password2" name="password2" class="form-control" placeholder="Repeat password">
                    <center>
                        <input type="submit" id="regBtn" class="btn btn-primary" value="Register">
                    </center>
                </form>
            </div>
            <div class="col-md-4"></div>

        </div>
    </body>
</html>
