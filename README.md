# 🚀 Janitri QA Internship Assignment

## 📌 Objective
This project is a submission for the **QA Internship Assignment** at **Janitri Innovations**, focused on automating the **Login Page UI** using:
- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)

> 🔗 [Live Test Page](https://dev-dash.janitri.in/)

---

## 🛠️ Tech Stack
- **Programming Language:** Java
- **Automation Tool:** Selenium WebDriver
- **Build Tool:** Maven
- **Test Runner:** TestNG
- **Design Pattern:** Page Object Model (POM)
- **Browser Manager:** WebDriverManager

---

## 📁 Project Structure

```
JanitriAutomation/
├── pom.xml
├── src/
│   └── test/java/
│       ├── pageObjects/
│       │   └── LoginPage_POM.java
│       ├── testBase/
│       │   └── BaseClass.java
│       ├── testCases/
│       │   └── LoginFunctionality.java
│       └── utilities/
│           └── ExtentReportManager.java
```

- `BaseClass.java`: Browser setup and teardown logic.
- `LoginPage_POM.java`: Page Object Model class for the login page.
- `LoginFunctionality.java`: TestNG test class containing automated test cases.
- `ExtentReportManager.java`: Utility for generating and managing Extent Reports.


## ✅ Test Scenarios Automated

| Test Case ID | Scenario Description |
|--------------|----------------------|
| TC_01 | Attempt login with blank fields and validate login button behavior |
| TC_02 | Enter invalid credentials and capture error message |
| TC_03 | Validate password masking/unmasking using eye icon |
| TC_04 | Confirm presence of UI elements (input fields, eye icon, login button, title.) |

Each test follows best practices using assertions to ensure the UI behaves as expected under different inputs.

---

## 💡 Key Highlights

- ✅ Clean separation of concerns using POM.
- ✅ Reusable and readable test methods.
- ✅ No advanced frameworks (like BDD/Cucumber) — as per guidelines.
- ✅ Efficient use of WebDriverManager for cross-machine compatibility.

---

## 🧪 How to Run the Tests

1. Clone the repository
2. Import into your favorite IDE (IntelliJ, Eclipse)
3. Run `mvn clean install` to resolve dependencies
4. Right-click `LoginFunctionality.java` → Run as TestNG Test

---

## 👨‍💻 Author

**Giridhara Srinivas**  
Software Testing Intern  
Passionate about automation, UI behavior analysis, and delivering quality-first digital experiences.

---

## 🙏 Thank You

Thank you for the opportunity to complete this assignment. I’m excited about the possibility of contributing to Janitri’s mission of improving healthcare with reliable, high-quality technology.

---
