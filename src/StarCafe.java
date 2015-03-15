/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class StarCafe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Drink drink = new Espresso();
		System.out.println(drink.getDescription() + "   " + drink.cost());
		
		Drink drinkA = new Arrabica();
		drinkA = new Chockolade(drinkA);
		drinkA = new Chockolade(drinkA);
		drinkA = new WhippedCream(drinkA);
		System.out.println(drinkA.getDescription() + "   " + drinkA.cost());
		
		Drink drinkB = new StarCafeSpecial();
		drinkB = new SoyMilk(drinkB);
		drinkB = new Chockolade(drinkB);
		drinkB = new WhippedCream(drinkB);
		System.out.println(drinkB.getDescription() + "   " + drinkB.cost());
	}

}
