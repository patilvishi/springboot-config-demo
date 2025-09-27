# Spring Boot Security – Basic Authentication

This project demonstrates securing REST endpoints with **Spring Security Basic Auth**.

## Features
- Secure all endpoints with HTTP Basic Authentication
- In-memory user store for demo purposes
- Custom security configuration using `SecurityFilterChain`
- Profile-based credentials

## Run
```bash
./mvnw spring-boot:run


## Access the app:

http://localhost:8080/hello
 → Prompts for username/password.

## Default Credentials

Username: user
Password: printed in console (or set in application.yml).