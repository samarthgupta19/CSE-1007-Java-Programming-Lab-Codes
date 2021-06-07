// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */

/**
 *
 * @author Samarth Gupta
 */
import java.util.Scanner;
public class Q1
{
    public static void main(final String[] a) {
        final Scanner sc = new Scanner(System.in);
        final String[] r = new String[5];
        final int[] mark = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; ++i) {
            r[i] = sc.next();
            mark[i] = sc.nextInt();
            sum += mark[i];
        }
        for (int i = 0; i < 5; ++i) {
            char grade;
            if (mark[i] >= 90) {
                grade = 'S';
            }
            else if (mark[i] >= 80 && mark[i] < 90) {
                grade = 'A';
            }
            else if (mark[i] >= 70 && mark[i] < 80) {
                grade = 'B';
            }
            else if (mark[i] >= 60 && mark[i] < 70) {
                grade = 'C';
            }
            else if (mark[i] >= 50 && mark[i] < 60) {
                grade = 'D';
            }
            else {
                grade = 'F';
            }
            System.out.print(String.valueOf(r[i]) + " " + grade);
            System.out.println();
        }
        final double average = sum / 5;
        System.out.println("Class Average = " + average);
        sc.close();
    }
}
