//Que.4 -> Write a Java program to check if a given string is a palindrome or not using a loop.

import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string = ");
        String str = sc.nextLine();

        boolean flag = true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        sc.close();
    }
}