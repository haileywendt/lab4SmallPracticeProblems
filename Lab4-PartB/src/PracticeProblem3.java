/**
 * @author Hailey Wendt
 *
 */
public class PracticeProblem3 {
	
	private double perimeter;
	private double area;
	private double lengthAB;
	private double lengthAC;
	private double lengthBC;
	private double angleA;
	private double angleB;
	private double angleC;
	
	/**
	 * @return the perimeter
	 */
	public double getPerimeter() {
		perimeter = lengthAB + lengthAC + lengthBC;
		return perimeter;
	}
	/**
	 * @param perimeter the perimeter to set
	 */
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		double s = (lengthBC + lengthAC + lengthAB) / 2;
		area = Math.sqrt(s * (s - lengthBC) * (s - lengthAC) * (s - lengthAB));
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	/**
	 * @return the lengthAB
	 */
	public double getLengthAB(double tempAX, double tempAY, double tempBX, double tempBY) {
		lengthAB = Math.sqrt(Math.pow((tempBY - tempAY), 2) + Math.pow((tempBX - tempAX), 2));
		return lengthAB;
	}
	/**
	 * @param lengthAB the lengthAB to set
	 */
	public void setLengthAB(double lengthAB) {
		this.lengthAB = lengthAB;
	}
	/**
	 * @return the lengthAC
	 */
	public double getLengthAC(double tempAX, double tempAY, double tempCX, double tempCY) {
		lengthAC = Math.sqrt(Math.pow((tempCY - tempAY), 2) + Math.pow((tempCX - tempAX), 2));
		return lengthAC;
	}
	/**
	 * @param lengthAC the lengthAC to set
	 */
	public void setLengthAC(double lengthAC) {
		this.lengthAC = lengthAC;
	}
	/**
	 * @return the lengthBC
	 */
	public double getLengthBC(double tempBX, double tempBY, double tempCX, double tempCY) {
		lengthBC = Math.sqrt(Math.pow((tempCY - tempBY), 2) + Math.pow((tempCX - tempBX), 2));
		return lengthBC;
	}
	/**
	 * @param lengthBC the lengthBC to set
	 */
	public void setLengthBC(double lengthBC) {
		this.lengthBC = lengthBC;
	}
	/**
	 * @return the angleA
	 */
	public double getAngleA() {
		angleA = Math.toDegrees(Math.acos(((Math.pow(lengthAC, 2) + Math.pow(lengthAB, 2) - Math.pow(lengthBC, 2)) 
				/ (2 * lengthAC * lengthAB))));
		return angleA;
	}
	/**
	 * @param angleA the angleA to set
	 */
	public void setAngleA(double angleA) {
		this.angleA = angleA;
	}
	/**
	 * @return the angleB
	 */
	public double getAngleB() {
		angleB = Math.toDegrees(Math.acos(((Math.pow(lengthAB, 2) + Math.pow(lengthBC, 2) - Math.pow(lengthAC, 2)) 
				/ (2 * lengthAB * lengthBC))));
		return angleB;
	}
	/**
	 * @param angleB the angleB to set
	 */
	public void setAngleB(double angleB) {
		this.angleB = angleB;
	}
	/**
	 * @return the angleC
	 */
	public double getAngleC() {
		angleC = Math.toDegrees(Math.acos(((Math.pow(lengthBC, 2) + Math.pow(lengthAC, 2) - Math.pow(lengthAB, 2)) 
				/ (2 * lengthBC * lengthAC))));
		return angleC;
	}
	/**
	 * @param angleC the angleC to set
	 */
	public void setAngleC(double angleC) {
		this.angleC = angleC;
	}

	
}
