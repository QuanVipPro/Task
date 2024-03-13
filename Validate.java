package Validate;

import static View.Input.scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;

public class Validate {

 
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");


    public String getStringFromInput(String msg) {
        String s = scanner.nextLine();
        while (s == null || s.isEmpty()) {
            System.out.print(String.format("%s", msg));
            s = scanner.nextLine();
        }
        return s;
    }

    public Date getDateFromInput(String msg) {
         while (true) {
            System.out.print(msg);
            String dateString = scanner.nextLine();
            if (!dateString.isEmpty()) {
                try {                
                    Date date = dateFormat.parse(dateString);                   
                    return date;
                } catch (ParseException e) {
                    System.err.println(String.format("Invalid date format. Please enter again (%s).", "dd/MM/yyyy"));
                }
            }
        }
                
    }

    public double getDoubleFromInput(String msg) {
        double number;
        while (true) {
            System.out.print(String.format("%s", msg));
            try {
                number = scanner.nextDouble();
                if (number > 0) {
                    return number;
                } else {
                    System.err.println("Please enter the number > 0 ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Just input the double number > 0 ");
                scanner.next();
            }
        }
    }

    public int getIntFromInput(String msg) { 
        int number;
        while (true) {
            System.out.print(String.format("%s", msg));
            try {
                number = scanner.nextInt();
                if (number >= 0) {
                    return number;
                } else {
                    System.err.println("Please enter the integer number > 0 ");
                }
            } catch (InputMismatchException e) {
                System.err.println("Just input the integer number > 0 ");
                scanner.next();
            }
        }
    }
}
