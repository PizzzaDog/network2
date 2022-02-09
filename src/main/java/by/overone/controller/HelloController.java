package by.overone.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {



    @PreAuthorize("hasAuthority('ADMIN')")
    @GetMapping("/hello" )
    public String hello() {
        return "hello";
    }
}
