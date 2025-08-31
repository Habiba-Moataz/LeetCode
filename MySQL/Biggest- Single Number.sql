select MAX(num) as num
from MyNumbers
where num in (
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(*) = 1
);
