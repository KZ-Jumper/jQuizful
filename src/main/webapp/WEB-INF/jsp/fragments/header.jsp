<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="${pageContext.request.contextPath}">jQuizful</a>
            <ul class="nav navbar-nav">
                <c:if test="${empty userName}">
                    <li><a href="${pageContext.request.contextPath}/register">Register</a></li>
                </c:if>
            </ul>
        </div>
        <div class="navbar-collapse collapse">
            <c:choose>
                <c:when test="${empty userName}">
                    <form name='authenticationForm' role='form' method='POST' class='navbar-form navbar-right'
                          action="${pageContext.request.contextPath}/login">
                        <input type='text' id='userName' name='userName' class='form-control' placeholder='User name'>
                        <input type='password' id='password' name='password' class='form-control' placeholder='Password'>
                        <button type='submit' id='btn' class='btn btn-primary'>Log In</button>
                    </form>
                </c:when>
                <c:otherwise>
                    <form name='authenticationForm' role='form' method='POST' class='navbar-form navbar-right'
                          action="${pageContext.request.contextPath}/logout">
                        <font color='white'>Hello, <c:out value="${userName}" /> !</font>
                        <button type='submit' id='btn' class='btn btn-primary'>Log Out</button>
                    </form>
                </c:otherwise>
            </c:choose>
        </div>
    </div>
</div>