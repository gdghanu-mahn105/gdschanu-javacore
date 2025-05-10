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

     EXISTS operator => test for the existance of any record in a subquery, return TRUE of the subquery returns one or more records
     Syntax:
         SELECT column_name FROM table_name
         WHERE EXISTS ( SELECT column_name FROM table_name WHERE CONDITION)
      SELECT SupplierName
      FROM Suppliers
      WHERE EXISTS (SELECT ProductName FROM Products WHERE Products.supplierID=Suppliers.supplierID AND Price <20);

      ANY and ALL
         ANY => return a boolean value as results, true if any or subquery values meet the condition
         Syntax:
         SELECT Column_name(s)
         FROM Table_name
         WHERE column_name operator(=, <>, !=, >, >=, <, or <=) ANY/ALL (Subquery)
         SELECT ProductName
         FROM Products
         WHERE ProductID =ANY(SELECT ProductID FROM OrderDetails WHERE Quantity=10);

     ALL => SELECT ALL ProductName FROM Products WHERE TRUE;

     SELECT INTO => Copy data from one table into a new table
     Syntax: SELECT Column1,Column...
             INTO newtable [IN externalDB]
             FROM oldtable WHERE condition;

      INSERT INTO => copy data from one table and inserts it into another table
      Syntax:
      INSERT INTO table2 (column1,column2...)
      SELECT col1, col2, col3....
      FROM Table1 WHERE condition;

      CASE expression => goes through conditions and returns a value when the first condition is met.
      when condition is TRUE, it will stop reading and return result
      if no condition are TRUE, it returns the value in the ELSE clause
      Syntax:
      CASE
        WHEN condition1 THEN result1
        WHEN condition2 THEN result2
        WHEN condition3 THEN result3
        WHEN condition4 THEN result4
        ELSE result
      END;
      SELECT Quantity, ProductID, CASE
        WHEN Quantity >20 THEN'The quantity is over 20'
        WHEN Quantity <20 THEN 'The quantity is less than 20'
        ELSE 'the quantity is 20'
        END AS CheckSoLuong
        FROM Orderdetails;

      NUlL Functions
      IFNULL(), ISNULL(), COALESCE(), and NVL()
      IFNULL and COALESCE are used for MySQL
      ISNULL,COALSECE -> SQL Server, MS Access
      NVL,COALESCE -> Oracle
      use like this: IFNULL(Column,alternative-value), check if value of this column is null, then return alternative value


      Stored Procedures
      syntax:
      CREATE PROCEDURE procedure_Name
      AS
      SQL_statement
      GO;
      to execute it
      EXEC procedure_Name

      we can pass parameter(s), therefore the stored statement can act based on the parameter
      eg:
      CREATE PROCEDURE SelectAllCustomers @City nvarchar(30)      You can pass multiple parameters
      AS
      SELECT * FROM Customers WHERE City=@City
      GO;

      EXEC SelectAllCustomers @City='London'


     Comment in SQL use '--' to single line
                   multiple-line like /*     * /
     */

}
