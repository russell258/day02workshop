package sg.edu.nus.iss;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccount bankAccount1 = new BankAccount("Russell Chin", "12345678", (float) 939.58);
        bankAccount1.withdraw((20.51f));

        System.out.println(bankAccount1.toString());
        
        bankAccount1.getTransactions();
        bankAccount1.setClosed(true);

        for (String trn: bankAccount1.getTransactions()){
            System.out.println(trn);
        }

        int n = 5;
        BankAccount [] bankAcct = new BankAccount[n];

        for (int i = 0 ; i < bankAcct.length; i++) {
            String uuid = UUID.randomUUID().toString();

            float min = 1000.00f;
            float max = 100000.00f;
            Random randomNum = new Random();
            float initialBalance = min + randomNum.nextFloat();

            bankAcct[i] = new BankAccount("Employee " + String.valueOf(i), uuid, initialBalance);
        }

        bankAcct[0].showAccount();
        bankAcct[0].withdraw(100.00f);
        bankAcct[0].showAccount();

    }
}
