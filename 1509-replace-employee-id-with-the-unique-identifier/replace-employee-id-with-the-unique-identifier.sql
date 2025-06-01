SELECT euni.unique_id, e.name
FROM Employees AS e
LEFT JOIN EmployeeUNI as euni ON e.id = euni.id;
