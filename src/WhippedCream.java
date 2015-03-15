/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class WhippedCream extends ComponentDecorator{

    Drink drink;
	
	public WhippedCream(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + ", Whipped cream";
	}
	
	public double cost() {
		return drink.cost() + 0.35;
	}
}
