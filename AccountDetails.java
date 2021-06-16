import java.util.*;
public class AccountDetails{
    
    public static Account getAccountDetails()
    {
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id:");
        acc.setAccountId(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter account type:");
        acc.setAccountType(sc.nextLine());
        int b;
        do{
            System.out.println("Enter balance");
            acc.setBalance(sc.nextInt());
            b= acc.getBalance();
            if(b<=0)
            {
                System.out.println("Balance should be positive");
            }
        }while(b<=0);
        return acc;
    }
    public static int getWithdrawAmount()
    {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();
        int w;
        do{
            System.out.println("Enter amount to be withdraw");
            w=sc.nextInt();
            if(w<=0)
            {
                System.out.println("Amount should be positive");
            }
        }while(w<=0);
        return w;
    }
    public static void main (String[] args) {
        Account obj1= new Account();
        obj1 = getAccountDetails();
        int c = getWithdrawAmount();
        obj1.withdraw(c);
    }
    // Fill the code here
    
}
