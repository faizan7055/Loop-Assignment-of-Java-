//Que.5 -> Write a Java program to generate and print the first 'n' terms of the Fibonacci series.

import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term below which you want Fibonacci Series = ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}