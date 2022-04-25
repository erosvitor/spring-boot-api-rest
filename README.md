## About
Project created in the Spring Boot course.

## Technologies
The following tools were used in this project:

* [Java Oracle](https://www.oracle.com/java/)
* [Apache Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
* [MySQL](https://www.mysql.com/)
* [Spring Tools Suite](https://spring.io/tools)

## Testing the project
**Step 1:** Start the application using Spring Tools Suite.

**Step 2:** Insert task

```
curl --location --request POST 'http://localhost:8080/tasks' \
--header 'Content-Type: application/json' \
--data-raw '{
    "description": "Fazer matrícula curso Inglês",
    "datetimeStart": "2021-10-25T13:00:00"
}'
```

**Step 2:** List all tasks

```
curl --location --request GET 'http://localhost:8080/tasks'
```

**Step 3:** Update task

```
curl --location --request PUT 'http://localhost:8080/tasks' \
--header 'Content-Type: application/json' \
--data-raw '{
    "id": 1,
    "description": "Fazer matrícula curso Inglês",
    "datetimeStart": "2021-10-25T13:30:00"
}'
```

**Step 4:** Delete task

```
curl --location --request DELETE 'http://localhost:8080/tasks/1'
```

## License
This project is under license from MIT. For more details, see the LICENSE file.
