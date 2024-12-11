package main;

import main.de.uni_hannover.task2.Marketplace;
import main.de.uni_hannover.task2.auth.User;
import main.de.uni_hannover.task2.offerings.Category;
import main.de.uni_hannover.task2.offerings.Item;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Julia", "123test");
        User user2 = new User("Andreas", "passwort");

        user1.addItem(new Item("PC", Category.ELECTRONICS, 1000.00f, user1, "Gaming Rig"));
        user1.addItem(new Item("Jacke", Category.CLOTHES, 150.00f, user1, "Getragene Jacke"));
        user2.addItem(new Item("Maus", Category.ELECTRONICS, 5.00f, user2, "Basic Maus"));

        Marketplace marketplace = new Marketplace();
        marketplace.addUser(user1);
        marketplace.addUser(user2);

        System.out.println("Marktplatz:");
        System.out.println(marketplace.str());

        user2.getItems()[0].setPrice(1.00f);

        System.out.println("Filter nur Elektronik:");
        System.out.println(marketplace.filterMarket(Category.ELECTRONICS));
    }
}
