package Ex1;

import java.util.Scanner;

public class prereshenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum =0;

        while(!input.equals("Start")){
            double coins = Double.parseDouble(input);
            if (coins==0.1||coins==0.2||coins==0.5||coins==1||coins==2){
                sum+=coins;
            }
            else{
                System.out.printf("Cannot accept %f",coins);
            }
            input= scanner.nextLine();
        }
        input= scanner.nextLine();
        while(!input.equals("End")){
            if(input.equals("Nuts")&&sum>=2){
                sum-=2;
                System.out.println("Purchased Nuts");
            }
            else  {
                System.out.println("Not enough money");
            }input= scanner.nextLine();
             if(input.equals("Water")&&sum>=0.7){
                sum-=0.7;
                System.out.println("Purchased Water");
            }
            else{
                System.out.println("Not enough money");
            }input= scanner.nextLine();
            if(input.equals("Crisps")&&sum>=1.5){
                sum-=1.5;
                System.out.println("Purchased Crisps ");
            }
            else{
                System.out.println("Not enough money");
            }input= scanner.nextLine();
            if(input.equals("Soda")&&sum>=0.8){
                sum-=0.8;
                System.out.println("Purchased Soda ");
            }
            else{
                System.out.println("Not enough money");
            }input= scanner.nextLine();
            if(input.equals("Coke")&&sum>=1){
                sum-=1;
                System.out.println("Purchased Coke ");
            }
            else{
                System.out.println("Not enough money");
            }

            input=scanner.nextLine();
        }
        System.out.printf("Change %.2f",sum);
    }
}
