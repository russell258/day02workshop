package sg.edu.nus.iss;

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

    }
}
