package scannerprograms;

import java.util.Scanner;

public class SumUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any one integer digit");
        int a = sc.nextInt();
        System.out.println("enter any second integer digit");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Final Result ");
        System.out.println(sum);
    }
}
