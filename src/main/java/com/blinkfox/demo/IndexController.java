package com.blinkfox.demo;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller.
 *
 * @author blinkfox on 2022-03-28.
 * @since 1.0.0
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @Resource
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<String> index() {
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userRepository.findByNameContains(""));
    }

}
