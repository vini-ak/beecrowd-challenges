package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diff = a*b - c*d;
        System.out.println("DIFERENCA = %d".formatted(diff));
    }
}
