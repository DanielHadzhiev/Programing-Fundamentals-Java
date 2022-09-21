package Exersises1;

import java.util.Scanner;

public class Exerscise3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    double deposit = Double.parseDouble(scanner.nextLine());
    int months = Integer.parseInt(scanner.nextLine());
    double percent = Double.parseDouble(scanner.nextLine());
    //сума = депозирана сума + срок на депозита *((депозирана сума * годишен ихвен процент))

   double result = deposit + months * ((deposit * percent / 100) / 12);

   System.out.println(result);




    }



}
