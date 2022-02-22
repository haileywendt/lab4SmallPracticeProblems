/**
 * @author Hailey Wendt
 *
 */

public class PracticeProblem2 {
	private long number;

	/**
	 * @return the number
	 */
	public String getNumber() {
		String newNumber = Long.toString(number);
		newNumber = "(" + newNumber.substring(0, 3) + ")-" 
					+ newNumber.substring(3, 6) + "-" 
					+ newNumber.substring(6, 10);
		return newNumber;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(long number) {
		this.number = number;
	}
}
