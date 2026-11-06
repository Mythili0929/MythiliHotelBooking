const express = require("express");
const mysql = require("mysql2");
const app = express();
app.use(express.json());
app.use(express.static("public"));

// Change the MySQL password below to your own password.
const db = mysql.createConnection({ host: "localhost", user: "root", password: "Mythili@0929", database: "bus_reservation" });
db.connect(err => { if (err) { console.error("MySQL connection failed:", err.message); process.exit(1); } console.log("Connected to MySQL"); });
const fields = "passenger_id, name, email, phone, password";
app.get("/passengers", (req,res) => db.query("SELECT passenger_id, name, email, phone FROM passenger ORDER BY passenger_id", (e,r)=> e ? res.status(500).send(e.message) : res.json(r)));
app.get("/passengers/:id", (req,res) => db.query("SELECT passenger_id, name, email, phone FROM passenger WHERE passenger_id = ?", [req.params.id], (e,r)=> e ? res.status(500).json({error:e.message}) : res.json(r)));
app.post("/passengers", (req,res) => { const {name,email,phone,password}=req.body; if (![name,email,phone,password].every(v=>typeof v==='string' && v.trim())) return res.status(400).send("Please fill all fields"); db.query("INSERT INTO passenger (name,email,phone,password) VALUES (?,?,?,?)", [name.trim(),email.trim(),phone.trim(),password], (e,r)=> e ? res.status(500).send(e.code==='ER_DUP_ENTRY'?'Email already registered':e.message) : res.status(201).json({message:"Passenger registered",passenger_id:r.insertId})); });
app.put("/passengers/:id", (req,res) => { const {name,email,phone,password}=req.body; if (![name,email,phone,password].every(v=>typeof v==='string' && v.trim())) return res.status(400).send("Please fill all fields"); db.query("UPDATE passenger SET name=?, email=?, phone=?, password=? WHERE passenger_id=?",[name.trim(),email.trim(),phone.trim(),password,req.params.id],(e,r)=> e?res.status(500).send(e.code==='ER_DUP_ENTRY'?'Email already registered':e.message):r.affectedRows===0?res.status(404).send("Passenger not found"):res.send("Passenger updated")); });
app.delete("/passengers/:id", (req,res) => db.query("DELETE FROM passenger WHERE passenger_id=?",[req.params.id],(e,r)=>e?res.status(500).send(e.message):r.affectedRows===0?res.status(404).send("Passenger not found"):res.send("Passenger deleted")));
app.listen(3000,()=>console.log("Online Bus Reservation System running at http://localhost:3000"));
