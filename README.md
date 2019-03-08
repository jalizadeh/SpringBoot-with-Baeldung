# Spring Boot with Baeldung
This repository contains the projects I create during learning Spring Boot from [baeldung.com](https://www.baeldung.com/spring-boot). I try to add something more to the project, as I wish or I learn during solving errors.

## Basics
-----------------------
### [1] [Bootstrap a Simple Application](https://www.baeldung.com/spring-boot-start)
- [Thymeleaf](https://www.thymeleaf.org/) handles the front-end part, with a great integration with back-end. It provides some tags to show the data sent from back-end as objects. check [Introduction to Using Thymeleaf in Spring](https://www.baeldung.com/thymeleaf-in-spring-mvc) for more info.
	- [All the dialects](https://www.thymeleaf.org/doc/articles/standarddialect5minutes.html)

### [2] [Spring Boot Annotations](https://www.baeldung.com/spring-boot-annotations)
- Annotations are to give special meanings to classes, methods & .... Annotations can make the app run in a desired way, by controlling the order, scope, value & many more options provided by Spring & Spring Boot.

### [3] [Intro to Spring Boot Starters](https://www.baeldung.com/spring-boot-starters)
- Each dependency gives adds unique powers to the whole application. In Spring Boot it is easy and convinient to add a `Starter` dependency and controll their version by modifying only one place in `Pom.xml`.
	- The Web Starter
	- The Test Starter
	- The Data JPA Starter
	- The Mail Starter
	- [And many more](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-project/spring-boot-starters)

### [4] [Spring Boot Actuator](https://www.baeldung.com/spring-boot-actuators)
- Spring Boot `Actuator` help us monitoring our app, gathering metrics, understanding traffic or the state of our database becomes trivial with this dependency.
	- You can access all the actuators avialable via `http://localhost:8081/actuator`
	- Some of the instructions are changed in versions 1.x & [2.x](https://docs.spring.io/spring-boot/docs/2.0.x/actuator-api/html/)
