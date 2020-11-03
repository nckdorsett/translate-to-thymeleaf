package learn.thymeleaf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConceptController {

    @GetMapping("/")
    public String getHomeView(Model model) {
        return "home";
    }
}
