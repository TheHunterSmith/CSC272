package FinalProject;

import java.io.PrintStream;
import java.util.Scanner;

public class UIHandler {
   private static final String UNKNOWN_RESPONSE = "Unknown command: ";
   private Scanner in;
   private PrintStream out;

   public UIHandler(Scanner input, PrintStream output) {
       in = input;
       out = output;
   }

   public void display(String content) {
       getInput(content, 0);
   }

   public String getInput(String prompt) {
       return getInput(prompt, 1)[0];
   }

   public String[] getInput(String prompt, int linesExpected) {
       out.println(prompt);

       String[] userInput = new String[linesExpected];
       for (int i = 0; i < linesExpected; i++) {
           userInput[i] = in.nextLine();
       }

       return userInput;
   }

   public int getChoice(String[] options) {
       int length = options.length;
       String[] keyArray = new String[length];

       for (int i = 0; i < length; i++) {
           String opt = options[i];
           String disp = opt.substring(0, 1) + ")" + opt.substring(1);
           out.print(disp + " ");
           keyArray[i] = opt.substring(0, 1);
       }

       String input = getInput("");

       for (int i = 0; i < keyArray.length; i++)
       {
           if (keyArray[i].equals(input)) {
               return i;
           }
       }

       out.println(UNKNOWN_RESPONSE + input);
       return -1;
   }
}