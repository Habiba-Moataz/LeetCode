SELECT 
    name,
    SUM(Transactions.amount) AS balance 
FROM Users
left join Transactions
on Users.account = Transactions.account
GROUP BY Users.account
Having balance  > 10000;
