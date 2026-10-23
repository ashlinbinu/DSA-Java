# Write your MySQL query statement below
Select x,y,z, CASE

when (((x<=0) | (y<=0)) | (z<=0)) then "No"
when (((x+y)>z) &(((x+z)>y) & ((y+z)>x)))then "Yes"
else "No" end as triangle 
from Triangle;
 