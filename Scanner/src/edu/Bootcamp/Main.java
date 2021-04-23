package edu.Bootcamp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
System.out.println("Scanner example #1");
//      Scanner takes user input and gives us an alternative to using a more complex method like System.in.read()
//      The general template is:
//          Scanner yourVarName = new Scanner(System.in);
//          data-type inputStoredHere = yourVarName.nextDatatype();
//      These two are the only required fields!
//      In the example below we will be running Scanner, and returning what was written.
        System.out.println("Hello! Please type something below.");
//      First, we are providing the instruction above for the user to see.

//      Next we will be entering the template:
        Scanner scanVariable1 = new Scanner(System.in);
        String theirInputGoesHere = scanVariable1.next();
//      We use .nextLine() for a line of String, .nextInt for an int, .nextByte for a byte, .nextBoolean for a boolean, and etc.

        System.out.println("You typed: " + theirInputGoesHere);
//      You don't need to only return the input, you can concatenate.


System.out.println("\nScanner example #2");
//      In the example below, typing a number returns that number plus two:
        System.out.println("Hello! Please type a number below.");
//      This is just some instructions for the user.

        Scanner inputANumber = new Scanner(System.in);
        double twiceThat = inputANumber.nextDouble();
//      Here we are using .nextDouble() to assign a double variable a value. Above we used a String, so used the Scanner-specific module of .nextLine() instead.

        System.out.printf("Twice your input is %.1f!", (twiceThat * 2));
//      Now we can use the variable like we would any other int variable!
    }
}
