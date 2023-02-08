import java.io.*;
import java.util.*;

class Account
{
    private String name;
    private int accountno;
    private static int balance;
    public static int accounttracer;
     Account(String name)
     {
         this.name=name;
         accountno=accounttracer;
     }
    
    public int getAccountNo()
    {
        return accountno;
    }
    public String getName()
    {
        return name;
    }
   
    public int getbalance()
    {
        return balance;
    }
        public void deposit(int amount)
    {
      balance =balance+amount;
            
        }
    public void withdraw(int amount)
    { 
        if ((balance-amount)<0)
            System.out.println("Negative Balance Transaction Cancelled");
    else{
      balance =balance-amount;
        }
    }
    public void display ()
    {
        System.out.println(accountno+" "+name+" "+balance);
    }

}

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int startacc=in.nextInt();
        in.nextLine();
        String name=in.nextLine();
        int noOftran=in.nextInt();
        in.nextLine();
        int amount;
        for(int i=0;i<noOftran;i++ )
        {
             String choice=in.next();
            Account b=new Account(name);
            b.accounttracer=startacc;
           
            if (choice.equals("Deposit"))
            {  amount=in.nextInt();
             b.deposit(amount);
             
            }
             if (choice.equals("Withdraw"))
            {  amount=in.nextInt();
             b.withdraw(amount);
             in.nextLine();
            }
            if (choice.equals("Display"))
            {
                b.display();
        
            }
        }
    }
}
