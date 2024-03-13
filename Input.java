
package View;

import java.util.Scanner;


public class Input {
    View view = new View();
      public static final Scanner scanner = new Scanner(System.in);
      
      public String getInputString(String prompt) {
        view.displayMess(prompt);
        return scanner.nextLine();
    }
}
