
const express = require('express');
const db = require('./db');

const app = express();

app.use(express.json());
app.use(express.urlencoded({ extended: true }));
app.use(express.static('public'));

// Save customer and booking details
app.post('/api/bookings', async (req, res) => {
    try {
        const { name, email, room_type, booking_date } = req.body;

        if (!name || !email || !room_type || !booking_date) {
            return res.status(400).json({
                message: 'Please fill in all fields.'
            });
        }

        // Find the selected room
        const [rooms] = await db.promise().query(
            'SELECT room_id FROM Rooms WHERE room_type = ? LIMIT 1',
            [room_type]
        );

        if (rooms.length === 0) {
            return res.status(400).json({
                message: 'Selected room type was not found.'
            });
        }

        // Check whether the customer already exists
        const [customers] = await db.promise().query(
            'SELECT customer_id FROM Customers WHERE email = ?',
            [email]
        );

        let customerId;

        if (customers.length > 0) {
            customerId = customers[0].customer_id;
        } else {
            const [customerResult] = await db.promise().query(
                'INSERT INTO Customers (name, email) VALUES (?, ?)',
                [name, email]
            );

            customerId = customerResult.insertId;
        }

        // Save the booking
        await db.promise().query(
            `INSERT INTO Bookings
            (customer_id, room_id, booking_date, booking_status)
            VALUES (?, ?, ?, 'Confirmed')`,
            [customerId, rooms[0].room_id, booking_date]
        );

        res.json({
            message: 'Room booked successfully! Your booking is saved.'
        });

    } catch (error) {
        console.error('Booking Error:', error.message);

        res.status(500).json({
            message: 'Booking failed. Please try again.'
        });
    }
});

// Start server
app.listen(3000, () => {
    console.log('Mythili Hotel Booking Server Running!');
    console.log('http://localhost:3000');
});
