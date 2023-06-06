-- Creación de la base de datos
CREATE DATABASE marathon_store;

-- Selección de la base de datos
USE marathon_store;

-- Creación de la tabla enterprises
CREATE TABLE enterprises (
  id INT PRIMARY KEY,
  created_by VARCHAR(255),
  create_date DATETIME,
  modified_by VARCHAR(255),
  modified_date DATETIME,
  status BOOLEAN,
  address VARCHAR(255),
  name VARCHAR(255),
  phone VARCHAR(255)
);

-- Creación de la tabla departments
CREATE TABLE departments (
  id INT PRIMARY KEY,
  created_by VARCHAR(255),
  create_date DATETIME,
  modified_by VARCHAR(255),
  modified_date DATETIME,
  status BOOLEAN,
  description VARCHAR(255),
  name VARCHAR(255),
  phone VARCHAR(255),
  id_enterprise INT,
  FOREIGN KEY (id_enterprise) REFERENCES enterprises(id)
);

-- Creación de la tabla employees
CREATE TABLE employees (
  id INT PRIMARY KEY,
  created_by VARCHAR(255),
  create_date DATETIME,
  modified_by VARCHAR(255),
  modified_date DATETIME,
  status BOOLEAN,
  age INT,
  email VARCHAR(255),
  name VARCHAR(255),
  position VARCHAR(255),
  surname VARCHAR(255)
);

-- Creación de la tabla departments_employees
CREATE TABLE departments_employees (
  id INT PRIMARY KEY,
  created_by VARCHAR(255),
  create_date DATETIME,
  modified_by VARCHAR(255),
  modified_date DATETIME,
  status BOOLEAN,
  id_department INT,
  id_employee INT,
  FOREIGN KEY (id_department) REFERENCES departments(id),
  FOREIGN KEY (id_employee) REFERENCES employees(id)
);

-- Llenar las tablas con datos

INSERT INTO marathon_store.enterprise (id, created_by, create_date, modified_by, modified_date, status, address, name, phone)
VALUES (1, 'John Doe', '2021-01-01', 'Jane Smith', '2021-01-02', true, '123 Main St', 'Acme Corporation', '123-456-7890');

INSERT INTO marathon_store.enterprise (id, created_by, create_date, modified_by, modified_date, status, address, name, phone)
VALUES (2, 'Alice Johnson', '2021-02-01', 'Bob Wilson', '2021-02-02', true, '456 Elm St', 'XYZ Company', '987-654-3210');

INSERT INTO marathon_store.employees (id, created_by, create_date, modified_by, modified_date, status, age, email, name, position, surname)
VALUES (1, 'John Doe', '2021-01-01', 'Jane Smith', '2021-01-02', true, 25, 'john@example.com', 'John Smith', 'Manager', 'Smith');

INSERT INTO marathon_store.employees (id, created_by, create_date, modified_by, modified_date, status, age, email, name, position, surname)
VALUES (2, 'Alice Johnson', '2021-02-01', 'Bob Wilson', '2021-02-02', true, 30, 'jane@example.com', 'Jane Doe', 'Supervisor', 'Doe');

INSERT INTO marathon_store.department (id, created_by, create_date, modified_by, modified_date, name, description, enterprise_id)
VALUES (1, 'John Doe', '2021-01-01', 'Jane Smith', '2021-01-02','Sales', 'Sales Department', 1);

INSERT INTO marathon_store.department (id, created_by, create_date, modified_by, modified_date,name, description, enterprise_id)
VALUES (2, 'Alice Johnson', '2021-02-01', 'Bob Wilson', '2021-02-02','Marketing', 'Marketing Department', 1);