package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");

        int higher;

        int a = Integer.valueOf(values[0]);
        int b = Integer.valueOf(values[1]);
        int c = Integer.valueOf(values[2]);

        higher = B1013.formula(a, b);
        higher = B1013.formula(higher, c);

        System.out.println("%d eh o maior".formatted(higher));
    }

    public static int formula(int value1, int value2) {
        return (value1 + value2 + Math.abs(value1 - value2)) / 2;
    }
}
