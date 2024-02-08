//Que.1 -> Write a Java program to calculate the sum of natural numbers up to a given positive integer 'n'.

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive Integer = ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        if (n < 0) {
            System.out.println("Given value is negative. Please Enter positive integer");
        } else {
            System.out.println("The sum of First natural numbers up to " + n + " integers is : " + sum);
        }
        sc.close();
    }
}