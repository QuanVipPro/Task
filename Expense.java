
package Model;

import java.util.Date;


public class Expense {
    int ID;
    Date date;
    double number;
    String content;

    public Expense(int ID, Date date, double number, String content) {
        this.ID = ID;
        this.date = date;
        this.number = number;
        this.content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
