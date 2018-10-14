/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateClass;

/**
 *
 * @author User
 */
public class Date {
    
    private int month;
private int day;
private int year;
private String[] name_Month = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
private int[] days_Month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

public Date()
{
month = 1;
day = 1;
year = 1980;
}

public Date(int inputMonth, int inputDay, int inputYear) {
setMonth(inputMonth);
setDay(inputDay);
setYear(inputYear);
}

public Date(String inputMonth, int inputDay, int inputYear) {
setMonth(determineMonth(inputMonth));
setDay(inputDay);
setYear(inputYear);
}

public Date(int d, int inputYear) {
getdayMonth(d);
setYear(inputYear);
}

public int getMonth() {
return month;
}

public void setMonth(int inputMonth) {
month = (inputMonth > 0 && inputMonth < 13) ? inputMonth : 1;
}

public int getDay() {
return day;
}

public void setDay(int inputDay) {

if (inputDay > 0 && inputDay <= days_Month[month]) {
day = inputDay;
} else if (month == 2 && inputDay == 29 && checkLeapYear()) {
day = inputDay;
} else {
day = 1;
}
}

public int getYear() {
return year;
}

public void setYear(int inputYear) {
year = (inputYear > 1979 && inputYear < 3000) ? inputYear : 2011;
}

public boolean checkLeapYear() {
if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
return true;
} else {
return false;
}
}

public String slash() {
return month + "/" + day + "/" + year;
}

public String monthNameDate() {
return monthToName() + " " + day + ", " + year;
}

public String dateDay() {
return dayOfyearcov() + " " + year;
}

public int dayOfyearcov() {
int d = 0;
for (int i = 1; i < month; i++) {
if (checkLeapYear() && i == 2) {
d += 29;
} else {
d += days_Month[i];
}
}
d += day;
return d;
}

public String monthToName() {
return name_Month[month];
}

public int determineMonth(String inputMonth) {

for (int i = 1; i < name_Month.length; i++) {
if (name_Month[i].equalsIgnoreCase(inputMonth)) {
return i;
}
}
return 1;
}

public void getdayMonth(int input) {
if (input > 0) {
month = 1;
while (input > days_Month[month]) {
if (checkLeapYear() && month == 2) {
input -= 29;
} else {
input -= days_Month[month];
}
month++;
}
day = input;
} else {
day = 1;
month = 1;
}
}
    
}
