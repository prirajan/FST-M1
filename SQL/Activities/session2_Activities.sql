---session 2 activities 

CREATE TABLE salesman(
salesman_id int NOT NULL,
salesman_name varchar(32),
salesman_city varchar(32),
commission int);

describe salesman;

INSERT ALL
       INTO salesman VALUES(5001,'James Hoog', 'New York', 15)
       INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
       INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
       INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
       INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
       INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 fROM DUAL;

select * from salesman;


-- Create a table named orders
create table orders(
    order_no int primary key, purchase_amount float, order_date date,
    customer_id int, salesman_id int);

-- Add values to the table
INSERT ALL
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005)
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002)
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001)
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001)
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006)
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003)
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002)
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007)
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001)
SELECT 1 FROM DUAL;

select * from orders;

--Activity7
--SQL statement to find the total purchase amount of all orders.
select sum(purchase_amount) from orders;
--SQL statement to find the average purchase amount of all orders.
SELECT AVG(purchase_amount) from orders;
--SQL statement to get the maximum purchase amount of all the orders.
SELECT Max(purchase_amount) from orders;

--SQL statement to get the minimum purchase amount of all the orders.
SELECT MIN(purchase_amount) from orders;
--SQL statement to find the number of salesmen listed in the table.
SELECT count(salesman_id) from orders;

--Activity8

-- to find the highest purchase amount ordered by the each customer with their ID and highest purchase amount.
select distinct customer_id, MAX(purchase_amount)  from orders Group by customer_id ;

-- Write an SQL statement to find the highest purchase amount on '2012-08-17' for each salesman with their ID.
select distinct(salesman_id), MAX(purchase_amount)  from orders where order_Date = to_date('2012/08/17', 'YYYY/MM/DD')Group by salesman_id  ;

--SQL statement to find the highest purchase amount with their ID and order date, for only those customers 
--who have a higher purchase amount within the list 2030, 3450, 5760, and 6000.
select customer_id, order_Date,  MAX(purchase_amount)  from orders Group by customer_id,order_Date  having max(purchase_amount) 
in (2030, 3450, 5760, 6000) ;



--Activity 9 

-- Create the customers table
create table customers (
    customer_id int primary key, customer_name varchar(32),
    city varchar(20), grade int, salesman_id int);

-- Insert values into it
INSERT ALL
    INTO customers VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
    INTO customers VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
    INTO customers VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
    INTO customers VALUES (3008, 'Julian Green', 'London', 300, 5002)
    INTO customers VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
    INTO customers VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
    INTO customers VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
    INTO customers VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;

Select * from customers;
select * from salesman;

-- Write an SQL statement to know which salesman are working for which customer

select c.customer_name, c.city,s.salesman_name from customers c INNER JOIN salesman s ON c.salesman_id = s.salesman_id;

--to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.

select c.customer_name,s.salesman_name,s.commission from customers c INNER JOIN salesman s ON 
c.salesman_id = s.salesman_id where s.commission >12;

-- to find the details of a order i.e. order number, order date, amount of order, which customer
--gives the order and which salesman works for that customer and commission rate he gets for an order.

select o.order_no, o.order_date,o.purchase_amount,c.customer_name,c.grade,s.salesman_name,s.commission from orders o 
INNER JOIN customers c ON o.customer_id =c.customer_id
INNER JOIN Salesman s ON o.salesman_id =s.salesman_id;


--Activity10

-- query to find all the orders issued against the salesman who may works for customer whose id is 3007.

select * from orders where customer_id = 3007;

--query to find all orders attributed to a salesman in New York.

select * from orders  where salesman_id in (select salesman_id from salesman  where salesman_city = 'New York'); 


-- query to count the customers with grades above New York's average.

select grade, count(*) from customers group by grade having grade >(select avg(grade) from customers where city = 'New York');


--  query to extract the data from the orders table for those salesman who earned the maximum commission

select * from orders where salesman_id in (select salesman_id from salesman where commission =(select max(commission) from salesman));


-- a query that produces the name and number of each salesman and each customer
--with more than one current order. Put the results in alphabetical order
SELECT customer_id, customer_name FROM customers a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.customer_id = b.customer_id)
UNION
SELECT salesman_id, salesman_name FROM salesman a
WHERE 1<(SELECT COUNT(*) FROM orders b WHERE a.salesman_id = b.salesman_id)
ORDER BY customer_name;

--  query to make a report of which salesman produce the largest and smallest orders on each date.
SELECT a.salesman_id, a.salesman_name, order_no, 'highest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MAX(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);
UNION
SELECT a.salesman_id, salesman_name, order_no, 'lowest on', order_date FROM salesman a, orders b
WHERE a.salesman_id=b.salesman_id
AND b.purchase_amount=(SELECT MIN(purchase_amount) FROM orders c WHERE c.order_date = b.order_date);


































