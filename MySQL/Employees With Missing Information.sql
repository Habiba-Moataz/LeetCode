Select Employees.employee_id 
from Employees
left join Salaries 
on Employees.employee_id = Salaries.employee_id
where Salaries.employee_id is null

union

Select Salaries.employee_id
from Employees
right join Salaries 
on Employees.employee_id = Salaries.employee_id
where Employees.employee_id is null

ORDER BY employee_id ASC;
