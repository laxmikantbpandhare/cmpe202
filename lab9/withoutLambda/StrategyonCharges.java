package strategycustomburger;

import java.util.Arrays;
import java.util.List;

public class StrategyonCharges {

	public static void main(String [] args) {

		List<BurgerCharges> burgerList =
				Arrays.asList( new OrganicBason(),new Quinoa(),new InaBowl(),new OrganicandAntibioticFreeBeef(),
						new HousemadeVeganVeggie());

		//Burger Charges applied in different ways. Added intial changes with new burger charges
		
		for (BurgerCharges burgerchanges : burgerList) {
			System.out.println(burgerchanges.BurgerCharge(0.0));
		}
	}
}