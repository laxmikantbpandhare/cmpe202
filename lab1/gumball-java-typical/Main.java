import java.util.Scanner;

public class Main{
    
    GumballMachine gumballMachine = new GumballMachine(5);
      public static int loop = 0;
    public static void main(String[] args) {
        //public static int loop = 0;
        Main main = new Main();
        for(loop=0; loop< 5; loop++){
            main.perform_action_switch();
        }
    }
    
    public void perform_action_switch(){
        
        Main main = new Main(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter Options from below");
        System.out.println("1. GumBall Machine One - This needs 25 Cents");
        System.out.println("2. GumBall Machine Two - This needs 50Cents");
        System.out.println("3. GumBall Machine Three - This needs 50 Cents in total");
        System.out.println("0. Stop Execution");
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
        case 0:
              loop = 5;
              break;
        default:
              System.out.println("Please enter Valid Option Again");
              perform_action_switch();
              
    }
    }
    
    
    public void perform_gumballMachine_one(int amount){
        
        gumballMachine.insertQuarter(amount);
        gumballMachine.turnCrank();

    }
    
    public void perform_gumballMachine_two(int amount){
        GumBallMachineTwo gumballmachinetwo = new GumBallMachineTwo();
        if (amount != 25){
          System.out.println("You have entered an invalid amount ! Please insert Quarter only !"); 
        }
        else
        {
            System.out.println("Please enter Next Quarter = ");
            Scanner sc=new Scanner(System.in);
             int nextquarter=sc.nextInt();
             int total_amt = amount + nextquarter;
            gumballmachinetwo.perform_GumBallMachineTwo(total_amt);
        }
    }
    
    public void perform_gumballMachine_three(int amount){
        GumBallMachineThree gumballmachinethree = new GumBallMachineThree();
        if(amount == 5 || amount == 10 || amount == 25)
        {
             gumballmachinethree.GumBallMachineThree(amount);
        }
        else
        {
              System.out.println("You have entered an invalid amount ! Please insert Nickel, Dime or Quarter only !"); 
    }
}
}
