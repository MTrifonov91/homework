/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_task_4;

/**
 *
 * @author User
 */
public class TestSandwich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich TunaSandwich = new Sandwich();
            TunaSandwich.setmainIngridient("Tuna");
            TunaSandwich.setbreadType("Wheat");
            TunaSandwich.setprice(4.99);
            System.out.println("You ordered a " + TunaSandwich.getmainIngridient()+
                    " sandwich, with " + TunaSandwich.getbreadType() +
                    " bread, for " + TunaSandwich.getprice() + "$");
    }
    
}
