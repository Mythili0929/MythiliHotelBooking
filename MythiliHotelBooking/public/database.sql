
CREATE DATABASE mythili_hotel;
USE mythili_hotel;

CREATE TABLE customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15),
    password VARCHAR(255)
);

CREATE TABLE rooms (
    room_id INT PRIMARY KEY AUTO_INCREMENT,
    room_number VARCHAR(20),
    room_type VARCHAR(50),
    price DECIMAL(10,2),
    capacity INT,
    status VARCHAR(20)
);

CREATE TABLE bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    room_id INT,
    booking_date DATE
);
