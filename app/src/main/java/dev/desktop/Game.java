package dev.desktop;
import java.util.HashMap;
import java.util.Random;
import java.util.ArrayList;

public class Game {
    ArrayList<String> playerRes = new ArrayList<>();
    HashMap<String, Integer> playerUnits = new HashMap<>();
    HashMap<String, ArrayList<String>> res = new HashMap<>();    
    HashMap<String, HashMap<String, Integer>> units = new HashMap<>();
    // unique unit assigment
    String unique;
    public Game() {

    }
    public void create() {
        int genAmount;
        String playerFaction;
        // create a game
        System.out.println("Select Game Size (min 1, max 6).");
        String ans = util.ask();
        genAmount = Integer.parseInt(ans);
        if (genAmount < 1 || genAmount > 6) {
            System.out.println("Invalid input. Please enter a number between 1 and 6.");
            create();
        }
        System.out.println("Select a faction:\n" +
              "1. Aztec\n" +
              "2. Babylonian\n" +
              "3. Chinese\n" +
              "4. Egyptians\n" +
              "5. Greeks\n" +
              "6. Romans");
        ans = util.ask();
        if (ans.equals("1")) {
            playerFaction = "Aztec";
        } else if (ans.equals("2")) {
            playerFaction = "Babylonian";
        } else if (ans.equals("3")) {
            playerFaction = "Chinese";
        } else if (ans.equals("4")) {
            playerFaction = "Egyptians";
        } else if (ans.equals("5")) {
            playerFaction = "Greeks";
        } else {
            playerFaction = "Romans";
        } 
        Random rand = new Random();
        while (genAmount > 0) {
            int num = rand.nextInt(5);
            if (num == 0) {
                res.put("Aztec", new ArrayList<String>());
            }
            // todo
            genAmount -=1;

        }
    }
}
