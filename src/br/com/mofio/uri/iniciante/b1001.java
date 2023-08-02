package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class b1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;

        System.out.println("X = %d".formatted(sum));
    }
}
