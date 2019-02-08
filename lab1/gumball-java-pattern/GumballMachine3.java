import java.util.Scanner;
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3
{
      GumballMachine gumballMachine = new GumballMachine(5);
      int sum = 0;
    
    /**
     * Below function will perform loop until it will get amount 50.
     * It will be performed untill it will complete till Cent 50.
     **/
    public void GumballMachine3()
    {

        int money=accept_money();
        
        if(money == 5 || money == 10 || money == 25)
        {
            sum = sum + money;
            perform_operation(sum);
        }
        else
        {
           System.out.println("Please Enter Nickel, Dime, Quarter Only !!");
           GumballMachine3();
        }

        

    }
    
    
        
    /**
     * Below function will accept value from user.
    **/
     static int accept_money(){
        
        int money_inserted;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Money for GumBallMachine Three = ");
        money_inserted=sc.nextInt();
        return money_inserted;
        
    }

    public void perform_operation(int money){
        if (money < 50)
        {
            
            System.out.println("You have enetered less Amount ! Please enter remaining Amount. You need to enter total of 50 Cents !!");
            GumballMachine3();
            
        }
        else if (money > 50 )
        {
            
            System.out.println(gumballMachine);
            int extra_amt = money - 50;
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.printf("Please collect Remaining Amount = %d", extra_amt);
            
        }
        else
        {

            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            
        }
    }
}
