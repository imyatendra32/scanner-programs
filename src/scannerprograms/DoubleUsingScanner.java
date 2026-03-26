package scannerprograms;

import java.util.Scanner;

public class DoubleUsingScanner {
    public static void main(String[] args) {
        System.out.println("Enter a double Value");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println(num);
    }
}

