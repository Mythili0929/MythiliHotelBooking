
async function bookRoom(event) {
    event.preventDefault();

    const bookingData = {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        room_type: document.getElementById('room_type').value,
        booking_date: document.getElementById('booking_date').value
    };

    try {
        const response = await fetch('/api/bookings', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(bookingData)
        });

        const result = await response.json();

        alert(result.message);

        if (response.ok) {
            document.getElementById('bookingForm').reset();
        }

    } catch (error) {
        alert('Unable to connect to the server.');
        console.error(error);
    }
}
