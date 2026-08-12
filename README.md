# Selenium Test Automation Framework

A Java-based test automation project built with Selenium WebDriver, Maven, and JUnit 5.

This project is being developed as a practical SDET portfolio project, with a focus on building maintainable, scalable, and reliable automated tests.

## Tech Stack

- Java 17
- Selenium WebDriver 4.31.0
- JUnit 5
- Maven
- Git & GitHub

## Project Structure

```text
selenium-test-automation-framework/
├── pom.xml
├── .gitignore
├── README.md
└── src/
    └── test/
        └── java/
            └── mpack/
                └── FirstClass.java



Current Test Coverage

The current implementation includes a basic end-to-end browser test that:

Starts Google Chrome in headless mode
Navigates to Google
Retrieves the page title
Verifies that the title is Google
Closes the browser after execution
How to Run

Make sure Java 17 and Maven are installed.

Clone the repository:

git clone https://github.com/Hvlkrs/JenkinsSeleniumProject.git
cd JenkinsSeleniumProject

Run the test suite:

mvn clean test

A successful execution should finish with:

BUILD SUCCESS
Future Improvements

This project will evolve into a more complete test automation framework, including:

Page Object Model
WebDriver / Driver Factory
Configuration management
Reusable test utilities
API testing
Test data management
Improved test reporting
GitHub Actions CI/CD
Cross-browser testing

Author:
Hivel Krasniqi
SDET & Test Automation Engineer

GitHub: https://github.com/Hvlkrs