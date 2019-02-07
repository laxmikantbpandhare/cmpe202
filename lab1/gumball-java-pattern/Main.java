
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        GumballMachine2 gumballmachine2 = new GumballMachine2(); 
        GumballMachine3 gumballmachine3 = new GumballMachine3(); 
        
        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        
        System.out.println("Now, We will perform Same method for GumBallMachine Three");
        gumballmachine2.GumballMachinetwo();
        gumballmachine3.GumballMachine3();
    }
}
