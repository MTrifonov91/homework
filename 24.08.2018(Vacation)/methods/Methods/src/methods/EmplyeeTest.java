/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

/**
 *
 * @author User
 */
public class EmplyeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Emlpoyee First = new Emlpoyee("","",0.0);
        First.setFirstName("Bob");
        First.setLastName("Trump");
        First.setSalary(10000.00);
        
        First.EmployeeDisplay();
                
        Emlpoyee Second = new Emlpoyee("","",0.0);
        Second.setFirstName("Billy");
        Second.setLastName("Bob");
        Second.setSalary(10000.01);
        
        Second.EmployeeDisplay();

        First.salary+= ((First.salary/100) * 10);
        Second.salary+= ((Second.salary/100) * 20);
        First.EmployeeDisplay();
        Second.EmployeeDisplay();
        
        
        
        
        
     
      
        
    }
    
}
