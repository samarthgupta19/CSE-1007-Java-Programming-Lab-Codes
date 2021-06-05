// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */

import java.util.Scanner;
public class Decipher
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println(" Enter A CaesarCode String : ");
        final String CaesarCode = sc.nextLine();
        System.out.println(" Enter Value of Shifting (n) : ");
        final int shift = sc.nextInt();
        String DecipherCaeserCode = "";
        for (int a = 0; a < CaesarCode.length(); ++a) {
            char letter = CaesarCode.charAt(a);
            if (letter >= 'a' && letter <= 'z') {
                letter -= (char)shift;
                if (letter < 'a') {
                    letter = (char)(letter - 'a' + 122 + 1);
                }
                DecipherCaeserCode = String.valueOf(DecipherCaeserCode) + letter;
            }
            else if (letter >= 'A' && letter <= 'Z') {
                letter -= (char)shift;
                if (letter < 'A') {
                    letter = (char)(letter - 'A' + 90 + 1);
                }
                DecipherCaeserCode = String.valueOf(DecipherCaeserCode) + letter;
            }
            else {
                DecipherCaeserCode = String.valueOf(DecipherCaeserCode) + letter;
            }
        }
        System.out.println(" The Plain Text String Is : " + DecipherCaeserCode.toUpperCase());
        sc.close();
    }
}