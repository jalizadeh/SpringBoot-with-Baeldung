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


### [5] [Configure a Spring Boot Web Application](https://www.baeldung.com/spring-boot-application-configuration)
- Spring Boot can be easily configured for any aspect such as access port & address. These can be modified via `application.properties`, `yaml` file or `Java Class`.


### [6] [How to Change the Default Port in Spring Boot](https://www.baeldung.com/spring-boot-change-port)
- It is possible via:
	- Property file `application.properties` or `yaml` file
	- Programmatic
		- Add in the `Application`
		- Define a `WebServerFactoryCustomizer` class
	- NOTE: the priority is important.


### [7] [Spring Boot Change Context Path](https://www.baeldung.com/spring-boot-context-path)
- Complete [document](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html) about external configurations


### [8] [Guide to @ConfigurationProperties in Spring Boot](https://www.baeldung.com/configuration-properties-in-spring-boot)
- What if I need to have my own custom properties
	- The property can be nested
	- Validation helps us validate the properties without writing any `if-else` conditions
	- NOTE: The configuration class must have `@Validated` annotation


### [9] [Automatic Property Expansion with Spring Boot](https://www.baeldung.com/spring-boot-auto-property-expansion)