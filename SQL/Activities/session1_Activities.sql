--Activity 1 & 2

CREATE TABLE salesman(
salesman_id int NOT NULL,
salesman_name varchar(32),
salesman_city varchar(32),
commission int);

Describe salesman;


INSERT INTO salesman
VALUES (5001,'James Hoog', 'New York', 15);


SELECT * FROM salesman;

INSERT ALL
       VINTO salesmanALUES (5001,'James Hoog', 'New York', 15);
       INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13)
       INTO salesman VALUES(5005, 'Pit Alex', 'London', 11)
       INTO salesman VALUES(5006, 'McLyon', 'Paris', 14)
       INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13)
       INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12)
SELECT 1 fROM DUAL;


DELETE Salesman where salesman_id = '5005';
 
-- Activity 3
 SELECT salesman_id,salesman_city FROM salesman where salesman_city='Paris';
 
 SELECT salesman_id,commission FROM salesman where salesman_name='Paul Adam';   
 

 
 --Activity4
 
 ALTER TABLE salesman
 ADD (grade int);
 
 UPDATE salesman SET grade = 100 ;
 
 SELECT * FROM salesman;
 
 --Activity5
 UPDATE salesman SET grade = 200 where salesman_city='Rome' ;
 UPDATE salesman SET grade = 300 where salesman_name='James Hoog' ;
 UPDATE salesman SET salesman_name= 'Pierre' where salesman_name='McLyon' ;
  SELECT * FROM salesman;
 --
 --Activity6- predata
 
 
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



--Activity 6
-- Get all salesman ids without any repeated values
SELECT DISTINCT salesman_id from orders;

-- Display the order number ordered by date in ascending order
SELECT order_no,order_date FROM  orders ORDER BY order_date, ;

-- Display the order number ordered by purchase amount in descending order
SELECT order_no,purchase_amount FROM  orders  ORDER BY purchase_amount DESC;

-- Display the full data of orders that have purchase amount less than 500.
SELECT * FROM orders where purchase_amount<500;

-- Display the full data of orders that have purchase amount between 1000 and 2000.
SELECT * FROM orders where purchase_amount BETWEEN 1000 AND 2000;
