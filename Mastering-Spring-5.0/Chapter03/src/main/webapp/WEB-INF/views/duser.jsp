<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<H1>Create User</H1>
<form:form method="post" modelAttribute="duser">
    <div>
        <form:label path="name">name</form:label>
        <form:input path="name" type="text"/>
    </div>
    <div>
        <form:label path="birth">birth</form:label>
        <form:input path="birth" type="text"/>
    </div>

    <input class="btn btn-success" type="submit" value="Submit" />

</form:form>