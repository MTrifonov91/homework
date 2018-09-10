/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_task_7;

/**
 *
 * @author User
 */
public class Date {
    private int month;
    private int day;
    private int year;

     Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
    public void displayDate(){
            System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
    
    
}
