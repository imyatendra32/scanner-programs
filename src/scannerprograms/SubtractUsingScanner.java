package scannerprograms;

import java.util.Scanner;

public class SubtractUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first digit ");
        int a = sc.nextInt();
        System.out.println("Enter the second digit ");
        int b = sc.nextInt();
        System.out.println("Result ");
        int diff = a-b;
        System.out.println(diff);




    }
}
