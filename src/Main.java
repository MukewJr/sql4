public class Main {
    public static void main(String[] args) {
        SELECT * FROM customer WHERE country LIKE 'Canada';

        SELECT DISTINCT country FROM customer;

        SELECT COUNT(id) FROM orders;

        SELECT max(total_amount) FROM orders;

        SELECT sum(quantity) FROM order_item;

        SELECT sum(total_amount) FROM orders WHERE order_date BETWEEN '2014-01-01' AND '2014-12-31';
        SELECT avg(unit_price) FROM order_item;

        SELECT AVG(total_amount) AS avg_of_total_amount, first_name FROM orders
        LEFT JOIN customer ON orders.customer_id = customer.id GROUP BY customer.first_name;

        SELECT * FROM customer WHERE country IN ('Brazil','Spain');

        SELECT * FROM orders where order_date BETWEEN '2013-01-01' AND '2013-12-31' GROUP BY
        orders.id HAVING  total_amount<100;

        SELECT * FROM customer WHERE country IN('Spain','Italy','Germany','France') ORDER BY country;

        SELECT DISTINCT customer.first_name, customer.last_name, customer.country, supplier.country
        FROM customer, supplier WHERE customer.country = supplier.country ORDER BY customer.first_name;

        SELECT * FROM customer WHERE first_name LIKE 'Jo%';

        SELECT * FROM customer WHERE first_name LIKE '%a' AND length(first_name)=4;

        SELECT country,  COUNT(*) AS all_customers FROM customer GROUP BY country;

        SELECT country,  COUNT(*) AS all_customers FROM customer GROUP BY country ORDER BY all_customers DESC ;

        SELECT sum(total_amount) AS sum_total,customer_id,COUNT(*) AS all_customer FROM orders
        GROUP BY  orders.customer_id ORDER BY  sum_total;

        SELECT sum(total_amount) AS sum_total,customer_id,COUNT(*) AS all_customer FROM orders
        GROUP BY  orders.customer_id  HAVING COUNT(customer_id)>20;

    }
}