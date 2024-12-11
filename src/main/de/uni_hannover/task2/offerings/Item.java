package main.de.uni_hannover.task2.offerings;

import main.de.uni_hannover.task2.auth.User;

public class Item {
    private String name;
    private Category category;
    private float price;
    private User seller;
    private String description;

    //Constructor
    public Item(String name, Category category, float price, User seller, String description) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.seller = seller;
        this.description = description;
    }

    //Getter
    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public User getSeller() {
        return seller;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    //String represantaion
    public String str() {
        return "[Item: " + name + "; Kategorie:" + category +"; Preis: " + price + "; Verkäufer: " + seller.getUsername() + "; Beschreibung: " + description + "]";
    }
    
}
