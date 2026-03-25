package scannerprograms;

import java.util.Scanner;

public class LongUsingScanner {
    public static void main(String[] args) {
        System.out.println("Enter any long number ");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        System.out.println("you Entered , " + num);
        sc.close();
    }
}