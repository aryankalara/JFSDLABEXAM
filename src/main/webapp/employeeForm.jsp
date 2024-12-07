<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h1>Employee Form</h1>
    <form action="/SpringMVC/saveEmployee" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br><br>

        <label for="gender">Gender:</label>
        <input type="radio" id="male" name="gender" value="Male"> Male
        <input type="radio" id="female" name="gender" value="Female"> Female<br><br>

        <label for="salary">Salary:</label>
        <input type="text" id="salary" name="salary"><br><br>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
