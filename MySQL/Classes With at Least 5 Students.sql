Select class
from Courses
GROUP BY class
HAVING COUNT(*) >= 5;
