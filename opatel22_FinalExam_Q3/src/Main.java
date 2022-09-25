import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Object of type BankAccount
        BankAccount inform = new BankAccount(500.00);

        //Opening deposits.txt file and declaring scanner of the deposits.txt file
        File depositFile = new File("deposits.txt");
        Scanner depositScan = new Scanner(depositFile);

        //Reading the deposits.txt file and input the values into the object
        while(depositScan.hasNextDouble())
            inform.deposit(depositScan.nextDouble());


        //Opening withdrawals.txt file and declaring scanner of the withdrawals.txt file
        File withdrawFile = new File("withdrawals.txt");
        Scanner withdrawScan = new Scanner(withdrawFile);

        //Reading the withdrawals.txt file and input the values into the object
        while(withdrawScan.hasNextDouble())
            inform.withdraw(withdrawScan.nextDouble());


        //Outputting line stating the ending balance
        System.out.println("The ending balance is: " + inform.getBalance());


    }
}
