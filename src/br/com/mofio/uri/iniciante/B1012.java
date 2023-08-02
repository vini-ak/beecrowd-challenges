package br.com.mofio.uri.iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class B1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split((" "));

        double PI = 3.14159;
        double a = Double.valueOf(input[0]);
        double b = Double.valueOf(input[1]);
        double c = Double.valueOf(input[2]);

        double triangleArea = (a*c)/2;
        double circleArea = PI * Math.pow(c, 2);
        double trapeziumArea = ((a+b)*c) / 2;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a*b;

        System.out.println("""
                TRIANGULO: %.3f
                CIRCULO: %.3f
                TRAPEZIO: %.3f
                QUADRADO: %.3f
                RETANGULO: %.3f""".formatted(triangleArea, circleArea, trapeziumArea, squareArea, rectangleArea));
    }
}
