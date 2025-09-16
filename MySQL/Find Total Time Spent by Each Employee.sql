select event_day as day , emp_id , sum(abs(in_time-out_time)) as total_time
from Employees
group by emp_id , event_day;
