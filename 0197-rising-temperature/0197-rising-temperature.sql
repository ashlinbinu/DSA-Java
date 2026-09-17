# Write your MySQL query statement below
select t2.id from weather t cross join weather t2  where DATEDIFF(t2.recorddate,t.recorddate) =1 AND t.temperature<t2.temperature;