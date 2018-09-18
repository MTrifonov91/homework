/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author User
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getName()  {
        return firstName + " " + lastName;
    }
    
    public int getSalary() {
        return salary;
    }
   
    public int getAnnualSalary() {
        return salary*12;
    }
    
    public int raiseSalary(int percent) {
        return salary = salary + salary / 100 * percent;
    }
    
    public void setSalary (int salary) {
        this.salary = salary;
    }
    
    
    @Override
    public String toString() {
        return "Employee : " + id + "\n" + getName() + "\nAnnual Salary = " + getAnnualSalary() + "\n";
    }

    
            

   
    
    
    
}
