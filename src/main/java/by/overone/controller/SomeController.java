package by.overone.controller;


import by.overone.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/some")
    public User getSomeUser() {
        TimeController controller = new TimeController();
        String sometime = controller.getCurrentTime();
        //qweqdszxf
        return new User();
    }
}
