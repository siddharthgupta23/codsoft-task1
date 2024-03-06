

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;
import java.util.Scanner;

public class number2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random ran = new Random();
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        int randomNumber = numbers[ran.nextInt(100)];

        int number1 = 0; // Initialize number1 outside the loop

        while (true) {
            System.out.println("Enter the choice:");
            int choice = scanner.nextInt();

           
            System.out.println("The choice entered by user: " + choice);

            switch (choice) {
                case 1 -> {
                    if (number1 == 0) {
                        System.out.println("Enter the number by user:");
                        number1 = scanner.nextInt();
                    }
                    System.out.println("Comparing two numbers:");
                    if (number1 == randomNumber) {
                        System.out.println("The number is correct.");
                        return; // exit the program if correct number is found
                    } else {
                        System.out.println("The number is wrong.");
                    }
                }
                case 2 -> {
                    if (number1 == 0) {
                        System.out.println("Please enter a number first (choose option 1).");
                    } else {
                        System.out.println("Determining if the number is too small or too high:");
                        for (int f = 0; f < 5; f++) {
                            if (number1 > randomNumber) {
                                System.out.println("Enter a smaller number:");
                                number1 = scanner.nextInt();
                            } else if (number1 < randomNumber) {
                                System.out.println("Enter a larger number:");
                                number1 = scanner.nextInt();
                            } else {
                                System.out.println("It is the correct number.");
                                return; // exit the program if correct number is found
                            }
                        }
                    }
                }
                case 3 -> {
                    System.out.println("You want to quit the game.");
                    return; // exit the program
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
