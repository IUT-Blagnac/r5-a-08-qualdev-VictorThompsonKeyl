package hellocucumber;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String owner;
    private String target;
    private final List<String> cocktails;
    private String message;
    public Order() {
        this.cocktails = new ArrayList<>();
    }

    public void declareOwner(String romeo) {
        this.owner = romeo;
    }

    public void declareTarget(String juliette) {
        this.target = juliette;
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public String addMessage(String message) {
        this.message = "From " + owner + " to " + target + ": " + message;
        return this.message;
    }
}
