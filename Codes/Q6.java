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
import java.util.NoSuchElementException;
public class Q6
{
    static void validate(final String regnum, final String mob) {
        Label_0118: {
            try {
                if (regnum.length() != 9) {
                    System.out.println("INVALID");
                    throw new IllegalArgumentException("REGISTRATION NUMBER DOES NOT HAVE EXACTLY 9 CHARACTERS");
                }
                int var1 = 0;
                try {
                    for (int i = 0; i < regnum.length(); ++i) {
                        if (Character.isDigit(regnum.charAt(i)) || Character.isLetter(regnum.charAt(i))) {
                            ++var1;
                        }
                    }
                    if (var1 == regnum.length()) {
                        System.out.println("VALID");
                        break Label_0118;
                    }
                    throw new NumberFormatException("INVALID");
                }
                catch (NumberFormatException e) {
                    System.out.println(e);
                }
            }
            catch (IllegalArgumentException e2) {
                System.out.println(e2);
            }
            try {
                if (mob.length() != 10) {
                    System.out.println("INVALID");
                    throw new IllegalArgumentException("MOBILE NUMBER DOES NOT HAVE EXACTLY 10 DIGITS");
                }
                int var2 = 0;
                try {
                    for (int i = 0; i < mob.length(); ++i) {
                        if (Character.isDigit(mob.charAt(i))) {
                            ++var2;
                        }
                    }
                    if (var2 == mob.length()) {
                        System.out.println("VALID");
                        return;
                    }
                    throw new NoSuchElementException("INVALID");
                }
                catch (NoSuchElementException e3) {
                    System.out.println(e3);
                }
            }
            catch (IllegalArgumentException e2) {
                System.out.println(e2);
            }
        }
    }
    
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("ENTER REGISTRATION NUMBER : ");
        final String reg_num = sc.nextLine();
        System.out.println("ENTER MOBILE NUMBER : ");
        final String mob_num = sc.nextLine();
        sc.close();
        validate(reg_num, mob_num);
    }
}