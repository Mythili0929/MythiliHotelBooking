
const mysql = require('mysql2');

const db = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'Mythili@0929',
    database: 'mythili_hotel'
});

db.connect((err) => {
    if (err) {
        console.log('MySQL Connection Failed:', err.message);
        return;
    }

    console.log('MySQL Connected Successfully!');
});

module.exports = db;
