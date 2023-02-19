package CreateProject;

import java.util.Scanner;

public class ATMmachineProject {
    public static void main(String[] args) {
        
        long balance = 199909989, withdraw , deposit;
        Scanner scn=  new Scanner(System.in);

        System.out.println("_____||Welcome to simplified ATM machine||_____");
        System.out.println("select 1 for withdraw");
        System.out.println("select 2 for deposit");
        System.out.println("select 3 for balance");
        System.out.println("select 4 for exit");
        
        System.out.print("Choose the operation you want to perform : ");

        int t = scn.nextInt();
        while(true){
            if(t == 1){
                System.out.print("Kindly enter the amount want to be withdraw : ");
                withdraw = scn.nextInt();

                if(balance >= withdraw){
                    balance -= withdraw;
                    System.out.println("Please collect your cash");
                }else{
                    System.out.println("Insufficient Balance");
                }
                break;
            }else if(t == 2){
                System.out.print("Kindly enter the amount want to be deposit : ");
                deposit = scn.nextInt();
                balance += deposit;
                System.out.println("Your money has been successfully deposited in your bank account");
                break;
            }else if(t == 3){
                System.out.println("Your Balance is "+balance);
                break;
            }else if(t == 4){
                break;
            }else{
                System.out.println("Please select from the given options only");
                break;
            }
        }
    }
}
