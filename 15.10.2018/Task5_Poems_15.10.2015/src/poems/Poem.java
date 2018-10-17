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
public class Poem {
    
    private String poemName;
    private int lines;

    public Poem(String poemName, int lines) {
        this.poemName = poemName;
        this.lines = lines;
    }

    public String getPoemName() {
        return poemName;
    }

    public int getLines() {
        return lines;
    }

    @Override
    public String toString() {
        return "Poem{" + "poemName=" + poemName + ", lines=" + lines + '}';
    }
    
    
}
