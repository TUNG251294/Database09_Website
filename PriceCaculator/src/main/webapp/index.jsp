<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Price Caculator</title>
</head>
<body>
<h1>ORDER</h1>
<form method="post" action="/priceCalculator">
    <div>
        <div>
            <p>Product</p>
            <select name="product">
                <option value="Cocacola">Cocacola</option>
                <option value="Pepsi">Pepsi</option>
                <option value="Fanta">Fanta</option>
                <option value="7Up">7Up</option>
            </select>
        </div>
        <div>
            <p>Quantity</p>
            <input type="number" name="quantity" placeholder="enter product quantity">
        </div>
        <input type="submit" value="Tính tiền">
    </div>
</form>
</body>
</html>