package Exersises1;

import java.util.Scanner;

public class Exercises6 {
    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   int найлон = Integer.parseInt(scanner.nextLine());
   int боя = Integer.parseInt(scanner.nextLine());
   int разбоя = Integer.parseInt(scanner.nextLine());
   int майстори = Integer.parseInt(scanner.nextLine());

   double найлонprice = найлон * 1.50;
   double бояprice = боя * 14.50;
   double разбояprice = разбоя * 5.00;
   double materials = (бояprice + бояprice * 10 / 100.00) + (найлонprice + 2 * 1.50) + разбояprice +0.40;
   double майсториprice = майстори * (materials * 30 / 100);

double total = майсториprice + materials;
System.out.println(total);


    }
}
