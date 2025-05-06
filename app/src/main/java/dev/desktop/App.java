package dev.desktop;

public class App {
    public static void main(String[] args) throws InterruptedException {
        mainMenu();
    }
    protected static void mainMenu() throws InterruptedException {
        System.out.println("textCiv v0.1 by Bruce Li");
        Thread.sleep(500);
        System.out.println("1. New Game\n2. Load Game\n3. Quit Game");
        String ans = util.ask();
        if (ans.equals("1")) {
            newGameSelection();
        } else if (ans.equals("2")) {
            loadGame();
        } else {
            System.exit(0);
        }
    }
    protected static void newGameSelection() throws InterruptedException{
        System.out.println("1. New Game\n2. Historical Campaign\n3. Back");
        String ans = util.ask();
        switch (ans) {
            case "1":
                Game g = new Game();
                g.create();
                break;
            case "2":
                historicalCampaignInterface();
            default:
                mainMenu();
        }
    }
    protected static void loadGame() {
        // todo
    }
    protected static void historicalCampaignInterface() {
        // todo
    }
}
