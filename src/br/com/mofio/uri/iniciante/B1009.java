package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sellerName = scanner.nextLine();
        double salary = scanner.nextDouble();
        double totalOfSales = scanner.nextDouble();

        double bonus = totalOfSales * .15;
        salary += bonus;

        System.out.println("TOTAL = R$ %.2f".formatted(salary));
    }
}
