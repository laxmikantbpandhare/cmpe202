


import java.util.Arrays;
import java.util.List;

public class withLambda {

	public static void main(String [] args) {

		//Function call using Lambda
		
		List<BurgerCharges> burgerList =
				Arrays.asList(
						(burgerprice) -> { System.out.println("Organic Bason Charge"); return burgerprice + 4; },
						(burgerprice) -> { System.out.println("Quinoa Charges"); return burgerprice + 5 ; },
						(burgerprice) -> { System.out.println("In a Bowl Charge"); return burgerprice + 1 ; },
						(burgerprice) -> { System.out.println("Organic and Antibiotic Free Beef Charge"); return burgerprice + 10 ; },
						(burgerprice) -> { System.out.println("House made Vegan Veggie Charge"); return burgerprice + 3 ; }
			);

		//Burger Charges applied in different ways. Added initial charger as 0 and new burger charges get added whenever it gets called.

		burgerList.forEach((burgerstrategy) -> System.out.println(burgerstrategy.BurgerCharge(0.0)));
	}
}
