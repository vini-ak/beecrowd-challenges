package br.com.mofio.uri.estruturas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B1259 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalOfNums = scanner.nextInt();

        List<Integer> evenNums = new ArrayList<Integer>();
        List<Integer> oddNums = new ArrayList<Integer>();

        for (int i = 0; i < totalOfNums; i++) {
            int num = scanner.nextInt();

            if(num % 2 == 0) {
                evenNums.add(num);
            } else {
                oddNums.add(num);
            }
        }

        List<Integer> response = new ArrayList<>();

        Collections.sort(evenNums);
        Collections.sort(oddNums, Collections.reverseOrder());

        response.addAll(evenNums);
        response.addAll(oddNums);

        for (Integer i : response) System.out.println(i);
    }
}