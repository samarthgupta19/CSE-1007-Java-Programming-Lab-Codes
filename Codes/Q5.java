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
package primespackage;

public class Prime {
	
    public static boolean checkPrime(int num) {
        int temp;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        
        return isPrime;
    }
}
//------------------------------------
import java.util.Scanner;
import primespackage.Prime;

public class TwinsPrime {
	public static void main(String args[]) {
		int i;
		
		//take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		sc.close();
		
		System.out.println("Twin prime numbers are: ");
		//checking twins prime
		for(i = n1; i <= n2; i++) {
			if(Prime.checkPrime(i) & Prime.checkPrime(i+2) & i > 1)
			{
				System.out.println("(" + i + "," + (i+2) + ")");
			}
		}
	}
}