public class CauLenh_2 {
    /*
    JOIN
    - JOIN clause is used to combine rows from two or more tables, based on related column between them
    eg: SELECT c.CustomerID, o.OrderDate, c.CustomerName,c.Country
        FROM Customers AS c INNER JOIN Orders AS o ON c.CustomerID=o.CustomerID;

     - (INNER) JOIN: Return records that matching value in both tables
     - LEFT (OUTER) JOIN: return all record from the left table and the matching records from the right table
        nếu value bên trái có mà bên phải không có thì bên phải là null
     - RIGHT (OUTER) JOIN: return all record from the right table and the matching recoreds from the left table
     - FULL (OUTER) JOIN: Return all records when there is a match in ether left or right table

     SELECT Customers.CustomerName, Orders.OrderID
     FROM Customers
     LEFT JOIN Orders
     ON Customers.CustomerID=Orders.CustomerID
     ORDER BY Customers.CustomerName;

     SELECT Products.ProductID, Products.ProductName, OrderDetails.OrderID, OrderDetails.Quantity
     FROM Products LEFT JOIN OrderDetails
     ON Products.ProductID=OrderDetails.ProductID;
     */
}
