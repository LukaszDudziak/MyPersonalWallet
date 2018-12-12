
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: pudziak_srudziak
  Date: 12.12.18
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" modelAttribute="source">
    Source's name:
    <form:input path="name" type="text" id="nameId"/><br>
    Source's description:
    <form:input path="description" type="text" id="descriptionId"/>

</form:form>

</body>
</html>
