Create database Employees_DB;
Show databases;

select database();

use Employees_DB;
 
CREATE table Emp(
emp_id INT primary KEY,
emp_name varchar (80),
department varchar(100),
salary decimal(10, 2),
email varchar(200),
joining_date DATE
);

INSERT INTO Emp(emp_id, emp_name, department, salary, email, joining_date) values (1015, 'shanu', 'IT', 60000, 'shanu@gmail.com', '2026-06-22'),
(1012, 'shanu', 'IT', 60000, 'shanu@gmail.com', '2026-06-22'),
(1013, 'shanu', 'IT', 60000, 'shanu@gmail.com', '2026-06-22'),
(1014, 'shanu', 'IT', 60000, 'shanu@gmail.com', '2026-06-22');

select* from emp;

-- Fetch all employees in IT department
SELECT Emp_id, Emp_name, salary, email, department, joining_date
FROM Emp
WHERE department = 'IT';


-- Increase salary by 10% for employee 1015
UPDATE Emp
SET salary = salary * 1.10
WHERE Emp_id = 1015;

SELECT Emp_id, Emp_name, salary FROM Emp WHERE Emp_id = 1015;


-- Delete employee who resigned
DELETE FROM Emp
WHERE Emp_id = 1014;

select* from emp;

-- List employees ordered by salary (highest first)
SELECT Emp_id, Emp_name, salary, department
FROM Emp
ORDER BY salary DESC;


-- Fetch top 2 highest paid employees
SELECT Emp_id, Emp_name, salary
FROM Emp
ORDER BY salary DESC
LIMIT 2;


-- Count total employees in the table
SELECT COUNT(*) AS total_employees
FROM Emp;


-- Calculate average salary of all employees
SELECT AVG(salary) AS average_salary
FROM Emp;


-- Find highest and lowest salary
SELECT MAX(salary) AS highest_salary,
       MIN(salary) AS lowest_salary
FROM Emp;

-- Group employees by department and count them
SELECT department, COUNT(*) AS dept_count
FROM Emp
GROUP BY department;



-- Show departments with more than 2 employees
SELECT department, COUNT(*) AS dept_count
FROM Emp
GROUP BY department
HAVING COUNT(*) > 2;


-- Find employees with missing email
SELECT Emp_id, Emp_name, department
FROM Emp
WHERE email IS NULL;


-- Fetch all employees from IT department
SELECT * FROM Emp WHERE department = 'IT';

-- Display employees sorted by highest salary
SELECT * FROM Emp ORDER BY salary DESC;

-- Fetch the top 2 highest-paid employees
SELECT * FROM Emp ORDER BY salary DESC LIMIT 2;

-- Find employees whose names start with 'R'
SELECT * FROM Emp WHERE Emp_name LIKE 'R%';

-- Find employees whose salary is between 40000 and 60000
SELECT * FROM Emp WHERE salary BETWEEN 40000 AND 60000;

-- Fetch employees belonging to HR and IT departments
SELECT * FROM Emp WHERE department IN ('HR', 'IT');


-- Update salary for employees in Testing department
SET SQL_SAFE_UPDATES = 0;
 
UPDATE emp
SET salary = salary * 1.10
WHERE department = 'IT';

select * from emp;
 
SET SQL_SAFE_UPDATES = 1;
 -- safe update lock and unlock with this query
 

-- Delete an employee who resigned (example: Emp_id = 1014)
DELETE FROM Emp WHERE Emp_id = 1014;

-- Delete employees having NULL email IDs
DELETE FROM Emp WHERE email IS NULL;


-- Count total employees
SELECT COUNT(*) AS total_employees FROM Emp;

-- Calculate average salary
SELECT AVG(salary) AS average_salary FROM Emp;

-- Find highest and lowest salary
SELECT MAX(salary) AS highest_salary, MIN(salary) AS lowest_salary FROM Emp;

-- Count employees department-wise
SELECT department, COUNT(*) AS dept_count FROM Emp GROUP BY department;

-- Display departments having more than one employee
SELECT department, COUNT(*) AS dept_count
FROM Emp GROUP BY department HAVING COUNT(*) > 1;

-- Add a new column mobile_number
ALTER TABLE Emp ADD COLUMN mobile_number VARCHAR(15);



-- Rename column emp_name to employee_name
ALTER TABLE Emp CHANGE emp_name employee_name VARCHAR(50);

-- Remove mobile_number column
ALTER TABLE Emp DROP COLUMN mobile_number;

select * from emp;

-- Delete all records but keep table structure
TRUNCATE TABLE Emp;

-- Permanently delete Employees table
DROP TABLE Emp;




-- Find employees earning more than average salary
SELECT Emp_name, salary
FROM Emp
WHERE salary > (SELECT AVG(salary) FROM Emp);



 -- Find duplicate email records
SELECT email, COUNT(*) AS duplicate_count
FROM Emp
GROUP BY email HAVING COUNT(*) > 1;

SELECT * FROM Emp;

-- Create backup of Employees table
CREATE TABLE Emp_backup AS SELECT * FROM Emp;


-- Create Dept table
CREATE TABLE Dept (
    dept_id VARCHAR(10) PRIMARY KEY,
    dept_name VARCHAR(50),
    location VARCHAR(50)
);

-- Insert sample departments
INSERT INTO Dept (dept_id, dept_name, location) VALUES
('IT', 'Information Technology', 'Bangalore'),
('HR', 'Human Resources', 'Delhi'),
('FIN', 'Finance', 'Mumbai'),
('TEST', 'Testing', 'Hyderabad');


SELECT e.Emp_name, d.dept_name
FROM Emp e
JOIN Dept d ON e.department = d.dept_id;

SELECT e.Emp_id, e.Emp_name, e.salary, d.dept_name, d.location
FROM Emp e
INNER JOIN Dept d ON e.department = d.dept_id;

SELECT e.Emp_id, e.Emp_name, e.salary, d.dept_name
FROM Emp e
LEFT JOIN Dept d ON e.department = d.dept_id;

SELECT e.Emp_id, e.Emp_name, d.dept_name
FROM Emp e
RIGHT JOIN Dept d ON e.department = d.dept_id;

SELECT e.Emp_id, e.Emp_name, d.dept_name
FROM Emp e
LEFT JOIN Dept d ON e.department = d.dept_id
UNION
SELECT e.Emp_id, e.Emp_name, d.dept_name
FROM Emp e
RIGHT JOIN Dept d ON e.department = d.dept_id;


SELECT d.dept_name, AVG(e.salary) AS avg_salary
FROM Emp e
JOIN Dept d ON e.department = d.dept_id
GROUP BY d.dept_name;


SELECT d.dept_name, AVG(e.salary) AS avg_salary
FROM Emp e
JOIN Dept d ON e.department = d.dept_id
GROUP BY d.dept_name;


SELECT e.Emp_id, e.Emp_name, d.dept_name
FROM Emp e
JOIN Dept d ON e.department = d.dept_id
WHERE e.department IN (
    SELECT department
    FROM Emp
    GROUP BY department
    HAVING COUNT(*) > 2
);


SELECT e.Emp_id, e.Emp_name, d.dept_name, d.location
FROM Emp e
JOIN Dept d ON e.department = d.dept_id
WHERE d.location = 'Delhi';


SELECT d.dept_id, d.dept_name
FROM Dept d
WHERE d.dept_id NOT IN (
    SELECT DISTINCT department FROM Emp
);

SELECT e.Emp_id, e.Emp_name, e.salary, d.dept_name
FROM Emp e
JOIN Dept d ON e.department = d.dept_id
WHERE e.salary > (SELECT AVG(salary) FROM Emp);



SELECT Emp_name, email
FROM emp
WHERE status = 'ACTIVE' AND last_login IS NULL; 
  
  -- not in table status and last login


SELECT c.customer_name, SUM(o.order_amount) AS total_amount
FROM customers c
JOIN orders o ON c.customer_id = o.customer_id
GROUP BY c.customer_name
HAVING SUM(o.order_amount) > 50000;


SELECT Emp_name, salary
FROM emp
WHERE salary > (SELECT AVG(salary) FROM emp)
ORDER BY salary DESC
LIMIT 3;


SELECT department, COUNT(*) AS emp_count
FROM emp
GROUP BY department
HAVING COUNT(*) > 5;


SELECT o.order_id
FROM orders o
LEFT JOIN customers c ON o.customer_id = c.customer_id
WHERE c.customer_id IS NULL;


SELECT emp_id, emp_name, department, joining_date
FROM emp
WHERE YEAR(joining_date) = 2026
ORDER BY joining_date DESC
LIMIT 2;


SELECT email, COUNT(*) AS duplicate_count
FROM emp
GROUP BY email
HAVING COUNT(*) > 1;


-- LEFT JOIN part
SELECT e.Emp_id, e.Emp_name, e.salary, d.dept_name, d.location
FROM Emp e
LEFT JOIN Dept d ON e.department = d.dept_id

UNION

-- RIGHT JOIN part
SELECT e.Emp_id, e.Emp_name, e.salary, d.dept_name, d.location
FROM Emp e
RIGHT JOIN Dept d ON e.department = d.dept_id;

SELECT e.Emp_id, e.Emp_name, e.salary, d.dept_name, d.location
FROM Emp e
FULL OUTER JOIN Dept d
ON e.department = d.dept_id;

 SELECT e1.Emp_name AS Employee1, e2.Emp_name AS Employee2, e1.salary
FROM Emp e1
JOIN Emp e2 ON e1.salary = e2.salary
WHERE e1.Emp_id < e2.Emp_id;


SELECT e1.Emp_id AS Emp1_ID, e1.Emp_name AS Emp1_Name,
       e2.Emp_id AS Emp2_ID, e2.Emp_name AS Emp2_Name,
       e1.department
FROM Emp e1
JOIN Emp e2 ON e1.department = e2.department
WHERE e1.Emp_id <> e2.Emp_id;


CREATE TABLE Customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE,
    phone VARCHAR(15),
    address VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);emp


CREATE TABLE Products (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    category VARCHAR(50),
    price DECIMAL(10,2) NOT NULL,
    stock INT DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE Orders (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status VARCHAR(20) DEFAULT 'Pending',
    total_amount DECIMAL(10,2),
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id)
);


CREATE TABLE Payments (
    payment_id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    amount DECIMAL(10,2),
    payment_method VARCHAR(20),
    status VARCHAR(20) DEFAULT 'Completed',
    FOREIGN KEY (order_id) REFERENCES Orders(order_id)
);

show tables;
select * from emp;
show databases;