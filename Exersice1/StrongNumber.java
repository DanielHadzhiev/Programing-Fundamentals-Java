package Ex1;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

int num = Integer.parseInt(scanner.nextLine());
int startnum= num;
int sum=0;

  while(num>0){
  int lastdigit = num%10;
      int fact=1;
      for (int i = 1; i <=lastdigit ; i++) {
          fact=fact*i;
      }
      sum+=fact;
  num= num/10;
       }
  if (startnum==sum){
      System.out.println("yes");
  }
  else {
      System.out.println("no");
  }
    }
}
