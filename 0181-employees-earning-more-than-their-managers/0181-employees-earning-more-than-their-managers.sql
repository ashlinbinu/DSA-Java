# Write your MySQL query statement below
select name as employee from employee e where salary> (Select salary from employee where id = e.managerId);