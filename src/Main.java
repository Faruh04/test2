import java.util.Scanner;

public  class Main {
    public static void main(String[] args){

        float balance = 123123.123f;

        while (true){


            Scanner scanner = new Scanner(System.in);


            System.out.println("Welcome to ATM by Faruh \n \n");
            System.out.println("1.Check balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit \n \n");

            System.out.println("Choose your option: ");
            int option = scanner.nextInt();
            scanner.nextLine();


            switch(option){

                case 1:
                    System.out.println("Balance: " + balance + "$");






            }




        }


































    }






















}