package dev.desktop;
import java.util.Scanner;
public class util {
    // helper methods
    public static String ask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">");
        return scanner.nextLine().replace(" ", "");
    }
}
