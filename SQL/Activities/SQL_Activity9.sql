REM   Script: SQL_Activity9
REM   SQL_Activity9

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);


select a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
inner join salesman b on a.salesman_id=b.salesman_id;

select a.customer_name, a.city, a.grade, b.name AS "Salesman", b.city from customers a 
left outer join salesman b on a.salesman_id=b.salesman_id WHERE a.grade<300 
order by a.customer_id;

select a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
inner join salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;

select a.order_no, a.order_date, a.purchase_amount, b.customer_name AS "Customer Name", b.grade, c.name AS "Salesman", c.commission FROM orders a 
inner join customers b ON a.customer_id=b.customer_id 
inner join salesman c ON a.salesman_id=c.salesman_id;

