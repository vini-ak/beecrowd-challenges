package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = a * b;

        System.out.println("PROD = %d".formatted(prod));
    }
}
