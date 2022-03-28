package com.blinkfox.demo;

import java.util.List;
import javax.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserRepositoryTest {

    @Resource
    private UserRepository userRepository;

    @Test
    void findByNameContains() {
        List<User> users = userRepository.findByNameContains("");
        Assertions.assertEquals(users.size(), 0);

        // FIXME An error occurs when requesting again.
        List<User> users2 = userRepository.findByNameContains("");
        Assertions.assertEquals(users2.size(), 0);
    }

}