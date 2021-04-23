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

        String stringFormat2 = String.format("The average age between each of my nephews is %.2f years.", avgDiff);
        System.out.println(stringFormat2);
//      In stringFormat2 we are actually specifying how many decimal points to display, in this case 1, and avgDiff is being shortened and rounded to 3.67

//      Common format conversions are %d for decimal, %x for hexadecimal, %f for floating point, %e for scientific notation, and %s for String.



//      Similarly to how we used %.2f above to set the decimal of the float to 2 decimal points, we can set the spacing of an array to make things look more organized with String formatting:
        int w = 54, x = 2359, y = 484311, z = 12141;
        String numberDisplay1 = String.format("The array without width formatting: \nw:%d x:%d \ny:%d z:%d", w, x, y, z);
        System.out.println(numberDisplay1);

//      If we include a number in the String format, we can the number of characters in each formatted String is
        String numberDisplay2 = String.format("The array with the width formatted: \nw:%9d x:%9d \ny:%9d z:%9d", w, x, y, z);
        System.out.println(numberDisplay2);
//      Here, regardless of if the variable had 1 character of 4, each String had a total of 5 characters.

//      We can left justify the spacing with a - character.
        String numberDisplay3 = String.format("The array left-aligned: \nw:%-9d x:%-9d \ny:%-9d z:%-9d", w, x, y, z);
        System.out.println(numberDisplay3);
//      The last common format flag is -, which displays left justified.

//      And if we'd rather instead have preceding zeroes filling the padding, we can add a 0 to the formatting:
        String numberDisplay4 = String.format("The array with zero-padding: \nw:%09d x:%09d \ny:%09d z:%09d", w, x, y, z);
        System.out.println(numberDisplay4);

//      For larger numbers, having a thousands separator helps with visibility. The character needed is a ,
        String numberDisplay5 = String.format("The array with thousands comma: \nw:%,-9d x:%,-9d \ny:%,-9d z:%,-9d", w, x, y, z);
        System.out.println(numberDisplay5);
        


System.out.println("\nFormat flag examples:");
//      A format-changing flag is to use the # character, which displays the "radix", or information about the base the value.
         int iVal = 33;
         String s1 = String.format("iVal's decimal value with default format is %d", iVal);
         System.out.println(s1);
         String s2 = String.format("iVal's hexadecimal value without a radix included is %x", iVal);
         System.out.println(s2);
         String s3 = String.format("iVal's hexadecimal value with the radix included is %#x", iVal);
         System.out.println(s3); // Hexadecimal numbers are indicated by the addition of either 0x prefix in Java

    }
}
