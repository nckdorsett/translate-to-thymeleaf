package learn.thymeleaf.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class complimentController {

    @GetMapping
    public String home()

}