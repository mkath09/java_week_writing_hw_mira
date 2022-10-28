package homework_week7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class Programme_1_OddEvenTernaryOperator {

    public static void main(String[] args) {
        //Scanner declartion for reading input from console
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddEvenNumber(number);
        //Closing the scanner object
        scanner.close();



    }
    //Checking the number odd or even
    public static void isItOddEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0)?"Even":"Odd";
        System.out.println("The "+number +"is "+"is "+evenOrOdd+" number");


    }
}
