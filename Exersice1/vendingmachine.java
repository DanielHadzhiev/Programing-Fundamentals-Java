package Ex1;

import java.util.Scanner;

public class vendingmachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // vending machine --------> until start receive money 'only 0.1, 0.2, 0.5 , 1, 2 -------- if other are inserted print "cannot accept"'

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f%n", coins);
            }

            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {

            switch (input) {

                case "Nuts":
                    if (sum >= 2.0) {
                        sum -= 2.0;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.println("Purchased Water");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.println("Purchased Crisps");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.println("Purchased Soda");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.println("Purchased Coke");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;

                default:
                    System.out.println("Invalid product");
                    break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f%n", sum);


    }
}
