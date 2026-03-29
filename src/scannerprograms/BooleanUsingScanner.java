package scannerprograms;

import java.util.Scanner;

public class BooleanUsingScanner {
    public static void main(String[] args) {
        System.out.println("Enter any value");
        Scanner sc = new Scanner(System.in);
        boolean str = sc.hasNextInt();
        System.out.println(str);
        sc.close();
    }
}

