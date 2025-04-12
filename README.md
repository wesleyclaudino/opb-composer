# One Percent Better - Backend
🚀 Backend for the **One Percent Better** project.

---
## 📦 Running `opb-server` with Docker
To run the `opb-server` module, you'll need to have **Docker** installed.

### 🛠️ Step 1: Create the environment variables file
In the root directory of the project, create the `application-dev.env` file:

```bash
touch ./opb-server/application-dev.env
```

### ⚙️ Step 2: Configure environment variables
Edit the file application-dev.env and add your environment-specific values:
- POSTGRES_DB=your_database_name
- POSTGRES_USER=your_database_user
- POSTGRES_PASSWORD=your_database_password
- POSTGRES_URI=jdbc:postgresql://db:5432/your_database_name

> 🔐 **Important:** Do not version this file — make sure it is listed in your `.gitignore`.

### 🐳 Step 3: Build and run the Docker container
Navigate to the opb-server directory and run the following command:

```bash
cd ./opb-server && docker-compose up --build
```

This will:
- Spin up containers for both PostgreSQL and the Spring Boot application
- Expose ports 8080 (app) and 5432 (PostgreSQL)
- Load environment variables from your application-dev.env file

---
## 📂 Project Structure
```jsonpath
opb-server/
├── Dockerfile
├── docker-compose.yml
├── src/
│   └── main/
│       └── java/
│       └── resources/
├── pom.xml
└── application-dev.env
```

---
## 🧪 Testing the application
Once the Docker containers are up, access the app through your browser or using curl:
```bash
http://localhost:8080/api/category
```
---
## 📘 Notes
This project is built with modern and stable technologies to ensure performance, maintainability, and scalability:

### 🚀 Core Stack
- Java: 21
- Spring Boot: 3.4+
- Spring Framework: 6.2.5
- Lombok: 1.18.36 (used to reduce boilerplate code)

### 🗄️ Database
- Database Engine: PostgreSQL 17.4
- JDBC Driver: 42.7.5
- Database Migrations: Managed using Flyway (version 9.8.1)

### ☁️ External Services
- AWS SDK for S3: 1.12.782 (used for integrating with Amazon S3)

### ⏱️ Startup Management
The application uses wait-for-it.sh to ensure the PostgreSQL container is ready before starting the Spring Boot server. This avoids connection errors on startup due to database unavailability.

---
## 🤝 Contributing
Feel free to open issues, suggest improvements, or submit pull requests!