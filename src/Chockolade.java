/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class Chockolade extends ComponentDecorator{

	Drink drink;
	
	public Chockolade(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + ", Chockolade";
	}
	
	public double cost() {
		return drink.cost() + 0.20;
	}
}
