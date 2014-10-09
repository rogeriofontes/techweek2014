<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form action="<c:url value='/person/add'/>" method="post">
    <input name="person.name" />
    <input type="submit" />
</form>