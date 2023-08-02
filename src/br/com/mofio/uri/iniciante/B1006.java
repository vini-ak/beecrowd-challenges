package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double media = ((2*a) + (3*b) + (5*c)) / 10;

        System.out.println("MEDIA = %.1f".formatted(media));
    }
}
