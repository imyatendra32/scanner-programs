package scannerprograms;

import java.util.Scanner;

public class StringUsingScanner {
    public static void main(String[] args) {
        System.out.println("Enter any string ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( str);
        sc.close();
    }
}
