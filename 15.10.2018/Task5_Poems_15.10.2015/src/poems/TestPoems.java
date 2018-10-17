/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poems;

/**
 *
 * @author User
 */
public class TestPoems {
    
    public static void main(String[] args) {
        Poem p = new Poem("Autumn", 10);
        Couplet c = new Couplet("October");
        Haiku h = new Haiku("Yellow Leaves");
        Limerick l = new Limerick("Leaveless Trees");
        
        System.out.println(p);
        System.out.println(c);
        System.out.println(h);
        System.out.println(l);
        
    }
    
}
