Here’s a **README** in a clean, copy-paste format. Markdown doesn’t support multiple fonts or complex formatting, but it can look good with headers, bold, italics, and code blocks. If you're using platforms like GitHub, this will display neatly.

---

# **Swagger Tutorial API Documentation**

This project is a **Spring Boot** application integrated with **Swagger** for API documentation. The project demonstrates how to create REST APIs for users, products, and orders, and how to visualize and test them using Swagger UI.

---

## **Table of Contents**
- **[Getting Started](#getting-started)**
- **[Prerequisites](#prerequisites)**
- **[Project Structure](#project-structure)**
- **[Dependencies](#dependencies)**
- **[Swagger UI](#swagger-ui)**
- **[Available APIs](#available-apis)**
  - [User APIs](#user-apis)
  - [Product APIs](#product-apis)
  - [Order APIs](#order-apis)
- **[Testing the APIs](#testing-the-apis)**
- **[Troubleshooting](#troubleshooting)**

---

## **Getting Started**

To get a local copy of this project up and running, follow the steps below.

---

## **Prerequisites**
- **Java 15** installed
- **Maven** installed
- **IDE** (e.g., IntelliJ or Eclipse) to run the project

---

## **Project Structure**

The project follows this structure:

```bash
swagger-tutorial/
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── swaggertutorial
│   │   │               ├── SwaggerTutorialApplication.java
│   │   │               ├── config
│   │   │               │   └── SwaggerConfig.java
│   │   │               └── controller
│   │   │                   ├── HelloController.java
│   │   │                   ├── UserController.java
│   │   │                   ├── ProductController.java
│   │   │                   └── OrderController.java
│   └── resources
│       └── application.properties
└── pom.xml
```

---

## **Dependencies**

Make sure the following dependencies are added to your `pom.xml` to enable Swagger:

```xml
<dependencies>
    <!-- Spring Boot dependencies -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Swagger dependencies -->
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-boot-starter</artifactId>
        <version>3.0.0</version>
    </dependency>
</dependencies>
```

---

## **Swagger UI**

Once the application is up and running, access **Swagger UI** to visualize and interact with the available APIs.

- **Swagger UI URL**: [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/)
- **API Docs URL**: [http://localhost:8080/v2/api-docs](http://localhost:8080/v2/api-docs)

---

## **Available APIs**

### **User APIs**
| **Method** | **Endpoint**                  | **Description**               | **Parameters**                |
|------------|-------------------------------|-------------------------------|-------------------------------|
| `POST`     | `/api/users/{userId}`          | Create a new user              | `userId`, `name` (Query)       |
| `GET`      | `/api/users/{userId}`          | Get user details by ID         | `userId` (Path)                |

---

### **Product APIs**
| **Method** | **Endpoint**                  | **Description**               | **Parameters**                |
|------------|-------------------------------|-------------------------------|-------------------------------|
| `POST`     | `/api/products/{productId}`    | Add a new product              | `productId`, `name` (Query)    |
| `GET`      | `/api/products/{productId}`    | Get product details by ID      | `productId` (Path)             |

---

### **Order APIs**
| **Method** | **Endpoint**                  | **Description**               | **Parameters**                |
|------------|-------------------------------|-------------------------------|-------------------------------|
| `POST`     | `/api/orders/{orderId}`        | Place a new order              | `orderId`, `product` (Query)   |
| `GET`      | `/api/orders/{orderId}`        | Get order details by ID        | `orderId` (Path)               |

---

## **Testing the APIs**

You can test all the APIs directly using **Swagger UI** by following these steps:

1. **Access Swagger UI**: Go to [http://localhost:8080/swagger-ui/](http://localhost:8080/swagger-ui/).
2. **Choose a Controller**: Expand any section, like `UserController`, `ProductController`, or `OrderController`.
3. Click **"Try it out"** next to an API to input parameters and send the request.
4. **View the Response**: The response will be displayed, allowing you to test the API.

---

### **Sample API Requests**

#### **Create a User**
- Method: `POST`
- URL: `/api/users/{userId}`
- Example: `/api/users/1?name=John`

#### **Get a User**
- Method: `GET`
- URL: `/api/users/{userId}`
- Example: `/api/users/1`

#### **Add a Product**
- Method: `POST`
- URL: `/api/products/{productId}`
- Example: `/api/products/101?name=Laptop`

#### **Get a Product**
- Method: `GET`
- URL: `/api/products/{productId}`
- Example: `/api/products/101`

#### **Place an Order**
- Method: `POST`
- URL: `/api/orders/{orderId}`
- Example: `/api/orders/201?product=Laptop`

#### **Get an Order**
- Method: `GET`
- URL: `/api/orders/{orderId}`
- Example: `/api/orders/201`

---

## **Troubleshooting**

If you don’t see your APIs in the Swagger UI, check the following:

1. **Check Package Scanning**: Ensure that your `SwaggerConfig.java` is configured to scan the correct package: This must be your local package with what name you have created . 
   ```java
   .apis(RequestHandlerSelectors.basePackage("com.example.swaggertutorial.controller"))
   ```

2. **Swagger Dependencies**: Ensure that your `pom.xml` has the correct Swagger dependencies and version.

3. **Application Port**: Make sure your application is running on the correct port. Check your `application.properties`:
   ```properties
   server.port=8080
   ```

4. **Rebuild and Restart**: Sometimes cleaning and rebuilding the project can resolve issues:
   ```bash
   mvn clean install
   ```

---

### **License**

This project is licensed for educational purposes.

---

This **README** provides all the necessary steps to set up and run the Swagger-enabled Spring Boot project. You can now use Swagger to visualize and test your API endpoints.

---
