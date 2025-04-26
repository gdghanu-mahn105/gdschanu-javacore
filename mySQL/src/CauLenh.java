public class CauLenh {
    /*
    SELECT ....FROM....
    SELECT DISTINCT....=> return only distinct value
    WHERE filter records, extract only records that fulfill a special condition
    ORDER BY => sort the result in a ascending and descending order
        eg: SELECT * FROM Products ORDER BY Price; (ASC|DESC)
            SELECT ProductName, Price FROM Products ORDER BY ProductName, Price ASC;
            SELECT * FROM Customers ORDER BY Country,City;
    AND => if want more condition
        eg: SELECT * FROM Products WHERE PRODUCTID=2 AND PRODUCTNAME="CHANG";
    OR => one of the condition true=> true
        eg:SELECT * FROM Products WHERE PRODUCTNAME="Chais" OR CategoryID =2;
    NOT => eg: SELECT * FROM Products WHERE PRODUCTNAME= NOT "Chais" OR CategoryID =2;
    INSERT INTO
        1. INSERT INTO table_name (column1, column 23...) VALUES(value1, value23...);
        2. if want to insert into all columns, do not need to specific column_name
        INSERT INTO table_name VALUES(value1, value23...); it must be in order
    NULL => USE IS NULL OR IS NOT NULL
    UPDATE => modify existing records in table
        eg: UPDATE table_name SET column1=value1, columnN=valueN..WHERE condition;
    DELETE FROM table_name WHERE condition; it deletes all the records and keeps the table elements;
    DROP TABLE table_name; detele table completely
    SELECT TOP number FROM ... not all the database system support SELECT TOP
        eg: SELECT TOP 3 * FROM Customers;
    Mysql suport SELECT column_name(s)
        FROM table_name
        WHERE condition
        LIMIT number;
        eg: SELECT * FROM Customers ORDER BY CustomerName DESC LIMIT 3;
    SQL Aggregate Functions calculate a set of value and return single value
    SELECT MIN(column_name) FROM table_name WHERE condition;
    SELECT MAX(column_name) FROM table_name WHERE condition;
    if want a name to display we can use 'AS' eg: SELECT MIN(Price) AS SmallestPrice
        FROM Products;
    COUNT() => number of rows
        Syntax SELECT COUNT(column_name) FROM table_nameWHERE condition;
        SELECT COUNT(EmployeeID) FROM Orders WHERE EmployeeID=6;
        SELECT COUNT(ProductName) FROM Products;
        SELECT COUNT(DISTINCT Price) FROM Products;
    SELECT SUM(column_name) FROM table_name WHERE condition;
            SELECT SUM(Price) AS TongTien FROM Products;
    SELECT AVG(Column_Name) FROM Table_name WHERE condition;
        SELECT(Price) AS [gia trung binh] FROM Products;
        SELECT * FROM Products WHERE Price > (SELECT AVG(Price) FROM Products);
        SELECT * FROM Products WHERE Price > (SELECT AVG(Price) FROM Products) ORDER BY CategoryID DESC;
    LIKE Operator - is used in WHERE clause to search for a specific pattern in a column
            "...%"= represent zezo, one, or multiple characters, có thể diễn tả 2 ,
            "..._"= underscore to represent single character, không thể diễn tả số 2
            SELECT * FROM Products WHERE ProductID Like "2%; start with 2
            SELECT * FROM Products WHERE ProductID Like "%2"; end with 2
            SELECT * FROM Products WHERE ProductID Like "%2&"; contain 2
            SELECT * FROM Customers Where City LIKE "L___on";
            SELECT * FROM Customers WHERE CustomerName LIKE '_r%'; return customer that have r in the second position
            SELECT * FROM Customers WHERE City Like"L%n"; start with L and end with n
     WILDCARD % AND _ IN MYSQL
     IN() operator => allow to specific multiple values in WHERE Clause, like a shorthand of multiple OR
        SELECT * FROM Customers WHERE Country IN ("France", "UK");
        SELECT * FROM Customers WHERE Country NOT IN ("France", "UK");
        SELECT * FROM Customers WHERE CustomerID IN (SELECT CustomerID FROM Orders); lấy khách hàng mà có order
     BETWEEN
        SELECT columnName FROM table_Name WHERE columnName BETWEEN value1 AND value2;
        SELECT DISTINCT Quantity FROM Orderdetails WHERE Quantity BETWEEN 12 and 30 ORDER BY Quantity ASC;
        SELECT DISTINCT Quantity FROM Orderdetails WHERE Quantity BETWEEN 12 and 30 AND OrderdetailID IN(1,2,3,4,5,6) ORDER BY Quantity ASC;
        SELECT * FROM Products WHERE ProductName BETWEEN 'Carnarvon Tigers' AND 'Mozzarella di Giovanni' ORDER BY ProductName;
        SELECT * FROM Orders WHERE OrderDate BETWEEN #07/01/1996# AND #07/31/1996#;
        SELECT LastName, FirstName, BirthDate FROM Employees WHERE BirthDate BETWEEN #12/8/1958# AND #7/2/1969# ORDER BY BirthDate ;
        we can at NOT , like NOT BETWEEN;
        SELECT * FROM Orders WHERE OrderDate BETWEEN '1996-07-01' AND '1996-07-31';
    SQL Alias => use to make a temporary name for the column, table
            it just appears in the duration of this query
            it is AS keyword
            AS is Optional
            SELECT column_name AS alias_name FROM table_name; for column
            SELECT column_name  FROM table_name AS alias_name; for table
            SELECT ProductName AS [this is my product]FROM Products; use [] when alias name have space characters;
            SELECT CustomerName, Address + ', ' + PostalCode + ' ' + City + ', ' + Country AS Address FROM Customers;
            to get this in mysql SELECT CustomerName, CONCAT(Address,', ',PostalCode,', ',City,', ',Country) AS Address
                FROM Customers;
            SELECT o.OrderID, o.OrderDate, c.CustomerName
            FROM Customers AS c, Orders AS o
            WHERE c.CustomerName='Around the Horn' AND c.CustomerID=o.CustomerID; // Make the query shorter
            SELECT o.OrderID, o.OrderDate, o.CustomerName FROM Orders AS o, Customers AS c WHERE c.CustomerName="Richter Supermarkt" AND c.CustomerID =o.CustomerID;





     */
}
