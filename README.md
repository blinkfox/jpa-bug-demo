# jpa-bug-demo

This is jpa bug demo.

### How to reproduce problem

You can execute `mvn test` and you will get an error.

or start the `JpaBugDemoApplication` server, Access the `http://127.0.0.1:8080/users` url of the service, the first time is normal, when you request this URL for the second time, an exception similar to the above will be thrown.

When I change the version of Spring Boot to `2.6.4` or the version of Spring Data JPA to `2.6.2`, there is no such problem.

The main code is:

```java
List<User> findByNameContains(String name);
```

### problem analysis

After some investigation, the jar that caused the problem is actually `hibernate-core`, and its version is `5.6.6.Final` and later, it will cause this problem. The `5.6.5.Final` version does not cause this problem.

The more detailed reasons are not yet known. Through some of the above codes and clues, you may be able to find the reasons faster.
