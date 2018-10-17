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
public class Haiku extends Poem {
    
    private static int LINES = 3;

    public Haiku(String poemName) {
        super(poemName, LINES);
    }
    
    @Override
    public String toString() {
        return "Haiku{" + getPoemName() + "lines " + getLines() +'}';
    }
    
}
