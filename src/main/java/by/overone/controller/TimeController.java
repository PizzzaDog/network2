package by.overone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TimeController {


    @GetMapping("/time")
    public String getCurrentTime() {
        return null;
    }
}
