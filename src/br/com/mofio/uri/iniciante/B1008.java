package br.com.mofio.uri.iniciante;

import java.util.Scanner;

public class B1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = scanner.nextInt();
        int workedHours = scanner.nextInt();
        double hourlyIncome = scanner.nextDouble();

        double monthlyIncome = workedHours * hourlyIncome;

        System.out.println("""
                NUMBER = %d
                SALARY = U$ %.2f""".formatted(employeeNumber, monthlyIncome));
    }
}
