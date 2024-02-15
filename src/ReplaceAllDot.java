package src;

import java.util.Scanner;

public class ReplaceAllDot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any words with dot: ");
        String text = scanner.nextLine();

        ReplaceAllDotImpl.replaceDots(text);
    }


}

