
/**
 * Write a description of class GumballMachine2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class GumballMachine2
{
    // 
    GumballMachine gumballMachine = new GumballMachine(5);
    int sum = 0;
    /**
     * Below function will perform loop for twice only
     *  If user fail to give money for second attemp then it will not process with GumBall Machine Two.
     **/
    public void GumballMachinetwo()
    {   

        System.out.println("Now, We will perform Same method for GumBallMachine Two");
        int money=accept_money();
        if(money != 25)
        {
            System.out.println("Please Enter Quarter Only !!");
            GumballMachinetwo();
        }
        else
        {
            sum = sum + money;
            perform_operation(sum);
        }
        

    }
    
     
    
     /**
     * Below function will accept the value from user.
     */
    static int accept_money(){
        
        int money_inserted;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Money for GumBallMachine Second = ");
        money_inserted=sc.nextInt();
        return money_inserted;
    }
    
    public void perform_operation(int money){
        if (money < 50)
        {
            
            System.out.println("You have enetered less Amount ! Please enter remaining Amount. You need to enter total of 50 Cents !!");
            GumballMachinetwo();
        }
        else
        {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
        }
    }
    
}
