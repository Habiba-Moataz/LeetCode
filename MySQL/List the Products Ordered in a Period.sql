SELECT Products.product_name, SUM(Orders.unit) as unit
FROM Products
LEFT JOIN Orders
  ON Orders.product_id = Products.product_id
WHERE Orders.order_date LIKE '2020-02-%'
GROUP BY Products.product_id
HAVING SUM(Orders.unit) >= 100;
