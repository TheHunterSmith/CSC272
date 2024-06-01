package FinalProject;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * This class handles user interface interactions, providing methods for displaying prompts and getting user input.
 */
public class UIHandler
{
   // Constant for unknown response
   private static final String UNKNOWN_RESPONSE = "Unknown command: ";

   // Scanner for input and PrintStream for output
   private Scanner in;
   private PrintStream out;

   /**
    * Constructor: Initializes the UIHandler with input and output streams.
    *
    * @param input  The Scanner for user input.
    * @param output The PrintStream for displaying output.
    */
   public UIHandler(Scanner input, PrintStream output)
   {
       in = input;
       out = output;
   }

   /**
    * Displays content to the user.
    *
    * @param content The content to display.
    */
   public void display(String content)
   {
       // Display the content to the user
       getInput(content, 0);
   }

   /**
    * Gets a single-line user input based on the provided prompt.
    *
    * @param prompt The prompt to display to the user.
    * @return The user's input as a String.
    */
   public String getInput(String prompt)
   {
       // Redirect to the more general method, expecting one line of input
       return getInput(prompt, 1)[0];
   }

   /**
    * Gets user input based on the provided prompt and the number of lines expected.
    *
    * @param prompt          The prompt to display to the user.
    * @param linesExpected   The number of lines of input expected from the user.
    * @return An array of Strings representing the user's input.
    */
   public String[] getInput(String prompt, int linesExpected)
   {
       // Prompt the user
       out.println(prompt);

       // Get the user input
       String[] userInput = new String[linesExpected];
       for (int i = 0; i < linesExpected; i++) {
           userInput[i] = in.nextLine();
       }

       return userInput;
   }

   /**
    * Gets user choice from a list of options.
    *
    * @param options An array of options to display to the user.
    * @return The index of the chosen option, or -1 if the input is unknown.
    */
   public int getChoice(String[] options)
   {
       // Have an array that stores the keys for faster access
       int length = options.length;
       String[] keyArray = new String[length];

       // Print the options and start a new line for user input
       for (int i = 0; i < length; i++)
       {
           // Form the options menu for display
           String opt = options[i];
           String disp = opt.substring(0, 1) + ")" + opt.substring(1);
           out.print(disp + " ");
           // Also save the key for later use
           keyArray[i] = opt.substring(0, 1);
       }

       // Accept user input
       String input = getInput(""); // Use empty prompt

       // Find the matching key
       for (int i = 0; i < keyArray.length; i++)
       {
           if (keyArray[i].equals(input)) {
               // User input matches this key, return the index
               return i;
           }
       }

       // If the function hasn't returned yet, the input does not match any known command
       out.println(UNKNOWN_RESPONSE + input);
       return -1;
   }
}