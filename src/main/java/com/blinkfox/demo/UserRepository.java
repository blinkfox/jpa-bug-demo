package com.blinkfox.demo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository.
 *
 * @author blinkfox on 2022-03-28.
 * @since 1.0.0
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByNameContains(String name);

}
