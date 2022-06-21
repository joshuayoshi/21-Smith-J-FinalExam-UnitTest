package finalExam;

public class StringCalculator {
	   public static int add(final String numbers) {
	      int returnValue = 0;
	      String[] numbersArray = numbers.split(",|\n"); 
	      for (String number : numbersArray) {
	         if (!number.trim().isEmpty()) {
	        	int tempInt = Integer.parseInt(number.trim());
	        	if(tempInt < 0) {
	        		throw new IllegalArgumentException("negatives not allowed.");
	        	}
	        	if (tempInt>1000) tempInt = 0;
	            returnValue += tempInt;
	         }
	      }
	      return returnValue;
	   }
	}