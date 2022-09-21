package Exersises1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
     int fee = Integer.parseInt(scanner.nextLine());
     double sneakersprice = fee - (fee * 40 / 100.00);
     double kitprice = sneakersprice - (sneakersprice * 20 / 100);
     double ballprice = kitprice / 4;
     double accesoriesprice = ballprice / 5;

     double totalprice = sneakersprice + kitprice + ballprice + accesoriesprice + fee;

        System.out.println(totalprice);




    }
}
