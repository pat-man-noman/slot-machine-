import java.util.Scanner;
import java.util.Random;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int machine = 1000;
    int userAmount = 200;
    public static void main(String[] args) {
        Main main = new Main();
        Random random = new Random();
        int currentAmount = main.userAmount;
        int currentMachine = main.machine;

        while (true){
            Scanner input = new Scanner(System.in);
            System.out.println("machine: "+currentMachine);
            System.out.println("userAmount: "+currentAmount);
            System.out.print("option: Spin or Cash" );
            String option = input.nextLine();
            if (option.equals("spin")){
                slotMachine a = new slotMachine();
                slotMachine b = new slotMachine();
                slotMachine c = new slotMachine();
                currentAmount -= 5;
                currentMachine += 5;
                System.out.println("["+a.a+"|"+b.b+"|"+c.c+"]");
                if (a == b){
                    if (a == c){
                        currentAmount += 20;
                        currentMachine -= 20;
                    } else {
                    currentAmount += 2;}
                    currentMachine -= 2;
                }

            } else if (option.equals("cash")){
                if (currentAmount >= 200){
                    int amountWon = currentAmount - 200;
                    System.out.println("YOU WON $"+amountWon+"]");
                    System.exit(0);
                } else {
                    int amountLost = 200 - currentAmount;
                    System.out.println("YOU LOST $"+amountLost+"]");
                    System.exit(0);
                }
            } else if (currentAmount == 0) {
                System.out.println("You don't have enough money");
                System.exit(0);

            } else {
                System.out.println("Invalid option");
            }

        }

    }
}