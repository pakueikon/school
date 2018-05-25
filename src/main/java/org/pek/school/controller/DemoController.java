package org.pek.school.controller;

import org.pek.school.model.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by e.paku on 2018/05/25.
 */

@RestController
public class DemoController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/demo")
    public Demo demo(@RequestParam(value="name", defaultValue="World") String name) {
        return new Demo(counter.incrementAndGet(),
                String.format(template, name));
    }
}
