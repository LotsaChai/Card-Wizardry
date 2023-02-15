package ui;

import model.Shop;
import model.User;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Card Wizardry! \nIn this game, you will buy and sell cards, edit your decks,"
                + " and battle ferocious enemies. ");
        System.out.println("Your journey begins in a dark forest, where you've been wandering for days on end,"
                + " lost beyond lost.");
        User user = new User();
        ShopUI shopUI = new ShopUI(user);
    }
}
