# Write your MySQL query statement below
Select MAX(salary) as secondhighestsalary from employee where salary<(select MAX(SALARY) from employee);