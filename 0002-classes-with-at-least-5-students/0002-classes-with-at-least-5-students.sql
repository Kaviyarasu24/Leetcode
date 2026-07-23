# Write your MySQL query statement below
select class from (
    select student,class,count(student) as counter from courses group by class 
) as  hightable where counter>=5