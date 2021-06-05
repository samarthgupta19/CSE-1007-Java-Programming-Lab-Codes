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
public class Q2
{
    public static void main(final String[] args) {
        int a1 = 0;
        int e1 = 0;
        int i1 = 0;
        int o1 = 0;
        int u1 = 0;
        final Scanner obj = new Scanner(System.in);
        final String word = obj.nextLine();
        for (int j = 0; j < word.length(); ++j) {
            if (word.charAt(j) == 'a' || word.charAt(j) == 'A') {
                ++a1;
            }
            else if (word.charAt(j) == 'e' || word.charAt(j) == 'E') {
                ++e1;
            }
            else if (word.charAt(j) == 'i' || word.charAt(j) == 'I') {
                ++i1;
            }
            else if (word.charAt(j) == 'o' || word.charAt(j) == 'O') {
                ++o1;
            }
            else if (word.charAt(j) == 'u' || word.charAt(j) == 'U') {
                ++u1;
            }
        }
        if (a1 > 0 && e1 > 0 && i1 > 0 && o1 > 0 && u1 > 0) {
            System.out.println("This is a Vowelgram");
        }
        else {
            System.out.println("This is not a Vowelgram");
        }
        obj.close();
    }
}