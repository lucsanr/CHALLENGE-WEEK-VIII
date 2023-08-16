# CHALLENGE-WEEK-VIII
CHALLENGE WEEK VIII - Spring Boot - Back-End Journey | AWS

==CHALLENGE WEEK VIII - Spring Boot - Back-End Journey | AWS==

==Description==
Your goal in this technical challenge is to develop a RESTful API using the Spring Boot framework in Java 17 and SpringBoot 3.0.9 , which is capable of handling the basic operations of the four HTTP verbs: GET, POST, PUT and DELETE. In addition, you must implement data persistence in a database, with two possible options: MySQL or MongoDB. The domain of the application is free to choose, but the objective must be to register information for the classes of the Compass Scholarship Program. 
It should have at least the registration of organizers (Coordinators, instructors and Scrum Master), the registration of students, registration of classes, registration of squads, etc.

 
==Mandatory:==

1.  document your progress and choices, use the README for this and also to teach how to run your project.
2.  Import the postman's collection, pay attention to the body of the requests.
3.  Project Metadata Group next pattern your name and last name (name.lastname).
4.  Minimum 3 branches (use Pull Request) .
5.  Minimum 5 commits.

==Business Rules:==

1.  Class must have a minimum of 15 * students and a maximum of 30 *.
2.  The class must have 3 statuses: waiting, started, finished.
3.  You can only register new students in the status: waiting.
4.  There must be an end to changing the status to finished.
5.  Each squad should have a maximum of 5 * students and be as balanced as possible.
6.  To start the class you need 1 * coordinator, 1 * scrum master and 3 * instructors.
Numbers followed by * : Possible items that can be configured.

==Requirements:==

1. Version your API
2. You need an end point or SQL script that populates the database with 3 coordinators, 3 scrum masters, 3 instructors and exactly 14 students.
3. Domain Modeling: Model the application domain according to the theme, identifying the relevant entities, attributes and relationships. Make sure you create a cohesive and meaningful structure to represent your domain.
4. Implementing HTTP verbs: Implement endpoints for each of the four HTTP verbs (GET, POST, PUT, and DELETE) that allow manipulation of domain entities.
5. Database Persistence: Implement the persistence layer using a relational MySQL database or a non-relational MongoDB database, depending on your preference. Use the appropriate Spring Boot tools and resources to perform the integration with the selected database. The database must be named "db_scholarship", the login and password "root".
6. Well Defined Resources: Clearly define which resources will be made available by your API and how they should be accessed. Consider using good API design practices, such as using the plural for resource names and adopting a consistent naming pattern.
7. End point that shows the class and its members.
8. Unit Tests: Develop unit tests to verify the correct functioning of important classes and methods in your application. Be sure to cover the most relevant use cases and ensure the integrity of your code. Use a code analysis tool and ensure that it is covered by at least 30% of tests ideal more than 70%.
9. Integration Tests with Mock MVC: Create integration tests using the Mock MVC framework to simulate HTTP requests and verify that API endpoints are responding correctly. Be sure to test for success cases as well as error scenarios such as invalid requests or resources not found.
