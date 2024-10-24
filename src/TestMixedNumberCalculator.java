import org.junit.Assert;
import org.junit.Test;

public class TestMixedNumberCalculator {

	public static boolean compareArrays(String [] arr1, String [] arr2) {
		
		if(arr1 == arr2)
			return true;
		
		if(arr1 == null || arr2 == null)
			return false;
		
		if(arr1.length != arr2.length)
			return false;
		
		for(int i = 0; i < arr1.length; i++)
			if(!arr1[i].equals(arr2[i]))
				return false;
		
		return true;
	}
	
	@Test
	public void tokenizeInteger() {
		String number = "1";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"","1","0","1"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
	}
	
	@Test
	public void tokenizeNegativeInteger() {
		String number = "-10";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"-","10","0","1"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
	}
	
	@Test
	public void tokenizeFraction() {
		String number = "3/4";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"","0","3","4"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);	
	}
	
	@Test
	public void tokenizeNegativeFraction() {
		String number = "-5/11";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"-","0","5","11"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeFractionDontReduce() {
		String number = "2/4";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"","0","2","4"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeImproperFraction() {
		String number = "5/4";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"","0","5","4"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeNegativeImproperFraction() {
		String number = "-9/6";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"-","0","9","6"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeMixedNumber() {
		String number = "10 2/3";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"","10","2","3"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeNegativeMixedNumber() {
		String number = "-1 3/8";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"-","1","3","8"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeNonReducedNumber() {
		String number = "-1 8/7";
		String [] tokenizedNumber = MixedNumberCalculator.tokenizeNumber(number);
		
		String [] correctTokenizedNumber = {"-","1","8","7"};
		
		//same sign
		Assert.assertEquals(tokenizedNumber[0], correctTokenizedNumber[0]);
		
		// same whole number
		Assert.assertEquals(tokenizedNumber[1], correctTokenizedNumber[1]);

		// same fraction numerator
		Assert.assertEquals(tokenizedNumber[2], correctTokenizedNumber[2]);
		
		// same fraction denominator
		Assert.assertEquals(tokenizedNumber[3], correctTokenizedNumber[3]);
	}
	
	@Test
	public void tokenizeExpressionAddition() {
		String expression = "1 2/3 + 1 3/4";
		String [] tokenizedExpression = MixedNumberCalculator.tokenizeExpression(
				expression);
		
		String [] correctTokenizedExpression = {"", "1", "2", "3", "+", 
				"", "1", "3", "4"};
		
		Assert.assertTrue(compareArrays(tokenizedExpression, 
				correctTokenizedExpression));
	}
	
	@Test
	public void tokenizeExpressionSubtraction() {
		String expression = "-1 2/3 - -1 3/4";
		String [] tokenizedExpression = MixedNumberCalculator.tokenizeExpression(
				expression);
		
		String [] correctTokenizedExpression = {"-", "1", "2", "3", "-", 
				"-", "1", "3", "4"};
		
		Assert.assertTrue(compareArrays(tokenizedExpression, 
				correctTokenizedExpression));
	}
	
	@Test
	public void tokenizeIntegerDivision() {
		String expression = "3 / -2";
		String [] tokenizedExpression = MixedNumberCalculator.tokenizeExpression(
				expression);
		
		String [] correctTokenizedExpression = {"", "3", "0", "1", "/", 
				"-", "2", "0", "1"};
		
		// denominators don't matter if fraction's numerator is 0
		tokenizedExpression[3] = correctTokenizedExpression[3];
		tokenizedExpression[8] = correctTokenizedExpression[8];
		
		Assert.assertTrue(compareArrays(tokenizedExpression, 
				correctTokenizedExpression));
	}
	
	@Test
	public void tokenizeExpressionMultiplication() {
		String expression = "10/4 * -12/3";
		String [] tokenizedExpression = MixedNumberCalculator.tokenizeExpression(
				expression);
		
		String [] correctTokenizedExpression = {"", "0", "10", "4", "*", 
				"-", "0", "12", "3"};
		
		Assert.assertTrue(compareArrays(tokenizedExpression, 
				correctTokenizedExpression));
	}
	
	@Test
	public void tokenizeExpressionAddZeros() {
		String expression = "0 + 0 0/12";
		String [] tokenizedExpression = MixedNumberCalculator.tokenizeExpression(
				expression);
		
		String [] correctTokenizedExpression = {"", "0", "0", "1", "+", 
				"", "0", "0", "12"};
		
		// For integers we don't care about the denominator
		tokenizedExpression[3] = correctTokenizedExpression[3];
		
		
		Assert.assertTrue(compareArrays(tokenizedExpression, 
				correctTokenizedExpression));
	}
	
	@Test
	public void addMixedNumbers() {
		String mixedNumber = MixedNumberCalculator.add(false, 1, 2, 3, 
				false, 0, 1, 3);
		
		String correctMixedNumber = "2";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void addIntegers() {
		String mixedNumber = MixedNumberCalculator.add(false, 2, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "4";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void addNegativeFractions() {
		String mixedNumber = MixedNumberCalculator.add(true, 0, 3, 2, 
				true, 0, 4, 3);
		
		String correctMixedNumber = "-2 5/6";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void addNegativeNonReducedFractions() {
		String mixedNumber = MixedNumberCalculator.add(true, 0, 6, 4, 
				true, 0, 8, 6);
		
		String correctMixedNumber = "-2 5/6";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void addMixedNumbersWithDifferentSigns() {
		String mixedNumber = MixedNumberCalculator.add(false, 1, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "-1/8";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void addMixedNumbersWithDifferentSigns2() {
		String mixedNumber = MixedNumberCalculator.add(false, 3, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "1 7/8";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void addZeros() {
		String mixedNumber = MixedNumberCalculator.add(false, 0, 0, 1, 
				true, 0, 0, 2);
		
		String correctMixedNumber = "0";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
	@Test
	public void addZero2() {
		String mixedNumber = MixedNumberCalculator.add(false, 1, 0, 1, 
				true, 0, 0, 2);
		
		String correctMixedNumber = "1";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
///
	
	@Test
	public void subtractMixedNumbers() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 1, 2, 3, 
				false, 0, 1, 3);
		
		String correctMixedNumber = "1 1/3";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractMixedNumbersForInt() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 1, 2, 3, 
				false, 0, 2, 3);
		
		String correctMixedNumber = "1";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractIntegers() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 3, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "1";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractNegativeFractions() {
		String mixedNumber = MixedNumberCalculator.subtract(true, 0, 3, 2, 
				true, 0, 4, 3);
		
		String correctMixedNumber = "-1/6";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractNegativeNonReducedFractions() {
		String mixedNumber = MixedNumberCalculator.subtract(true, 0, 6, 4, 
				true, 0, 8, 6);
		
		String correctMixedNumber = "-1/6";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractMixedNumbersWithDifferentSigns() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 1, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "5 1/8";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractMixedNumbersWithDifferentSigns2() {
		String mixedNumber = MixedNumberCalculator.subtract(true, 3, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "-1 7/8";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void subtractZeros() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 0, 0, 1, 
				true, 0, 0, 2);
		
		String correctMixedNumber = "0";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
	@Test
	public void subtractZero1() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 1, 0, 1, 
				true, 0, 0, 2);
		
		String correctMixedNumber = "1";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
	@Test
	public void subtractZero2() {
		String mixedNumber = MixedNumberCalculator.subtract(false, 0, 0, 1, 
				false, 1, 0, 2);
		
		String correctMixedNumber = "-1";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
	///// multiply
	
	@Test
	public void multiplyMixedNumbers() {
		String mixedNumber = MixedNumberCalculator.multiply(false, 1, 2, 3, 
				false, 0, 1, 3);
		
		String correctMixedNumber = "5/9";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyMixedNumbersForInt() {
		String mixedNumber = MixedNumberCalculator.multiply(false, 1, 2, 3, 
				false, 3, 0, 1);
		
		String correctMixedNumber = "5";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyIntegers() {
		String mixedNumber = MixedNumberCalculator.multiply(false, 3, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "6";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyOppositeIntegers() {
		String mixedNumber = MixedNumberCalculator.multiply(true, 3, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "-6";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyNegativeFractions() {
		String mixedNumber = MixedNumberCalculator.multiply(true, 0, 3, 2, 
				true, 0, 4, 3);
		
		String correctMixedNumber = "2";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyNegativeNonReducedFractions() {
		String mixedNumber = MixedNumberCalculator.multiply(true, 0, 6, 4, 
				true, 0, 8, 6);
		
		String correctMixedNumber = "2";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyMixedNumbersWithDifferentSigns() {
		String mixedNumber = MixedNumberCalculator.multiply(false, 1, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "-6 9/16";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyMixedNumbersWithDifferentSigns2() {
		String mixedNumber = MixedNumberCalculator.multiply(true, 3, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "11 13/16";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void multiplyZero() {
		String mixedNumber = MixedNumberCalculator.multiply(false, 1, 0, 1, 
				true, 0, 0, 2);
		
		String correctMixedNumber = "0";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
	@Test
	public void multiplyZero2() {
		String mixedNumber = MixedNumberCalculator.multiply(false, 0, 0, 1, 
				true, 0, 0, 2);
		
		String correctMixedNumber = "0";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}

	//// divide
	@Test
	public void divideMixedNumbersForInt() {
		String mixedNumber = MixedNumberCalculator.divide(false, 1, 2, 3, 
				false, 0, 1, 3);
		
		String correctMixedNumber = "5";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideMixedNumbers() {
		String mixedNumber = MixedNumberCalculator.divide(false, 1, 2, 3, 
				false, 3, 0, 1);
		
		String correctMixedNumber = "5/9";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideIntegers() {
		String mixedNumber = MixedNumberCalculator.divide(false, 3, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "1 1/2";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideIntegersForInt() {
		String mixedNumber = MixedNumberCalculator.divide(false, 4, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "2";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideOppositeIntegers() {
		String mixedNumber = MixedNumberCalculator.divide(true, 3, 0, 1, 
				false, 2, 0, 1);
		
		String correctMixedNumber = "-1 1/2";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideNegativeFractions() {
		String mixedNumber = MixedNumberCalculator.divide(true, 0, 3, 2, 
				true, 0, 4, 3);
		
		String correctMixedNumber = "1 1/8";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideNegativeNonReducedFractions() {
		String mixedNumber = MixedNumberCalculator.divide(true, 0, 6, 4, 
				true, 0, 8, 6);
		
		String correctMixedNumber = "1 1/8";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideMixedNumbersWithDifferentSigns() {
		String mixedNumber = MixedNumberCalculator.divide(false, 1, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "-20/21";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void divideMixedNumbersWithSameSigns2() {
		String mixedNumber = MixedNumberCalculator.divide(true, 12, 3, 2, 
				true, 2, 5, 8);
		
		String correctMixedNumber = "5 1/7";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);
	}
	
	@Test
	public void DivideZero() {
		String mixedNumber = MixedNumberCalculator.divide(false, 0, 0, 1, 
				true, 1, 0, 2);
		
		String correctMixedNumber = "0";
		
		Assert.assertEquals(mixedNumber, correctMixedNumber);	
	}
	
	
	
}
