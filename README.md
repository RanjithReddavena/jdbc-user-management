**JDBC User Management System**

---
> This is a **console-based Java* built using **JDBC**.
> It performs **CRUD operations** (Create, Read, Update, Delete) on a **MySQL database** using **PreparedStatement**.
> The follows **proper backend structure** using **Model, DAO, and Utility layers**.
> I built this to understand **how Java communicates with a database internally**, before learning Spring Boot.
> This helped me understand **JDBC fundamentals**, **database connections**, and **backend architecture**, which Spring Boot uses internally.

---

## 🔹 TECHNOLOGIES USED

```text
Java (JDK)
JDBC
MySQL
IntelliJ IDEA
Git & GitHub
```

---

## 🔹STRUCTURE

```text
src/
 └── com.example.usermanagement
     ├── model
     │    └── User.java
     ├── dao
     │    └── UserDao.java
     ├── util
     │    └── DBUtil.java
     └── main
          └── MainApp.java
```

---

## 🔹 FILE EXPLANATION

### 1️⃣ `User.java` (Model Layer)

> This class represents a **User entity**.
> It stores user details such as **id, name, email, and age**.
> This class is used to **transfer data between Java and the database**.

---

### 2️⃣ `DBUtil.java` (Utility Layer)

> This class is responsible for **creating and managing database connections**.
> It avoids repeating connection code in multiple places.
> In Spring Boot, this functionality is handled automatically by the framework.

---

### 3️⃣ `UserDao.java` (DAO Layer)

> This class handles all **database operations** using JDBC.
> It uses **PreparedStatement** to execute SQL queries securely.
> All CRUD operations such as **insert and select** are written here.

---

### 4️⃣ `MainApp.java` (Main Layer)

> This is the entry point of the application.
> It calls methods from `UserDao` to perform database operations and displays output in the console.

---

## 🔹 CRUD OPERATIONS IMPLEMENTED

Write this:

* ✅ Insert user into database
* ✅ Fetch all users from database
* ✅ Update user details (optional extension)
* ✅ Delete user (optional extension)

---
> PreparedStatement is used instead of Statement because it:
> * Prevents **SQL Injection**
> * Improves **performance**
> * Is **industry standard**
>
> Spring Boot internally uses PreparedStatement through JPA and Hibernate.

---

## 🔹 Steps TO RUN THIS

```text
1. Create MySQL database and users table
2. Update DB credentials in DBUtil.java
3. Run MainApp.java
4. Check output in console and database
```

---
## Through this, I learned:
>
> * How Java connects to MySQL using JDBC
> * How backend applications are structured
> * How CRUD operations work internally
> * Why frameworks like Spring Boot are needed
