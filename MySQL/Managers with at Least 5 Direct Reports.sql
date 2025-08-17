SELECT e.name
FROM Employee AS e
JOIN Employee AS r
  ON r.managerId = e.id
GROUP BY e.id
HAVING COUNT(*) >= 5;
