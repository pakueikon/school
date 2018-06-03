package org.pek.school.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by e.paku on 2018/05/26.
 */
public interface DemoRepository extends CrudRepository<Demo, Long> {
    List<Demo> findById(int id);
}
