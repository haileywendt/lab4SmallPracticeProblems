/**
 * 
 */

/**
 * @author Hailey Wendt
 *
 */
public class PracticeProblem1 {

	private int year;
	private int day;
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the month
	 */
	public String getMonth() {
		int y = getYear();
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		
		String month = "";
		if(n == 1) {
			month = "January";
		}
		else if(n == 2) {
			month = "February";
		}
		else if(n == 3) {
			month = "March";
		}
		else if(n == 4) {
			month = "April";
		}
		else if(n == 5) {
			month = "May";
		}
		else if(n == 6) {
			month = "June";
		}
		else if(n == 7) {
			month = "July";
		}
		else if(n == 8) {
			month = "August";
		}
		else if(n == 9) {
			month = "September";
		}
		else if(n == 10) {
			month = "October";
		}
		else if(n == 11) {
			month = "November";
		}
		else {
			month = "December";
		}
		
		return month;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		int y = getYear();
		int a = y % 19;
		int b = y / 100;
		int c = y % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		int p = (h - m + r + n + 19) % 32;
		day = p;
		return day;
	}
}
