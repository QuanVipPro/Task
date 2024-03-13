package Common;

import Model.Expense;
import Validate.Validate;
import View.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Manager {

    private final List<Expense> expenseList;
    Validate val = new Validate();
    View view = new View();

    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        return dateFormat.format(date);
    }

    public Manager() {
        this.expenseList = new ArrayList<>();
    }

    public List<Expense> getExpenseList() {
        return expenseList;
    }

    public void addExpense() {
        int id = expenseList.size() + 1;

        Date date = val.getDateFromInput("Enter Date: ");
        double amount = val.getDoubleFromInput("Enter Amount: ");
        String content = val.getStringFromInput("Enter Content: ");

        Expense expense = new Expense(id, date, amount, content);
        expenseList.add(expense);

        view.displayMess("Expense added successfully.");
    }

    public void displayAll() {
        if (expenseList.isEmpty()) {
            view.displayMess("Nothing to display");
            return;
        }
        view.displayMess("ID\tDate\t\tAmount\tContent");
        double totalAmount = 0;

        for (Expense expense : expenseList) {
            view.displayMess(expense.getID() + "\t"
                    + formatDate(expense.getDate()) + "\t"
                    + expense.getNumber() + "\t"
                    + expense.getContent());

            totalAmount += expense.getNumber();
        }

        view.displayMess("Total:\t" + totalAmount);
    }

public void removeExpense() {
    if (expenseList.isEmpty()) {
        view.displayMess("No expenses to remove.");
        return;
    }

    int expenseId = val.getIntFromInput("Enter ID to remove: ");

    if (expenseId >= 1 && expenseId <= expenseList.size()) {
        
        int indexToRemove = expenseId - 1;
        expenseList.remove(indexToRemove);
        view.displayMess("Expense removed successfully.");
    } else {
        view.displayMess("Invalid ID. Remove expense failed.");
    }
}

}
