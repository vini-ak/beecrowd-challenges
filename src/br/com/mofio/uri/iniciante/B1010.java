package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1010 {
    public static void main(String[] args) {
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        String[] product1 = scanner.nextLine().split((" "));
        int product1Qtd = Integer.parseInt(product1[1]);
        double product1Value = Double.valueOf(product1[2]);
        total += product1Qtd * product1Value;

        String[] product2 = scanner.nextLine().split((" "));
        int product2Qtd = Integer.parseInt(product2[1]);
        double product2Value = Double.valueOf(product2[2]);
        total += product2Qtd * product2Value;


        System.out.println("VALOR A PAGAR: R$ %.2f".formatted(total));
    }
}
