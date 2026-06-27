# URL Shortener

A backend URL shortening service built with Java, Spring Boot, and MySQL that generates compact, unique short URLs for long links. The application provides persistent URL storage, automatic redirection, click tracking, and REST APIs suitable for business applications and marketing campaigns.

---

# 🚀 Features

* URL Shortening
* Collision-Free Short Code Generation
* Automatic HTTP Redirection
* Persistent URL Storage
* Click Analytics
* Link Tracking
* URL Expiration Support *(if implemented)*
* RESTful APIs
* Exception Handling
* Input Validation

---

# 🛠 Tech Stack

## Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Maven

## Database

* MySQL

---

# 📡 REST APIs

Implemented 5+ REST APIs including:

* Create Short URL
* Redirect to Original URL
* Retrieve URL Details
* Click Analytics
* Delete URL *(if implemented)*

---

# ⚙️ Core Functionalities

## URL Shortening

* Accepts long URLs
* Generates unique short codes
* Stores mappings in MySQL
* Prevents duplicate short codes

---

## URL Redirection

* Redirects users to the original URL
* Uses HTTP redirection
* Supports fast lookup using database queries

---

## Click Analytics

Tracks URL usage including:

* Total Clicks
* Creation Date
* Last Access Time *(if implemented)*
* Original URL
* Short URL

---

# 🗄 Database Design

Example Entity

```text
URL
------------
id
originalUrl
shortCode
clickCount
createdAt
```

---

# 📂 Project Structure

```text
src/
├── controller/
├── service/
├── repository/
├── entity/
├── dto/
├── exception/
├── config/
└── UrlShortenerApplication.java
```

---

# ⚙️ Installation

Clone the repository

```bash
git clone https://github.com/yourusername/url-shortener.git
```

Configure MySQL

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/url_shortener
spring.datasource.username=your_username
spring.datasource.password=your_password
```

Run the application

```bash
mvn spring-boot:run
```

---

# 🧪 API Example

### Create Short URL

```http
POST /api/urls
```

Request

```json
{
  "url": "https://example.com/very/long/url"
}
```

Response

```json
{
  "shortUrl": "http://localhost:8080/abc123"
}
```

---

# 📈 Key Highlights

* Java & Spring Boot backend
* MySQL database integration
* 5+ REST APIs
* Collision-free short code generation
* Automatic HTTP redirection
* Click analytics and link tracking
* Layered architecture using Spring Boot best practices

---

# 🚀 Future Improvements

* User Authentication (JWT)
* Custom Short URLs
* QR Code Generation
* URL Expiration
* Rate Limiting
* Redis Caching
* Docker Deployment
* Swagger API Documentation

---

# 👩‍💻 Author

**Ayushi Tripathi**

GitHub: https://github.com/Ayushitripathi110505
