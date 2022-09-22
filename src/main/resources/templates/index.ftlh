<!DOCTYPE html>  
<html lang="en" xmlns:th="http://www.thymeleaf.org">  
    <head>
        <meta charset="UTF-8">
        <title>Goldeneye</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.min.js" integrity="sha384-ODmDIVzN+pFdexxHEHFBQH3/9/vQ9uori45z4JjnFsRydbmQbmL5t1tQ0culUzyK" crossorigin="anonymous"></script>
        <title>Email adress generator</title>
    </head>
    <body>
        <div class="container">
            <h2>Email addres generator</h2>
        </div>
        <div th:text="${spain[0]}"></div>
        <div class="container">
        <form action="#" th:action="@{/}" method="post">
            <p>Name of the Employee: <input type="text" name="name" /></p>
            <p>Surname of the Employee: <input type="text" name="surname" /></p>
            <p>Office: <input type="text" name="office" /></p>
            <p>Department: <input type="text" name="department" /></p>
            <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
        </form> 
            <div>
            </div>
        </div>
    </body>
</html>