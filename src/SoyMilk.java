/**
 * 
 */

/**
 * @author Szymon Iwañski
 *
 */
public class SoyMilk extends ComponentDecorator{

	Drink drink;
	
	public SoyMilk(Drink drink) {
		this.drink = drink;
	}
	
	public String getDescription() {
		return drink.getDescription() + ", Soy milk";
	}
	
	public double cost() {
		return drink.cost() + 0.50;
	}
}
