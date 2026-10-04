-- =====================================================
-- Movie Ticket Booking System
-- Database: movie_ticket_booking
-- =====================================================

CREATE DATABASE IF NOT EXISTS movie_ticket_booking;

USE movie_ticket_booking;

-- =====================================================
-- 1. MOVIE TABLE
-- =====================================================

CREATE TABLE movies (
    movie_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_name VARCHAR(100) NOT NULL,
    genre VARCHAR(50),
    language VARCHAR(30),
    duration INT,
    ticket_price DECIMAL(10,2) NOT NULL,
    show_date DATE,
    show_time TIME
);

-- =====================================================
-- 2. CUSTOMER TABLE
-- =====================================================

CREATE TABLE customers (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    phone VARCHAR(15) NOT NULL
);

-- =====================================================
-- 3. SEAT TABLE
-- =====================================================

CREATE TABLE seats (
    seat_id INT AUTO_INCREMENT PRIMARY KEY,
    seat_number VARCHAR(10) NOT NULL,
    seat_status VARCHAR(20) DEFAULT 'Available'
);

-- =====================================================
-- 4. BOOKING TABLE
-- =====================================================

CREATE TABLE bookings (
    booking_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    movie_id INT NOT NULL,
    seat_id INT NOT NULL,
    booking_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    quantity INT DEFAULT 1,
    total_price DECIMAL(10,2) NOT NULL,

    FOREIGN KEY (customer_id)
        REFERENCES customers(customer_id),

    FOREIGN KEY (movie_id)
        REFERENCES movies(movie_id),

    FOREIGN KEY (seat_id)
        REFERENCES seats(seat_id)
);

-- =====================================================
-- INSERT MOVIE DATA
-- =====================================================

INSERT INTO movies
(movie_name, genre, language, duration, ticket_price, show_date, show_time)
VALUES
('Kantara', 'Drama', 'Kannada', 148, 200.00, '2026-10-10', '10:00:00'),

('KGF Chapter 2', 'Action', 'Kannada', 168, 250.00, '2026-10-10', '14:00:00'),

('RRR', 'Action', 'Telugu', 182, 220.00, '2026-10-10', '18:00:00'),

('Jailer', 'Action', 'Tamil', 168, 200.00, '2026-10-11', '14:30:00'),

('3 Idiots', 'Comedy', 'Hindi', 170, 180.00, '2026-10-11', '19:00:00');

-- =====================================================
-- INSERT CUSTOMER DATA
-- =====================================================

INSERT INTO customers
(customer_name, email, phone)
VALUES
('Rahul Kumar', 'rahul@gmail.com', '9876543210'),
('Priya Sharma', 'priya@gmail.com', '9876543211'),
('Arjun Rao', 'arjun@gmail.com', '9876543212');

-- =====================================================
-- INSERT SEAT DATA
-- =====================================================

INSERT INTO seats (seat_number, seat_status)
VALUES
('A1', 'Available'),
('A2', 'Available'),
('A3', 'Available'),
('A4', 'Available'),
('A5', 'Available'),

('B1', 'Available'),
('B2', 'Available'),
('B3', 'Available'),
('B4', 'Available'),
('B5', 'Available'),

('C1', 'Available'),
('C2', 'Available'),
('C3', 'Available'),
('C4', 'Available'),
('C5', 'Available'),

('D1', 'Available'),
('D2', 'Available'),
('D3', 'Available'),
('D4', 'Available'),
('D5', 'Available');

-- =====================================================
-- SAMPLE BOOKING
-- =====================================================

INSERT INTO bookings
(customer_id, movie_id, seat_id, quantity, total_price)
VALUES
(1, 1, 1, 1, 200.00);

-- Update booked seat status
UPDATE seats
SET seat_status = 'Booked'
WHERE seat_id = 1;

-- =====================================================
-- USEFUL QUERIES
-- =====================================================

-- View all movies
SELECT * FROM movies;

-- View all customers
SELECT * FROM customers;

-- View all seats
SELECT * FROM seats;

-- View available seats
SELECT *
FROM seats
WHERE seat_status = 'Available';

-- View booked seats
SELECT *
FROM seats
WHERE seat_status = 'Booked';

-- View all bookings
SELECT * FROM bookings;

-- View complete booking details
SELECT
    b.booking_id,
    c.customer_name,
    c.email,
    m.movie_name,
    s.seat_number,
    b.quantity,
    b.total_price,
    b.booking_date
FROM bookings b
JOIN customers c
    ON b.customer_id = c.customer_id
JOIN movies m
    ON b.movie_id = m.movie_id
JOIN seats s
    ON b.seat_id = s.seat_id;

-- =====================================================
-- CALCULATE TOTAL BOOKING AMOUNT
-- =====================================================

SELECT
    SUM(total_price) AS total_revenue
FROM bookings;

-- =====================================================
-- FIND MOVIES BY LANGUAGE
-- =====================================================

SELECT *
FROM movies
WHERE language = 'Kannada';

-- =====================================================
-- FIND MOVIES BY GENRE
-- =====================================================

SELECT *
FROM movies
WHERE genre = 'Action';

-- =====================================================
-- CANCEL A BOOKING
-- =====================================================

-- Example:
-- DELETE FROM bookings WHERE booking_id = 1;

-- Make the seat available again:
-- UPDATE seats
-- SET seat_status = 'Available'
-- WHERE seat_id = 1;

-- =====================================================
-- END OF DATABASE
-- =====================================================
