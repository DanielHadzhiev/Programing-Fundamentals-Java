package Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class Sortnum {
    public static void main(String[] args) {
       Scanner scanner=  new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int middle = 0;

        if(num1>num2&&num1>num3){
            max=num1;
        }
        else if(num2>num1&&num2>num3){
            max=num2;
        }
        else if(num3>num1&&num3>num2){
            max=num3;
        }
        if(num1>num2&&num1<num3){
            middle=num1;
        }
        else if(num1>num3&&num1<num2){
            middle=num1;
        }
        else if(num2>num1&&num2<num3){
            middle=num2;
        }
        else if (num2>num3&&num2<num1){
            middle= num2;
        }
        else if (num3>num1&&num3<num2){
            middle=num3;
        }
        else if (num3>num2&&num3<num1){
            middle=num3;
        }
        else if(num1<num2&&num1<num3){
            min=num1;
        }
        else if(num2<num1&&num2<num3){
            min=num2;
        }
        else if (num3<num1&&num3<num2){
            min=num3;
        }



        System.out.printf("%d%n%d%n%d%n",max,middle,min);
    }
}
