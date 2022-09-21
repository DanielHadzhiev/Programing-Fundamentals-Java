package Exersises1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double radians = Double.parseDouble (scanner.nextLine());
        double deegrees = radians * 180/Math.PI;
        System.out.println(deegrees);



    }


}
