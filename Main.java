import java.util.Scanner;

public class Main{
    
    GumballMachine gumballMachine = new GumballMachine(5);
    
    public static void main(String[] args) {
        int loop = 0;
        Main main = new Main();
        for(loop=0; loop< 5; loop++){
            main.perform_action_switch();
        }
    }
    
    public void perform_action_switch(){
        
        Main main = new Main(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Options from below");
        System.out.println("GumBall Machine One - This needs 25 Cents");
        System.out.println("GumBall Machine Two - This needs 50Cents");
        System.out.println("GumBall Machine Three - This needs 50 Cents in total");
        System.out.println("Enter the Option == ");
        int gumBallMachine_number=sc.nextInt();
        int gumBallMachine_amount = 0;
        
        if (gumBallMachine_number < 4 && gumBallMachine_number > 0){
            
        System.out.println("Enter the Amount = ");
        gumBallMachine_amount=sc.nextInt();
        
    }
        
    switch(gumBallMachine_number){
        
        case 1:
              main.perform_gumballMachine_one(gumBallMachine_amount);
              break;
        case 2:
              main.perform_gumballMachine_two(gumBallMachine_amount);
              break;
        case 3: 
              main.perform_gumballMachine_three(gumBallMachine_amount);
              break;
        default:
              System.out.println("Please enter Valid Option Again");
              perform_action_switch();
              
    }
    }
    
    
    public void perform_gumballMachine_one(int amount){
        //System.out.println("Performing Gum Ball Machine One");
        gumballMachine.insertQuarter(amount);
        gumballMachine.turnCrank();
       // gumballMachine.setAccessible(true);
    //    if(has_quarter){
    //    perform_action_switch();
    //}
    }
    
    public void perform_gumballMachine_two(int amount){
        //System.out.println("Performing Gum Ball Machine Two");
        GumBallMachineTwo gumballmachinetwo = new GumBallMachineTwo();
        gumballmachinetwo.perform_GumBallMachineTwo(amount);
    }
    
    public void perform_gumballMachine_three(int amount){
        System.out.println("Performing Gum Ball Machine Three");
        GumBallMachineThree gumballmachinethree = new GumBallMachineThree();
        gumballmachinethree.GumBallMachineThree(amount);
    }
    
}
