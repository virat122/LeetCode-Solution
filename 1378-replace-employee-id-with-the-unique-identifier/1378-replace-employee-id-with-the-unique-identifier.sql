# Write your MySQL query statement below
select o.unique_id, e.name  from  Employees e
left join 
EmployeeUNI o 
on e.id=o.id ;