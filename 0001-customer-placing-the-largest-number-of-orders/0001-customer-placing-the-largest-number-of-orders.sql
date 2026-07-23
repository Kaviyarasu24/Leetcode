SELECT customer_number
FROM (
    SELECT customer_number,
           COUNT(*) AS counter
    FROM Orders
    GROUP BY customer_number
    ORDER BY counter DESC
) AS demo
LIMIT 1;