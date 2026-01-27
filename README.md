# Maven Profiles Test Automation Project

## 📌 Project Description
This project demonstrates the use of Maven profiles (dev, qa, prod) in a test automation framework with resource filtering and TestNG.

## 🧰 Prerequisites
- Java 23+
- Maven 3+
- Git

## 🏗 Project Structure
- `config` → configuration reader
- `tests` → test classes
- `config.properties` → environment-specific config
- `pom.xml` → Maven configuration and profiles


## ⚙️ Setup Instructions
1. Clone the repository
2. Navigate to project root
3. Run tests using Maven

## ▶️ Running Tests

### Dev (default)
```bash
mvn clean test
```
### QA
```bash
mvn clean test -Pqa
```
### Prod
```bash
mvn clean test -Pprod
```