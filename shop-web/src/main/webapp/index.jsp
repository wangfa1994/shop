<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>

<body>
Hello World

<form action="/user/login.htm">
        <input type="text" name="name">
        <input type="password" name="password">
    <input type="submit" value="登录">
</form>

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.12.3.js"></script>
</body>
<
</html>