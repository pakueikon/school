package org.pek.school.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by e.paku on 2018/05/26.
 *  SEE: https://spring.io/guides/gs/accessing-data-jpa/
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {
    Optional<Demo> findById(int id);
}
