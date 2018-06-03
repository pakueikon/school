package org.pek.school.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by e.paku on 2018/06/04.
 */

@Service
class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    Demo save(Demo demo) {
        return demoRepository.save(demo);
    }

    Iterable<Demo> findAll() {
        return demoRepository.findAll();
    }
}
