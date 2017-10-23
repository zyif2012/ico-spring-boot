<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Student Information</h2>
<sf:form method="POST" action="/mvc1/addStudent">
    <table>
        <tr>
            <td><sf:label path="name">Name</sf:label></td>
            <td><sf:input path="name" /></td>
        </tr>
        <tr>
            <td><sf:label path="age">Age</sf:label></td>
            <td><sf:input path="age" /></td>
        </tr>
        <tr>
            <td><sf:label path="id">id</sf:label></td>
            <td><sf:input path="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</sf:form>
</body>
</html>