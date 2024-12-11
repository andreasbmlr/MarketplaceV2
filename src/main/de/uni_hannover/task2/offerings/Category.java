package main.de.uni_hannover.task2.offerings;

public enum Category {
    FURNITURE,
    ELECTRONICS,
    SERVICES,
    CLOTHES,
    ANIMALS; 
    
    public String str() {
        switch(this) {
            case FURNITURE:
                return "Möbel";
            case ELECTRONICS:
                return "Elektronik";
            case SERVICES:
                return "Service";
            case CLOTHES:
                return "Kleidung";
            case ANIMALS:
                return "Tiere";
            default: 
                return "Bitte gültige Kategorie angeben";
        }
    }

    public boolean isSameCategory(Item item) {
        return item.getCategory() == this;
    }

}

