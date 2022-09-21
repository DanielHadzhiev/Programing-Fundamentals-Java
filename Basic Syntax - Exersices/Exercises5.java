package Exersises1;

import java.util.Scanner;

public class Exercises5 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

 int pens = Integer.parseInt(scanner.nextLine());
 int markers = Integer.parseInt(scanner.nextLine());
 int cleaner = Integer.parseInt(scanner.nextLine());
 int discount = Integer.parseInt(scanner.nextLine());


 double pensprice = pens * 5.80;
 double markersprice = markers * 7.20;
 double cleanersprice = cleaner * 1.20;

 double totalprice = pensprice + markersprice + cleanersprice;
 double totalpriceafterdiscount = totalprice -(totalprice * discount / 100);


 System.out.println(totalpriceafterdiscount);




    }





}
