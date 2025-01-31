 Test Automation Framework Using Java Selenium
** Introduction**
This project is a Test Automation Framework built using Java and Selenium WebDriver. It is designed to be scalable, maintainable, and extendable, allowing for future enhancements. The framework automates UI test cases for DemoBlaze and includes logging, reporting, and error handling to ensure robust test execution.

**Features**
->Java-based test automation
-> Selenium WebDriver for web automation
-> TestNG as the test runner
-> Page Object Model (POM) for maintainability
-> Maven as the build tool for dependency management
-> Configurable parameters stored in config.properties
-> Cross-browser testing support (Chrome, Firefox, Edge)
-> Detailed reporting using ExtentReports
-> Logging using Log4j
-> Error handling and assertions for reliable test validation

**Framework Structure**
src/ |-- main/ | |-- java/ | | |-- com/ | | | |-- example/ | | | |-- base/ | | | |-- pages/ | | | |-- utils/ | |-- resources/ |
|-- config.properties|-- test/ |-- java/ | |-- com/ | | |-- example/ | | |-- tests/ |-- resources/ |-- testng.xml

 Test Cases Implemented
The framework automates the following three UI test cases for DemoBlaze:

User Registration – Verifies successful user signup.
Login Functionality – Validates user authentication with correct credentials.
Add to Cart – Checks if a product can be added to the shopping cart.


## Getting Started
### Prerequisites
- Java JDK 8 or higher
- Maven 3.6.0 or higher
- Web browser (Chrome, Firefox, etc.)
- ChromeDriver or GeckoDriver

### Setup
1. Clone the repository to your local machine:
   ```sh
   git clone <repository-url>

Navigate to the project directory:

sh
cd <project-directory>
Install the required dependencies using Maven:

Update the config.properties file with your desired configuration.

Run the test suite using TestNG:
Test Reports
The test execution reports are generated using ExtentReports. After running the tests, you can find the reports in the test-output directory.

Dependencies
Selenium WebDriver

TestNG

ExtentReports

Maven

Sample Test Cases
The following UI test cases are automated:

Login Test: Validates the login functionality.

PurchasePhones: here perform purchasing the phone actions

Cart: Cart to phone.

Logging and Error Handling
Meaningful logging and error handling mechanisms are implemented to ensure the framework's robustness and maintainability.

Version Control
This project uses Git for version control. The complete automation framework code is hosted on a public Git repository.

Conclusion
This test automation framework demonstrates the ability to design and implement a robust, maintainable, 
and scalable solution using Java and Selenium. The framework is extendable, includes detailed reporting, 
and follows industry best practices for code readability and maintainability.

