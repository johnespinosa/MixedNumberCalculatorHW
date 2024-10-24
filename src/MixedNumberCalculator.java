public class MixedNumberCalculator {
	public static void main(String [] args) {
		// get expression from user as a String
		// expressions can contain integers: 3, -1, 4
		// fractions: -12/3, 1/2, 0/5
		// mixed numbers: 12 1/2, -2 3/2
		// example: -2 3/2 * -12/3
		// <your code here>
		
		// Tokenize expression
		// <your code here>	
		
		// Assign tokenized input array values to variables 
		// <your code here>
		
		// Use variables to call mixed number operation functions
		// <your code here>
		
		System.out.println("The value of this expression is:");
		// print resulting mixed number
		// <your code here>
		
	}
	
	/**
	 * Take in a mixed fraction string and tokenize it into the String
	 * array [negSign, wholeNumber, numerator, denominator]
	 * This function should work regardless of whether input String is
	 * in reduced form. Integers, mixed numbers, and improper fractions
	 * should be able to be tokenized. Do not reduce any fractions in
	 * this function. negSign should be "" for positive numbers.
	 * 
	 * @param numberStr - number as a string
	 * input examples: "-2 3/4", "5/3"
	 * @return tokenized strings
	 * examples: ["-", "2", "3", "4"], ["", "0", "5", "3"]
	 */
	public static String [] tokenizeNumber(String numberStr) {
		return null;
	}
	
	/**
	 * Tokenize the input string of the form
	 * [negsign1,integer1,numerator1,denominator1,operator,
	 * negsign2,integer2,numerator2,demoninator2]
	 * It's useful to notice the operator is surrounded by ' ' characters
	 * It also might be a good idea to use the tokenizeMixedFraction()
	 * function in this function. Do not reduce any fractions in
	 * this function. Elements of the tokenized expression String array
	 * should not have spaces in them. negSign should be "" for positive numbers.
	 * @param input - mixed fraction expression to evaluate
	 * @return tokenized mixed fraction expression as a String array
	 */
	public static String [] tokenizeExpression(String input) {
		return null;
	}
	
	/*
	 * Before working on these functions, it might be easier to do the 
	 * calculations if this mixed numbers are converted to improper fractions.
	 * 
	 * for example:
	 * 1 1/2 -> 3/2
	 * 4 2/5 -> 22/5
	 * 
	 * Consider making a private helper function to assist your code!
	 * Also consider using some kind of an array as the return type
	 * so you can return the numerator and denominator of the improper
	 * fraction.
	 * 
	 * 22/5 -> [22,5]
	 */
	
	
	/*
	 * It might also be a good idea to write a function that converts
	 * an improper fraction back to a mixed number.
	 * 
	 * for example:
	 * 3/2 -> 1 1/2
	 * 
	 * 
	 * It might also be a 
	 * good idea to write a function that reduces a fraction
	 * 
	 * for example:
	 * 6/10 -> 3/5
	 * 
	 * Note: if you want to test these helper functions go ahead and make them
	 * public then add some test cases to the junit tests.
	 * 
	 * Final note: I'm happy to provide the function signatures for these
	 * helper functions but I'd like you to try and figure out good functions
	 * for yourself. I won't be there in your career when you're faced with a
	 * problem and you need to design your own functions to solve a problem
	 * from scratch!
	 */
	
	
	
	/**
	 * Adds two mixed numbers together and returns the resulting mixed 
	 * number as a string. If whole number and fraction are 0 return "0"
	 * else if the whole number is 0 return the fraction in reduced form
	 * else if the fraction's numerator is 0 return the whole number
	 * else return the mixed number with the fraction in reduced form
	 * You should not return "6/4", instead return "1 1/2"
	 * 
	 * @param isNeg1 - true if first mixed fraction is negative
	 * @param wholeNumber1 - whole number of first mixed fraction
	 * @param numerator1 - numerator of first mixed fraction
	 * @param denominator1 - denominator of first mixed fraction
	 * @param isNeg2 - true if second mixed fraction is negative
	 * @param wholeNumber2 - whole number of second mixed fraction
	 * @param numerator2 - numerator of second mixed fraction
	 * @param denominator2 - denominator of second mixed fraction
	 * @return - both mixed fractions added together in reduced form
	 */
	public static String add(boolean isNeg1, int wholeNumber1, 
			int numerator1, int denominator1, boolean isNeg2, 
			int wholeNumber2, int numerator2, int denominator2) {
		
		return null;
	}
	
	/**
	 * Subtracts two mixed numbers, returns the resulting mixed 
	 * number as a string. The returned mixed number should be in reduced
	 * form. 
	 * 
	 * @param isNeg1 - true if first mixed fraction is negative
	 * @param wholeNumber1 - whole number of first mixed fraction
	 * @param numerator1 - numerator of first mixed fraction
	 * @param denominator1 - denominator of first mixed fraction
	 * @param isNeg2 - true if second mixed fraction is negative
	 * @param wholeNumber2 - whole number of second mixed fraction
	 * @param numerator2 - numerator of second mixed fraction
	 * @param denominator2 - denominator of second mixed fraction
	 * @return - mixed number 1 subtracted from mixed number 2
	 */
	public static String subtract(boolean isNeg1, int wholeNumber1, 
			int numerator1, int denominator1, boolean isNeg2, 
			int wholeNumber2, int numerator2, int denominator2) {
		
		return null;
	}
	
	/**
	 * Multiplies two mixed numbers together, returns the resulting mixed 
	 * number as a string. The returned mixed number should be in reduced
	 * form. 
	 * 
	 * @param isNeg1 - true if first mixed fraction is negative
	 * @param wholeNumber1 - whole number of first mixed fraction
	 * @param numerator1 - numerator of first mixed fraction
	 * @param denominator1 - denominator of first mixed fraction
	 * @param isNeg2 - true if second mixed fraction is negative
	 * @param wholeNumber2 - whole number of second mixed fraction
	 * @param numerator2 - numerator of second mixed fraction
	 * @param denominator2 - denominator of second mixed fraction
	 * @return - mixed number 1 multiplied by mixed number 2
	 */
	public static String multiply(boolean isNeg1, int wholeNumber1, 
			int numerator1, int denominator1, boolean isNeg2, 
			int wholeNumber2, int numerator2, int denominator2) { 
		
		return null;	
	}
	
	/**
	 * Divides mixed number 1 by mixed number 2, returns the resulting mixed 
	 * number as a string. The returned mixed number should be in reduced
	 * form. 
	 * @param isNeg1 - true if first mixed fraction is negative
	 * @param wholeNumber1 - whole number of first mixed fraction
	 * @param numerator1 - numerator of first mixed fraction
	 * @param denominator1 - denominator of first mixed fraction
	 * @param isNeg2 - true if second mixed fraction is negative
	 * @param wholeNumber2 - whole number of second mixed fraction
	 * @param numerator2 - numerator of second mixed fraction
	 * @param denominator2 - denominator of second mixed fraction
	 * @return - mixed number 1 multiplied by mixed number 2
	 */
	public static String divide(boolean isNeg1, int wholeNumber1, 
			int numerator1, int denominator1, boolean isNeg2, 
			int wholeNumber2, int numerator2, int denominator2) {
		
		return null;
	}
	
}
