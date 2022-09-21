package Ex1;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System .in);

        int amount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        if (day.equals("Friday")){
            if(type.equals("Students")){
                price=amount*8.45;
                if (amount>=30){
              price=price-price*0.15;
                }
            }if(type.equals("Business")){
                price=amount*10.9;
                if (amount>=100){
                    price=(amount-10)*10.9;
                }
            }if(type.equals("Regular")){
                price=amount*15;
                if (amount>=10 && amount<=20){
                    price= price-price*0.05;
                }
            }
        }
        else if (day.equals("Saturday")){
            if(type.equals("Students")){
                price=amount*9.80;
                if (amount>=30){
                    price=price-price*0.15;
                }
            }if(type.equals("Business")){
                price=amount*15.6;
                if (amount>=100){
                    price=(amount-10)*15.6;
                }
            }if(type.equals("Regular")){
                price=amount*20;
                if (amount>=10 && amount<=20){
                    price= price-price*0.05;
                }
            }
        }
        else if (day.equals("Sunday")){
            if(type.equals("Students")){
                price=amount*10.46;
                if (amount>=30){
                    price=price-price*0.15;
                }
            }if(type.equals("Business")){
                price=amount*16;
                if (amount>=100){
                    price=(amount-10)*16;
                }
            }if(type.equals("Regular")){
                price=amount*22.5;
                if (amount>=10 && amount<=20){
                    price= price-price*0.05;
                }
            }
        }
        System.out.printf("Total price: %.2f",price);
    }
}
