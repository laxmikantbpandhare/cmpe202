import java.util.Scanner;
/**
 * Write a description of class GumBallMachineThree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumBallMachineThree
{
    // instance variables - replace the example below with your own
    
    private int x;
    int sum = 0;
    GumballMachine gumballMachine = new GumballMachine(5);

    /**
     * Constructor for objects of class GumBallMachineThree
     */
    public void GumBallMachineThree(int y)
    {

        if(y > 50){
          
          y = y - 50; 
          System.out.printf( "\nYou have entered more amount that required ! Please collect your amount = %d and Gumball too\n",y) ;  
          gumballMachine.insertQuarter(25);
          gumballMachine.turnCrank();
        
        }
        
        else if (y < 50){
        
                System.out.println( "Sorry, can't get GumBall in this Amount. You need to have atleast 50 Cents. Please insert More" ) ;
                //sum = sum + y;
                sum = y;
                System.out.println("Enter the Amount = ");
                Scanner sc=new Scanner(System.in);
                int sum1=sc.nextInt();
                sum1 = sum1 + sum;
                GumBallMachineThree(sum1);
                //main.perform_action_switch();
                
        }
        else{
             
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    /*public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }*/
}
