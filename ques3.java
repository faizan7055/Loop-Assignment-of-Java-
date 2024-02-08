//Que.3 -> Write a Java program to find the GCD (Greatest Common Divisor) of two numbers using a loop.

import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number = ");
        int a = sc.nextInt();
        System.out.print("Enter Second number = ");
        int b = sc.nextInt();
        int gcd = 0;
        for (int i = 1; (i <= a && i <= b); i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        System.out.println("GCD (Greatest Common Divisor) is : " + gcd);
        sc.close();
    }
}