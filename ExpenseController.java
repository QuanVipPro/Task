package Controller;

import Common.Manager;
import View.Menu;

public class ExpenseController extends Menu {

    Manager mg = new Manager();

    public ExpenseController() {
        super("Handy Expense", new String[]{"Add an expense", "Display all expenses", "Remove an expense", "Exit"});
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                mg.addExpense();
                break;

            case 2:
                mg.displayAll();
                break;

            case 3:
                mg.removeExpense();
                break;
        }
    }
}
