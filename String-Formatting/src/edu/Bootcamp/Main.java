package edu.Bootcamp;

public class Main {

    public static void main(String[] args) {
//	    String formatting allows us to focus on describing our desired results and it allows us to control many aspects of the appearance of the strings.
//      To show some of the ways formatting is helpful, let's compare it to concatenation.
System.out.println("String concatenation vs String formatting:");

        int david = 17, dawson = 15, dillon = 8, gordon = 6;
//      First, we defined the variables we'll be using for the rest of the program above.

        String stringConcatenate1 = "My nephews are " + david + ", " + dawson + ", " + dillon + ", and " + gordon + " years old";
        System.out.println(stringConcatenate1);
//       In stringConcatenate1, if anyone were to look at our code to try to figure out what were were doing, it would require them to look spend a bit of time reading over our code to understand the specifics.

        String stringFormat1 = String.format("My nephews are %d, %d, %d, and %d years old", david, dawson, dillon, gordon);
        System.out.println(stringFormat1);
//      In stringFormat1, we used placeholders to make it pretty explicit what we were doing: The information here is a string with a four placeholders that are defined after the string.
//      String formatting also make is very obvious what we're trying to achieve.

        double avgDiff = ((david-dawson) + (dawson - dillon) + (dillon - gordon)) / 3.0d;
//      Here is a new variable we're defining

        String stringConcatenate2 = "The average age between each of my nephews is " + avgDiff + " years.";
        System.out.println(stringConcatenate2);
//      What we've written in stringConcatenate2 is still pretty easy to read even though we're concatenating, but the resulting message is pretty unwieldy to read, because the double displayed is 3.6666666666666665

        String stringFormat2 = String.format("The average age between each of my nephews is %.1f years.", avgDiff);
        System.out.println(stringFormat2);
//      In stringFormat2 we are actually specifying how many decimal points to display, in this case 1, and avgDiff is being shortened and rounded to 3.7

System.out.println("\nFormat examples:");
//      Common format conversions are %d for decimal, %x for hexadecimal, %f for floating point, %e for scientific notation, and %s for String.
//      We can use these format conversions with format flags when using String formatting.
//      A common flag is the #, which displays the "radix", or information about the base the value.
         int iVal = 33;
         String s1 = String.format("iVal's decimal value is %d", iVal);
         System.out.println(s1);
         String s2 = String.format("iVal's hexadecimal value without a radix included is %x", iVal);
         System.out.println(s2);
         String s3 = String.format("iVal's hexadecimal value with the radix included is %#x", iVal);
         System.out.println(s3); // Hexadecimal numbers are indicated by the addition of either 0x prefix in Java

    }
}
