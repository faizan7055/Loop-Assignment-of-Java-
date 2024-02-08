//Que.2 -> Write a Java program to print a multiplication table for a given number 'n'.

import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the which No. you want to print table : ");
        int n = sc.nextInt();
        int x = 1;
        for (int i = n; i <= n * 10; i += n) {
            System.out.println(n + " * " + x + " = " + i);
            x++;
        }
        sc.close();
    }
}