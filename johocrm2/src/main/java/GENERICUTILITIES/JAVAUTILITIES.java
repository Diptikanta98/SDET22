package GENERICUTILITIES;


import java.util.Date;
import java.util.Random;

public class JAVAUTILITIES{
	public String getRandomData() {
		Random random = new Random();
		int ran = random.nextInt(1000);
		return null;
		
		
	}
	
	public static String getCurrentDate() {
		
	
	Date date = new Date();
	
	String currentdate=date.toString();
	return currentdate;
	
	
	

}
}