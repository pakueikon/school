package org.pek.school.controller;

import org.pek.school.entity.DemoEntity;
import org.pek.school.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by e.paku on 2018/05/25.
 */

@RestController
@RequestMapping(path="/demo")
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @RequestMapping("/")
    public String demo() {
        return "Hello spring world";
    }

    @GetMapping("/add")
    public @ResponseBody
    DemoEntity addNewDemo (@RequestParam String content) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        DemoEntity n = new DemoEntity();
        n.setContent(content);
        return demoRepository.save(n);
    }

}
