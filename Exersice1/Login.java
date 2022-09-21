package Ex1;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int count=0;

        for (int positon =username.length()-1;  positon >=0 ; positon--){
char currentsymbol = username.charAt(positon);
password+=currentsymbol;
        }
        String enteredpassword = scanner.nextLine();

        while (!enteredpassword.equals(password)){
            count++;
            if(count==4){
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredpassword= scanner.nextLine();
        }
        if(enteredpassword.equals(password)){
            System.out.printf("User %s logged in.",username);
        }
        else {
            System.out.printf("User %s blocked!",username);
        }
    }
}
