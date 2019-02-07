import java.util.Scanner;
/**
 * Write a description of class GumballMachine3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumballMachine3
{

    int sum = 0;
    
    /**
     * Below function will perform loop until it will get amount 50.
     * It will be performed untill it will complete till Cent 50.
     **/
    public void GumballMachine3()
    {
 
        GumballMachine gumballMachine = new GumballMachine(5);
        int money=accept_money();
        sum = sum + money;
        money = sum;
        
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

}
