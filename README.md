# 🛒 Amazon Automation Testing Project

## 📌 Project Description

This project is an **end-to-end automation testing framework** built using **Java, Selenium WebDriver, TestNG, and Allure Report**. The framework automates multiple real user scenarios on **Amazon**, following best practices such as **Page Object Model (POM)** and **clean test separation**.

It covers login, product selection, cart actions, and account list validation with detailed reporting.

---

## 🧰 Technology Stack

* **Programming Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Test Framework:** TestNG
* **Build Tool:** Maven
* **Reporting Tool:** Allure Report
* **Design Pattern:** Page Object Model (POM)

---

## 📁 Project Structure

```
src
 ├── main
 │   ├── java/Pages
 │   └── resources
 │        ├── screenshots
 │        └── testing.xml
 └── test
     └── java
          ├── Base/BaseTest.java
          ├── Scenario1/LoginTest.java
          ├── Scenario2/AddToCart.java
          └── Scenario3/AccountList.java
```

---

## 🎯 Automated Test Scenarios

### ✅ Scenario 1: Login

* Navigate to Amazon home page
* Click Sign In
* Enter valid credentials
* Validate successful login

### ✅ Scenario 2: Add Product to Cart

* Select a product
* Choose quantity
* Add to cart
* Validate item added successfully

### ✅ Scenario 3: Account & Lists

* Hover over **Account & Lists**
* Navigate through account list options
* Validate correct page navigation

---

## ▶️ How to Execute Tests & Generate Allure Report

### 1️⃣ Prerequisites

Make sure the following tools are installed and accessible via the command line:

```bash
java -version
mvn -version
allure --version
```

---

### 2️⃣ Run Tests Using Maven

From the project root:

```bash
mvn clean test
```

* All TestNG tests will run
* Test results will be saved in: `target/allure-results`

---

### 3️⃣ Generate and View Allure Report

```bash
allure serve target/allure-results
```

* Opens an interactive HTML report in your default browser
* Features include:

    * Passed, Failed, Skipped tests
    * Failure reasons & stack traces
    * Screenshots for failed tests
    * Execution timeline

---

### 4️⃣ Optional: Re-run Tests

```bash
mvn clean test
allure serve target/allure-results
```

---


## 📌 Framework Highlights

* Page Object Model implementation
* Centralized WebDriver setup using BaseTest
* Reusable page methods
* Screenshot capturing for debugging
* Clear separation of test logic & page logic
* Easy maintenance and scalability

---

## 🚀 Future Improvements

* Data-driven testing using JSON
* Cross-browser testing
* Parallel execution
* CI/CD integration (Jenkins / GitHub Actions)

---

## 👩‍💻 Author

**Sherif Aly**
Automation Test Engineer
