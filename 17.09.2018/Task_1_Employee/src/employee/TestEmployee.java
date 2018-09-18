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
public class TestEmployee {
    public static void main (String [] args){
        
        Employee Wasea = new Employee(2001583, "Vasiliu", "Paharniceanu", 2500);
        
        System.out.println(Wasea);
        
        Wasea.raiseSalary(20);
        
        System.out.println(Wasea);
        
        Wasea.setSalary(2000);
        
        System.out.println(Wasea);
    }
    
}
