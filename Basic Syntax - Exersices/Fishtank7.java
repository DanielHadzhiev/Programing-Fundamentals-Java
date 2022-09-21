package Exersises1;

import java.util.Scanner;

public class Fishtank7 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int length = Integer.parseInt(scanner.nextLine());
     int width = Integer.parseInt(scanner.nextLine());
     int hight = Integer.parseInt(scanner.nextLine());


     double percent=Double.parseDouble(scanner.nextLine());

     int volumesm=length * width * hight;
     double volumeds=volumesm/1000.00;

     double needwater=volumeds * (1-percent / 100);

     System.out.println(needwater);




    }
}
