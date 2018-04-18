package org.pek.school.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by e.paku on 2018/04/18.
 */
@Controller
@EnableAutoConfiguration
public class SchoolController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
