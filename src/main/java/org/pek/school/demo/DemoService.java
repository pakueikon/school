package org.pek.school.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Created by e.paku on 2018/06/04.
 */

@Service
@Transactional(readOnly = true)
class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    Demo save(Demo demo) {
        return demoRepository.save(demo);
    }

    Optional<Demo> findById(int id) {
        return demoRepository.findById(id);
    }

    Iterable<Demo> findAll() {
        return demoRepository.findAll();
    }
}
