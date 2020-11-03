package learn.thymeleaf.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Listing {
    private int listingId;
    private String listingName;
    private List<String> encouragements = List.of(
            "You can do it!",
            "Keep at it!",
            "I believe in you!",
            "You're the best!",
            "You smell nice.",
            "Wow. Cute outfit.",
            "Don't stop now!",
            "You. Are. Enough.",
            "You've done so much work! Keep going.",
            "You're nice.",
            "You're fast.",
            "You're smart.",
            "You're kind.",
            "Thank you so much.",
            "You look like you've lost weight.",
            "Did you get your hair cut? Cute!",
            "Great job today!",
            "You're killing it over there.",
            "Wow, that's impressive.",
            "I really, really love your work."
    );

    public int getListingId() {
        return listingId;
    }

    public void setListingId(int listingId) {
        this.listingId = listingId;
    }

    public String getListingName() {
        return listingName;
    }

    public void setListingName(String listingName) {
        this.listingName = listingName;
    }

    public String getRandomEncouragement() {
        Random random = new Random();
        String encouragement = encouragements.get(random.nextInt(encouragements.size()));
        System.out.println(encouragement);
        return encouragement;

    }
}
