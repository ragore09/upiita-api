# Nearsoft UPIITA - REST API Workshop

### What is this repository for? ###
* Quick summary 
    * Designed for a workshop to show students how to build a REST API using Spring Framework
* Version
    * 1.0
* Tech Stack
    * Java
    * Spring
    * MySQL
   
### Requirements ###
* Java JDK (7 Min)
* Maven 3
    * see - http://maven.apache.org/
* MySQL
* Postman (for testing purposes)
    * see - https://www.getpostman.com/
    
### Set up ###
1. Start MySQL service
2. Create user  ```CREATE USER 'upiita' IDENTIFIED BY 'upiita1234';```
3. Grant privileges ```GRANT ALL ON *.* TO 'upiita'@'localhost';```

### Run ###
1. Move to the application directory
2. From a terminal and run ```mvn spring-boot:run```

### Who do I talk to? ###
* Raul Gonzalez - rgonzalez@nearsoft.com