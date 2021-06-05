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
public class Q4
{
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final sav_acct s1 = new sav_acct();
        System.out.println("Customer Name : ");
        sc.nextLine();
        System.out.println("Account Number : ");
        final long anum = sc.nextLong();
        System.out.print("Enter Amount : ");
        float amt = sc.nextFloat();
        s1.setBal(amt);
        System.out.println("New Balance : " + s1.getBal());
        System.out.println("\nCalculating Compound Interest");
        System.out.print("Enter Principle Amount : ");
        final float principle = sc.nextFloat();
        System.out.print("Enter Rate Percentage : ");
        final float rate = sc.nextFloat();
        System.out.print("Enter Time (In Years) : ");
        final float time = sc.nextFloat();
        sav_acct.compound(rate, time, principle);
        System.out.println("\nCreating Current Bank Account");
        System.out.print("Enter Minimum Balance : ");
        amt = sc.nextFloat();
        final cur_acct c1 = new cur_acct(2, amt);
        System.out.print("Enter Balance : ");
        final float b = sc.nextFloat();
        c1.setBal(b);
        System.out.println("New Balance : " + c1.getBal());
        System.out.print("Enter Amount To Withdraw : ");
        amt = sc.nextFloat();
        c1.withdraw(amt);
        sc.close();
    }
}
//--------------------------------------
class sav_acct extends Account
{
    sav_acct() {
        System.out.println("Savings Account");
    }
    
    public static void compound(final float rate, final float time, final float principle) {
        final float cI = (float)(principle * Math.pow(1.0f + rate / 100.0f, time));
        System.out.println("Compound Interest : " + cI);
    }
}