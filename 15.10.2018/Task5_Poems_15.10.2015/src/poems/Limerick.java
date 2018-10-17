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
public class Limerick extends Poem{
    
    private static int LINES = 5;

    public Limerick(String poemName) {
        super(poemName, LINES);
    }
    
    @Override
    public String toString() {
        return "Limerick{" + getPoemName() + "lines " + getLines() +'}';
    }
    
}
