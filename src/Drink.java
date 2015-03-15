/**
 * 
 */

/**
 * @author Szymon Iwa�ski
 *
 */
public abstract class Drink {

	String description = "Default drink";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double cost();
}
