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



//      Similarly to how we used %.2f above to set the decimal of the float to 2 decimal points, we can set the spacing of an array to make things look more organized with String.format():
        double w = -54.0515253545, x = 235865439.5262728292;
        long y = 4843456441145456L, z = -1214554544445133L;
        String numberDisplay1 = String.format("\nAn array using only the minimum String.format(): \nw:%f   x:%f \ny:%d   z:%d", w, x, y, z); // Notice here that the float-types use %f and the integer types use %d
        System.out.println(numberDisplay1);

//      If we include a number in the String format, we can the number of characters in each formatted String is
        String numberDisplay2 = String.format("\nAn array with String.format() width: \nw:%25f   x:%25f \ny:%25d   z:%25d", w, x, y, z);
        System.out.println(numberDisplay2);
//      Here, regardless of if the variable had 1 character of 4, each String had a total of 5 characters.

//      We can left justify the spacing with a - character.
        String numberDisplay3 = String.format("\nAn array with String.format() width and left-aligned: \nw:%-25f   x:%-25f \ny:%-25d   z:%-25d", w, x, y, z);
        System.out.println(numberDisplay3);
//      The last common format flag is -, which displays left justified.

//      And if we'd rather instead have preceding zeroes filling the padding, we can add a 0 to the formatting:
        String numberDisplay4 = String.format("\nAn array with String.format() width and zero-padding: \nw:%025f   x:%025f \ny:%025d   z:%025d", w, x, y, z);
        System.out.println(numberDisplay4);

//      For larger numbers, having a thousands separator helps with visibility. The character needed is a ,
        String numberDisplay5 = String.format("\nAn array with String.format() width and thousands comma: \nw:%,25f   x:%,25f \ny:%,25d   z:%,25d", w, x, y, z);
        System.out.println(numberDisplay5);

//      To include include of limit decimal points, append a period and a number to the doubles
        String numberDisplay6 = String.format("\nAn array with String.format() width and decimal limits on the doubles: \nw:%25.3f   x:%25.0f \ny:%25d   z:%25d", w, x, y, z);
        System.out.println(numberDisplay6);

//      Negatives can be defined by ()s rather than - symbols by using the ( symbol.
        String numberDisplay7 = String.format("\nAn array with String.format() width and parenthesis on negatives: \nw:%(25f   x:%(25f \ny:%(25d   z:%(25d", w, x, y, z);
        System.out.println(numberDisplay7);

//      Negative and positive numbers can be explicitly displayed by using +
    String numberDisplay8 = String.format("\nAn array with String.format() width and the plus flag: \nw:%+25f   x:%+25f \ny:%+25d   z:%+25d", w, x, y, z);
    System.out.println(numberDisplay8);

    }
}
