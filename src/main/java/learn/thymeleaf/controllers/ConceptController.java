package learn.thymeleaf.controllers;

import learn.thymeleaf.models.Listing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
        System.out.println(listing.getRandomEncouragement());
        return "randomEncouragement";
    }

    


}
