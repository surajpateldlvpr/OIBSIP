import java.util.*;
public class ATMInterface
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String userId = "interface@123";
        int pin = 4565;
        double balance = 10000;
        ArrayList<String> history = new ArrayList<>();
        System.out.println("===== ATM SYSTEM =====");
        System.out.print("Enter User ID: ");
        String id = sc.next();
        System.out.print("Enter PIN: ");
        int p = sc.nextInt();
        if (id.equals(userId) && p == pin) 
            {
            int choice;
            do 
            {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");
                choice = sc.nextInt();
                switch (choice) 
                {
                    case 1:
                        System.out.println("Balance = Rs." + balance);
                        break;
                    case 2:
                        System.out.print("Deposit Amount: ");
                        double dep = sc.nextDouble();
                        if (dep > 0) 
                            {
                            balance += dep;
                            history.add("Deposited Rs." + dep);
                            System.out.println("Deposit Successful");
                        } else 
                            {
                            System.out.println("Invalid Amount");
                        }
                        break;
                    case 3:
                        System.out.print("Withdraw Amount: ");
                        double wid = sc.nextDouble();
                          if (wid > 0 && wid <= balance) 
                            {
                            balance -= wid;
                            history.add("Withdraw Rs." + wid);
                            System.out.println("Please Collect Your Cash");
                        } 
                        else 
                            {
                            System.out.println("Invalid Amount or Insufficient Balance");
                        }
                        break;
                    case 4:
                        System.out.println("\n--- Transaction History ---");
                        if (history.isEmpty()) 
                            {
                            System.out.println("No Transactions Yet");
                        } 
                        else 
                            {
                            for (int i = 0; i < history.size(); i++) 
                                {
                                System.out.println((i + 1) + ". " + history.get(i));
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Thank You For Using Our ATM, have a great day");
                        break;
                    default:
                        System.out.println("Invalid Choice! please select a valid option");
                }
            } 
            while (choice != 5);
        } 
        else 
            {
            System.out.println("Invalid User ID or PIN");

        }

        sc.close();
    }
}
