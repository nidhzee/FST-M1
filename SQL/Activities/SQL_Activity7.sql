REM   Script: SQL_Activity7
REM   SQL_Activity7

select sum(purchase_amount) from orders;


select avg(purchase_amount) from orders;


select max(purchase_amount) from orders;


select min(purchase_amount) from orders;


select count(distinct salesman_id) from orders;