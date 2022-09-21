package Ex1;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostgames = Integer.parseInt(scanner.nextLine());
        double headsetprice = Double.parseDouble(scanner.nextLine());
        double mouseprice = Double.parseDouble(scanner.nextLine());
        double keyboardprice = Double.parseDouble(scanner.nextLine());
        double displayprice = Double.parseDouble(scanner.nextLine());

        int countheadset = lostgames/2;
        int countmouse = lostgames/3;
        int countkeyboard = lostgames/6;
        int countdisplay = lostgames/12;

double all = countmouse*mouseprice+countheadset*headsetprice+countkeyboard*keyboardprice+countdisplay*displayprice;
        System.out.printf("Rage expenses: %.2f lv.",all);

    }
}
