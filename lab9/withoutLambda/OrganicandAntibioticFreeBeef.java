package strategycustomburger;

public class OrganicandAntibioticFreeBeef  implements BurgerCharges {

	public OrganicandAntibioticFreeBeef() 
	{
		
	}

	@Override
	public double BurgerCharge(double burgerprice) {

		System.out.println("Organic and Antibiotic Free Beef Charge");

		double burgercharge = burgerprice + 10;
		
		return burgercharge;
	}
	
}
