package Exersises1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
int chiken = Integer.parseInt(scanner.nextLine());
int fish = Integer.parseInt(scanner.nextLine());
int vegan = Integer.parseInt(scanner.nextLine());

double chikenprice = chiken * 10.35;
double fishprice = fish * 12.40;
double veganprice = vegan * 8.15;

double total = chikenprice + fishprice +veganprice+ (chikenprice + fishprice + veganprice)*20/100.00 +2.50;

        System.out.println(total);

    }
}
