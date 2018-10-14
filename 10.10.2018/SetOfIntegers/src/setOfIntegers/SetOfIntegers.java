/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setOfIntegers;

/**
 *
 * @author User
 */
public class SetOfIntegers {
    
    boolean[] integerSet = new boolean[100];

    public SetOfIntegers() {

    }

    public boolean[] getIntegerset() {
        return this.integerSet;
    }

    public static SetOfIntegers union(SetOfIntegers firstSet, SetOfIntegers secondSet) {
        SetOfIntegers result = new SetOfIntegers();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            result.integerSet[i] = firstSet.integerSet[i] || secondSet.integerSet[i];
        }
        return result;
    }

    public static SetOfIntegers intersection(SetOfIntegers firstSet, SetOfIntegers secondSet) {
        SetOfIntegers result = new SetOfIntegers();
        for (int i = 0; i < result.getIntegerset().length; i++) {
            result.integerSet[i] = firstSet.integerSet[i] && secondSet.integerSet[i];
        }
        return result;
    }

    public void insertElement(int element) {
        if (element < this.integerSet.length || element >= 0) {
            this.integerSet[element - 1] = true;
        }
    }
    
    public void deleteElement(int element) {
        if (element < this.integerSet.length || element >= 0) {
            this.integerSet[element - 1] = false;
        }
    }

    @Override
    public String toString(){
        String result = "Integer{";
        for(int i = 0; i< this.integerSet.length; i++){
            if(this.integerSet[i]) {
                result = result + i + " ";
            }
        }
        result += "}";
   
        
        return result;
    }
    
}
