ONLINE BUS RESERVATION SYSTEM — BUSBOOK

FEATURES
- Based on the provided StudentHub reference project layout and shared stylesheet.
- Dashboard with passenger count and passenger quick lookup.
- Register, list, find, update, and delete passenger records.
- Passenger ID is generated automatically by MySQL.
- Fields: passenger_id, name, email, phone, password.

DATABASE
1. Open MySQL Workbench.
2. Run the SQL in database.sql.
3. Open server.js and change the MySQL password (default example: tejaswi) to your own password.

RUN
1. Extract this ZIP and open the online_bus_reservation_system folder in VS Code.
2. Open terminal in that folder.
3. Run: npm install
4. Run: npm start
5. Open http://localhost:3000/ in your browser.

NOTES
- Keep MySQL running before starting the Node.js server.
- This starter stores the password field as provided for simple classroom demonstration. For real deployment, hash passwords with bcrypt and never display or return passwords.
- Passenger management is included; bus routes, seat selection, payments, and booking tickets can be added as separate modules.
