package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class programme_6_OldEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the the number you want to check : ");
        int number = scanner.nextInt();
       programme_6_OldEven oldEven = new programme_6_OldEven();
        System.out.println(number +"is "+ oldEven.isItEvenOrOldNumber(number)+"number");
        scanner.close();

    }

    //Checking the odd or even
    public String isItEvenOrOldNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}
