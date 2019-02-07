
/**
 * Write a description of class GumBallMachineTwo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GumBallMachineTwo //extends Main
{
    
    GumballMachine gumballMachine = new GumballMachine(5);
    
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class GumBallMachineTwo
     */
    /*public GumBallMachineTwo()
    {
        // initialise instance variables
        x = 0;
    }*/

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void perform_GumBallMachineTwo(int y)
    {
        //Main main = new Main();
        if(y > 50){
          
          y = y - 50; 
          System.out.printf( "\nYou have entered more amount that required ! Please collect your amount = %d and Gumball too\n",y) ;  
          gumballMachine.insertQuarter(25);
          gumballMachine.turnCrank();
        
        }
        
        else if (y < 50){
                Main main = new Main();
                System.out.println( "Sorry, can't get GumBall in this Amount. You need to have atleast 50 Cents." ) ;
                main.perform_action_switch();
                
        }
        else{
             
        gumballMachine.insertQuarter(25);
        gumballMachine.turnCrank();
        
        }
    }
}
