package Ex1;

import java.util.Scanner;

public class PadwanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyavailable = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsaberprice = Double.parseDouble(scanner.nextLine());
        double robesprice = Double.parseDouble(scanner.nextLine());
        double beltprices = Double.parseDouble(scanner.nextLine());
        int freebelts =0;


        if(students >= 6){
      freebelts=students/6;}
        double all = lightsaberprice*(students+Math.ceil(students*0.1))
                +robesprice*(students)
                +beltprices*(students-freebelts);
        if (moneyavailable>=all){
            System.out.printf("The money is enough - it would cost %.2flv.",all);
        }
        else{
            System.out.printf("George Lucas will need %.2flv more.",all-moneyavailable);
        }
    }
}
