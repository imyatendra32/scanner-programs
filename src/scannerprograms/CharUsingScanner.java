package scannerprograms;

import java.util.Scanner;

public class CharUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type any character");
        String chr = sc.next();
        System.out.println(chr);
    }
}
