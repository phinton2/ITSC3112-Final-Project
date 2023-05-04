import java.io.*;
import java.util.*;

public class TheVastrooms {
    public static void main (String[] args) throws IOException {
        // stores variables
        String username = "";
        int repPoints = 0;
        String repString = "";
        Player p = new Player(username, repPoints, repString);
        Scanner scnr = new Scanner(System.in);
        String welcomeq = "Friendly Tour Guide: Welcome to The Vastrooms museum! \nFriendly Tour Guide: Before we leave the lobby to start your tour, what is your name?";

        // before tour starts...
        System.out.println(welcomeq);
        username = scnr.nextLine();
        while (!username.matches("[a-zA-Z]+")) { // if name is invalid
            System.out.println("Friendly Tour Guide: . . .");
            System.out.println("Friendly Tour Guide: Make sure your name doesn't have numbers or special characters!");
            username = scnr.nextLine();
        }
        System.out.println("Friendly Tour Guide: " + username + ", eh?" + "\nFriendly Tour Guide: It's nice to meet you, " + username + "! Let me know when you're ready to start the tour.");
        System.out.println("1) Start tour! \n2) Need a moment");
        int choice = scnr.nextInt();

        // exhibit 1,2,3 will inherit from parent exhibit although each class will have differing features 

        // tour begins
        int count = 0;
        while (choice != 1 && count < 5) { // when not going on tour
            if (count == 0)
            System.out.print("Friendly Tour Guide: That's okay! Let me know when you're ready to go.\n");
            System.out.println("1) Start tour! \n2) Need a moment");
            choice = scnr.nextInt();
            count++;
            if (choice != 1 && count == 1) {
                System.out.println("\nFriendly Tour Guide: Still not ready to go yet?");
            } else if (count == 2) {
                System.out.println("\nFriendly Tour Guide: Why are you still here?");
            } else if (count == 3) {
                System.out.println("\nFriendly Tour Guide: ...");
            } else if (count == 4) {
                System.out.println("\nFriendly Tour Guide: Leave.");
                System.exit(0);
            }
        }
        if (choice == 1) { // when going on tour
            // before tour starts
            System.out.println("\nFriendly Tour Guide: Great! Now, before we go in, there are a few things you should know.");
            System.out.println("Friendly Tour Guide: At present, the Vastrooms museum has three different exhibits: Mari, Rojhe, and Shigan.");
            System.out.println("Friendly Tour Guide: Each exhibit has its own artifacts that you can view. As a general rule, you should not touch the artifacts.");
            System.out.println("Friendly Tour Guide: Oh and speaking of rules, every exhibit here in the Vastrooms has their own set of them.");
            System.out.println("Friendly Tour Guide: You don't have to read them but it's highly advised that you do; rules change depending on where you are.");
            System.out.println("Friendly Tour Guide: When you break a rule, you can get a bad reputation. If this happens, your tour will end.");
            System.out.println("\nFriendly Tour Guide: I would hate to see you go though, so just keep a few things in mind:");
            System.out.println("\t1) Read the rules.\n\t2) Keep moving forwards to finish the tour.\n\t3) DO NOT go back the way you came.");
            System.out.println("Friendly Tour Guide: Now with that being said, let's get a move on!\n\n");
            // tour starts
            System.out.println("Friendly Tour Guide: The first exhibit area we'll be touring is the XXX.");
            System.out.println("Friendly Tour Guide: Would you like to read the rules before you start seeing the artifacts, " + username);
        }

    }




    
}