STUDENT MANAGEMENT PROJECT

IMPORTANT:
This project expects your MySQL database and table to already exist:
Database: school
Table: student
Columns:
  sno   INT
  Name  VARCHAR(20)
  Total INT

1. Open MySQL Workbench and run:
   USE school;
   DESCRIBE student;

2. If these columns are not present, create the table with:
   CREATE TABLE IF NOT EXISTS student (
       sno INT PRIMARY KEY,
       Name VARCHAR(20),
       Total INT
   );

3. If your MySQL root password is not "tejaswi", edit the password in server.js.

4. Open this project folder in VS Code.

5. In the terminal, run:
   npm install
   npm start

6. Open in your browser:
   http://localhost:3000/

Pages:
- List Students
- Search Student
- Insert Student
- Update Student
- Delete Student

NOTE:
This project uses the mysql2 package. It uses only the real column names
sno, Name, and Total. There should be no student_id or student_name column.
