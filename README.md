# Selenium Test Automation Framework

A Java-based Selenium test automation framework using JUnit 5, Maven, Page Object Model, and Jenkins CI/CD.

## 🚀 Project Overview

This project demonstrates a maintainable UI test automation framework for the SauceDemo web application.

The framework includes:

- Selenium WebDriver
- Java 17
- JUnit 5
- Maven
- Page Object Model (POM)
- Explicit Waits
- Configurable test environment
- Environment variable support
- Jenkins CI/CD
- Jenkins Credentials Management
- JUnit test reporting
- Headless browser execution

### 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 17 | Programming language |
| Selenium WebDriver | UI automation |
| JUnit 5 | Test framework |
| Maven | Build & dependency management |
| Jenkins | CI/CD pipeline |
| Git & GitHub | Version control |
| Chrome | Web browser |

### 📁 Project Structure

```text
src
├── main
│   └── java
│       ├── config
│       │   └── ConfigReader.java
│       ├── driver
│       │   └── DriverFactory.java
│       ├── pages
│       │   ├── LoginPage.java
│       │   ├── InventoryPage.java
│       │   └── CartPage.java
│       └── utils
│           └── WaitUtils.java
│
└── test
    └── java
        ├── base
        │   └── BaseTest.java
        └── tests
            └── LoginTest.java
```


### 🧪 Test Scenarios

The current test suite covers:

- Valid user login

- Invalid user login

- Adding a product to the shopping cart

###  Test Results

Current CI pipeline:

```text
Tests run: 3
Failures: 0
Errors: 0
Skipped: 0
BUILD SUCCESS
```

### ⚙️ Configuration

The framework supports configuration through environment variables and a local config.properties file.

Supported environment variables:
```text
BASE_URL
SAUCE_USERNAME
SAUCE_PASSWORD
HEADLESS
```

Environment variables take priority over values defined in config.properties.

Sensitive credentials are not stored in the repository.

### ▶️ Run Tests Locally

Clone the repository:
```text
git clone https://github.com/Hvlkrs/JenkinsSeleniumProject.git
cd JenkinsSeleniumProject
```

Run the test suite:
```text
mvn clean test
```

### 🔄 Jenkins CI/CD

The project includes a Jenkins Declarative Pipeline.

Pipeline flow:
```text
GitHub
↓
Jenkins
↓
Maven
↓
Selenium Tests
↓
JUnit Reports
↓
Build Success
```

Jenkins is configured to:

 1 -  Checkout the latest code from GitHub

 2 - Load secure credentials

 3 - Execute the Maven test suite

 4 - Run Selenium tests

 5 - Publish JUnit test results

### 🔐 Security

Sensitive credentials are managed using Jenkins Credentials and environment variables.

Credentials are never committed to GitHub.

### 📊 CI Result

Latest successful Jenkins build:
```text
3 Tests
0 Failures
0 Errors
0 Skipped
BUILD SUCCESS
```

👩‍💻 Author

Hivel Krasniqi