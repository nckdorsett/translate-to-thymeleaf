package learn.thymeleaf.models;

import java.util.List;

public class RandomEncouragement{

    private String message;

    public RandomEncouragement(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
