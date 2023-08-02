package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class b1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radio = scanner.nextDouble();
        double area = 3.14159 * Math.pow(radio, 2);

        System.out.println("A=%.4f".formatted(area));

    }
}
