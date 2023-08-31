# Write your MySQL query statement below
#Select name from Customer where referee_id <> 2 or referee_id is null;
Select name from Customer where referee_id != 2 or referee_id is null;
