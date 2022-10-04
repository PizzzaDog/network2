package by.overone.controller;

import by.overone.entity.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SomeController {

    @GetMapping("/some")
    public User getSomeUser() {
        return new User();
    }

    @DeleteMapping("/some")
    public void deleteSomeUser() {
        //УДАЛЕНИЕ РАНДОМНОГО ЮЗЕРА
    }
}
