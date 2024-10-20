package se.danielk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("-----Daniels Currency Converter!-----\n\n");
        System.out.printf("Choose an option.\n\n");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.printf("Answer: ");

        String chooseNumber = scanner.nextLine();
        System.out.println("\n\nEnter The amount.");
        System.out.printf("\nAmount: ");

        String chooseAmount = scanner.nextLine();



    }
}