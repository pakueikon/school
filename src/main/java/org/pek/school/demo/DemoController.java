package org.pek.school.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Created by e.paku on 2018/05/25.
 */

@RestController
@RequestMapping(path="/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/")
    public String demo() {
        return "Hello spring demo world";
    }

    @GetMapping("/add")
    public @ResponseBody
    Demo addNewDemo (@RequestParam String content) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Demo demo = new Demo();
        demo.setContent(content);

        return demoService.save(demo);
    }

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Demo> findAll () {
        return demoService.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Optional<Demo> findById (@PathVariable("id") int id) {
        return demoService.findById(id);
    }
}
