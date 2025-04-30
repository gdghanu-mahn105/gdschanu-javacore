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

     SELF JOIN => table is joined with itself
     SELECT A.CustomerName, B.CustomerName, A.City FROM Customers A, Customers B
     WHERE A.CustomerID <> B.CustomerID AND A.City=B.City
     ORDER BY A.City DESC;
     <> // khác


     UNION => is used to combine the result-set of two or more select statement
     - every SELECT statement must have same number of columns, and same data-type, same order
      Syntax  : SELECT Column_name(s) FROM table1
                UNION (ALL- dont care duplicate)
                SELECT Column_name(s) FROM table2
          SELECT Address, ContactName FROM Customers UNION SELECT Address,ContactName From Suppliers;

          SELECT City, Country FROM  Customers
          WHERE Country='Germany'
          UNION
          SELECT City, Country FROM Suppliers
          WHERE Country='Germany'
          ORDER BY City;


     GROUP BY => group rows that have same values into sumary row eg: file the number of orders which shippers recieved
     often use with aggregate functions to group the result-set by one or more columns.
     Syntax: SELECT column_name(s)
             FROM table_name
             WHERE condition
             GROUP BY column_name(s)
             ORDER BY column_name(s);
      Eg: SELECT COUNT(CustomerID), Country
          FROM Customers
          GROUP BY Country; // the number of customer in each country

          SELECT Shippers.ShipperName, COUNT(Orders.OrderID) AS NUMOFORDERs FROM ORDER
          LEFT JOIN Shippers ON Orders.ShipperID=Shippers.ShipperID
          GROUP BY ShipperName;

          SELECT COUNT(o.OrderID) as [Number of orders], p.ProductName
          FROM OrderDetails o LEFT JOIN Products p
          ON o.ProductID= p.ProductID
          GROUP BY p.ProductName
          ORDER BY COUNT(o.OrderID) DESC;

      HAVING is used because WHERE clause can be used with aggregate functions

      SELECT COUNT(CustomerID), Country FROM Customers GROUP BY Country HAVING COUNT(CustomerID) >5;

      SELECT Employees.LastName, COUNT(Orders.OrderID)
      FROM Orders INNER JOIN Employees
      ON Orders.EmployeeID=Employees.EmployeeID
      GROUP BY LastName
      HAVING COUNT(Orders.OrderID)<10;
        =>> we can not use WHERE with aggregate functions because WHERE filters rows before the aggregation orccurs






     */
}
