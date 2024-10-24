First Software Project to build a Mixed Number calculator. Write your code in src/MixedNumberCalculator.java The main method will be where you stitch together all the functions needed to make the Mixed Number Calculator run. Test your functions using src/TestMixedNunberCalculator.java

Requirements:
You can assume any input provided by the user will be in a valid format, only valid operators, all mixed numbers would be good. There will be no excess spaces in the beginning or the end of the user’s input.
Must be able to handle addition(+), subtraction(-), multiplication(*), and division (/). Do not use the type double in your code!
Mixed number must be returned in reduced form which means: 
Fraction a/b should be...  
0 <= a/b < 1, 
a/b should be in simplest form.
If whole number and fraction are 0 result should be 0.
Else if whole number of the mixed number is 0 leave it off of the result: 0 1/2 -> 1/2.
Else if numerator of fraction is 0 leave it off of the result: 1 0/2 -> 1.
 Extra credit: prompt the user to provide another calculation if they’d like, else terminate the program.


Advice

Try to convert your mixed numbers entered by the user into improper fractions as that would allow for easy addition, subtraction, multiplication, and division

Write a helper function to reduce your mixed numbers into simplest form

Try to get both mixed numbers to have a common denominator for their fractions if you’re adding or subtracting them

Think about how you can be creative! What tricks can you do to reduce the amount of work you do? How are addition and subtraction related? 
