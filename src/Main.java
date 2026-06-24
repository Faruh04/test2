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
            scanner.nextLine(); // if there any letters


            switch(option){ //To choose

                            case 1:

                                System.out.println("Balance: " + balance + "$"); // Show balance

                            break;



                            case 2:

                                    System.out.println("Write how much you want to add! \n \n");
                                    float depo = scanner.nextFloat();
                                    balance = balance + depo; // to add to balance
                                    System.out.println("Your balance after adding money: " + balance + "$");

                            break;



                            case 3:

                                    System.out.println("Write your withdraw: ");
                                    float withdraw = scanner.nextFloat();

                                        if(withdraw > balance){

                                            System.out.println("Sorry, you dont have enough money!");

                                        }
                                        else {

                                            balance = balance - withdraw;
                                            System.out.println("Your balance after withdraw: " + balance + "$");

                                        }
                            break;


                            case 4:

                                        System.out.println("Have a nice day!");
                                        scanner.close();

                            return;

            }
        }
    }
}