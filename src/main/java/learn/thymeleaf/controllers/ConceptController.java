package learn.thymeleaf.controllers;

import learn.thymeleaf.models.Listing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConceptController {

    private String message;
    private Listing listing = new Listing();

    @GetMapping("/")
    public String getHomeView() {
        return "home";
    }

    @GetMapping("randomEncouragement")
    public String getRandomPage(Model model) {
        model.addAttribute("randomEncouragement", listing.getRandomEncouragement());
        return "randomEncouragement";
    }

    @GetMapping("personalizedEncouragement")
    public String getPersonalizedPage() {
        return "personalizedEncouragement";
    }

    @PostMapping("personalizedEncouragement")
    public String getPersonalizedPage(Model model, String value) {
        model.addAttribute("personalizedEncouragement", listing.getPersonalizedEncouragement(value));
        return "personalizedEncouragement";
    }


}
