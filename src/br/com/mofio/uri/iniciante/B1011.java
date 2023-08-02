package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double PI = 3.14159;
        double volume = (4.0/3) * PI * Math.pow(radius, 3);

        System.out.println("VOLUME = %.3f".formatted(volume));
    }
}
