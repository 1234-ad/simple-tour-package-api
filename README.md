# Simple Tour Package API

A RESTful API built with Spring Boot and PostgreSQL to manage tour packages.

## Features

- Create new tour packages
- Retrieve all tour packages
- Get tour package by ID
- Input validation and error handling
- PostgreSQL database integration

## Tech Stack

- **Java 17**
- **Spring Boot 3.2.0**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- PostgreSQL 12+

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/1234-ad/simple-tour-package-api.git
cd simple-tour-package-api
```

### 2. Database Setup
1. Install PostgreSQL and create a database:
```sql
CREATE DATABASE tour_package_db;
```

2. Update database credentials in `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tour_package_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Build and Run
```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

The API will be available at `http://localhost:8080`

## API Endpoints

### 1. Create Tour Package
- **URL:** `POST /api/tours`
- **Content-Type:** `application/json`
- **Request Body:**
```json
{
  "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
  "discountInPercentage": "17%",
  "title": "Himalayan Trek Adventure",
  "description": "14-day trek through the Himalayas",
  "duration": "14Days/13Nights",
  "actualPrice": "$1200",
  "discountedPrice": "$1000"
}
```

### 2. Get All Tour Packages
- **URL:** `GET /api/tours`
- **Response:** Array of tour packages

### 3. Get Tour Package by ID
- **URL:** `GET /api/tours/{id}`
- **Response:** Single tour package object

## Sample API Usage

### Create a Tour Package
```bash
curl -X POST http://localhost:8080/api/tours \
  -H "Content-Type: application/json" \
  -d '{
    "image": "https://images.unsplash.com/photo-1598275277521-1885382d523a",
    "discountInPercentage": "17%",
    "title": "Himalayan Trek Adventure",
    "description": "14-day trek through the Himalayas",
    "duration": "14Days/13Nights",
    "actualPrice": "$1200",
    "discountedPrice": "$1000"
  }'
```

### Get All Tours
```bash
curl -X GET http://localhost:8080/api/tours
```

### Get Tour by ID
```bash
curl -X GET http://localhost:8080/api/tours/1
```

## Error Handling

The API includes comprehensive error handling:
- **400 Bad Request:** Invalid input data
- **404 Not Found:** Tour package not found
- **500 Internal Server Error:** Server errors

## Validation

All required fields are validated:
- `image`: Must not be blank
- `discountInPercentage`: Must not be blank
- `title`: Must not be blank
- `description`: Must not be blank
- `duration`: Must not be blank
- `actualPrice`: Must not be blank
- `discountedPrice`: Must not be blank

## Project Structure

```
src/
├── main/
│   ├── java/com/mapmytour/api/
│   │   ├── TourPackageApiApplication.java
│   │   ├── controller/
│   │   │   └── TourPackageController.java
│   │   ├── entity/
│   │   │   └── TourPackage.java
│   │   ├── exception/
│   │   │   └── GlobalExceptionHandler.java
│   │   ├── repository/
│   │   │   └── TourPackageRepository.java
│   │   └── service/
│   │       └── TourPackageService.java
│   └── resources/
│       └── application.properties
└── test/
```

## Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## License

This project is licensed under the MIT License.