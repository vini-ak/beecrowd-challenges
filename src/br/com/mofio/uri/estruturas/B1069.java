package br.com.mofio.uri.estruturas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B1069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int repeats = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < repeats; i++) {
            String entry = scanner.nextLine().strip();

            if (entry.length() > 1000) {
                entry = entry.substring(0, 1000);
            }

            int openBrackets = 0;
            int diamonds = 0;

            for (char c: entry.toCharArray()) {
                if (c == '<') {
                    ++openBrackets;
                } else if (c == '>' && openBrackets > 0) {
                    --openBrackets;
                    ++diamonds;
                }
            }

            System.out.println(diamonds);
        }
    }
}
