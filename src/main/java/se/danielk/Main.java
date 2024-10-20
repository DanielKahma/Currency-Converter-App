package se.danielk;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("-----Daniels Currency Converter!-----\n\n");
        System.out.println("Choose an option.\n\n");
        System.out.println("1. Convert SEK to USD");
        System.out.println("2. Convert USD to SEK");
        System.out.println("3. Convert SEK to Euro");
        System.out.println("4. Convert Euro to SEK");
        System.out.println("Option: ");

        int option = scanner.nextInt();


        switch (option) {

            case 0:
                System.out.println("Thanks for using the currency converter!");
                return;


            case 1:
            System.out.println("Enter the amount of SEK you would like to convert: ");

                double SEK = scanner.nextDouble();


                if (SEK > 0) {
                    System.out.println(SEK + " SEK equals to " + SEK * 0.09 + " USD");
                } else {
                    System.out.println("Invalid Amount!");
                }


                break;

        case 2:
                System.out.println("Enter the amount of USD you would like to convert: ");

                double USD = scanner.nextDouble();

                if (USD > 0) {
                    System.out.println(USD + "USD equals to " + USD * 10.52 + " SEK");
                } else {
                    System.out.println("Invalid Amount!");
                }

                break;

            case 3:
                System.out.println("Enter the amount of SEK you would like to convert: ");

                double SEK2 = scanner.nextDouble();

                if (SEK2 > 0) {
                    System.out.println(SEK2 + " SEK equals to " + SEK2 * 0.08 + " EURO");
                } else {
                    System.out.println("Invalid Amount!");
                }

                break;

            case 4:
                System.out.println("Enter the amount of EURO you would like to convert: ");

                double EURO = scanner.nextDouble();

                if (EURO > 0) {
                    System.out.println(EURO + " EURO equals to " + EURO * 11.43 + " SEK");
                } else {
                    System.out.println("Invalid Amount!");
                }

                break;


            default:
                System.out.println("Invalid Answer!");


        }



    }



}

