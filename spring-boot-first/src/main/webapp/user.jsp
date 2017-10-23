<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>user</title>
</head>
<body>
<h2>User Information</h2>
<sf:form method="post" action="/mvc2/addUser">
    <table>
        <tr>
            <td>
                <sf:label path="username">User Name</sf:label>
            </td>
            <td><sf:input path="username"/></td>
        </tr>
        <tr>
            <td><sf:label path="password">password</sf:label></td>
            <td><sf:password path="password"/></td>
        </tr>
        <tr>
            <td><sf:label path="favor">Favor</sf:label></td>
            <td><sf:checkboxes path="favor" items="${favorList}"/></td>
        </tr>
        <tr>
            <td><sf:label path="country">Country</sf:label></td>
            <td>
                <sf:select path="country">
                    <sf:option value="NONE" label="select"/>
                    <sf:options items="${countryList}" />
                </sf:select>
            </td>
        </tr>
        <tr>
            <td><sf:label path="skills">Country</sf:label></td>
            <td>
                <sf:select path="skills" items="${skillList}" multiple="true"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="submit"/>
            </td>
        </tr>
    </table>
</sf:form>
</body>
</html>
