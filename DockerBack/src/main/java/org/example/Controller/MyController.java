package org.example.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/test")
    public String test() {
        return "This Is My Spring Boot Backend Test From Docker";
    }
}
