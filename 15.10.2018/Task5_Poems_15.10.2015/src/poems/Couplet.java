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
public class Couplet extends Poem {
    
    private final static int LINES=2;

    public Couplet(String poemName) {
        super(poemName, LINES);
    }

    @Override
    public String toString() {
        return "Couplet{" + getPoemName() + "lines " + getLines() +'}';
    }
    
    
}
