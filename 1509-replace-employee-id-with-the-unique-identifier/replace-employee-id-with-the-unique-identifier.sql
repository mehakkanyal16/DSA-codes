SELECT EmployeeUNI.unique_id, Employees.name
FROM EmployeeS
LEFT JOIN EmployeeUNI ON Employees.id = EmployeeUNI.id;
