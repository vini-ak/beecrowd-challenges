package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double media =((3.5*a) + (7.5*b)) / 11;

        System.out.println("MEDIA = %.5f".formatted(media));
    }
}
