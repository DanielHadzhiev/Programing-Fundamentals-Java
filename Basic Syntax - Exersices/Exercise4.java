package Exersises1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    int pages = Integer.parseInt(scanner.nextLine());
    int pagesperhour = Integer.parseInt(scanner.nextLine());
    int days = Integer.parseInt(scanner.nextLine());

    int allhours = pages / pagesperhour;
    int hoursforreading = allhours/days;


    System.out.println (hoursforreading);





    }



}
