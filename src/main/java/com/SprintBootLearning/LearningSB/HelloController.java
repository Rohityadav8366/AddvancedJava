package com.SprintBootLearning.LearningSB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/rohit")
    public String hello()
        {
            return "Hello World! ramiya";
        }

        @PostMapping("/rohit")
    public String name(@RequestBody String name)
        {
            return "Hello "+name+"!";
        }
}
