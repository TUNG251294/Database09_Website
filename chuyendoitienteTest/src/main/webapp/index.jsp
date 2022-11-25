<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Chuyen doi tien te</title>
</head>
<body>
<form method="post" action="/chuyendoitiente">
    <label>Rate:
        <input type="number" value="23000" name="rate"></label><br>
    <label>USD:
        <input type="number" placeholder="input amount usd" name="usd"></label><br>
    <label>VND:
        <input type="number" placeholder="input amount vnd" name="vnd"></label><br>
    <input type="submit" value="Submit">
</form>
</body>
</html>