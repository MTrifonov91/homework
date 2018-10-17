/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package francisPetSupply;

/**
 *
 * @author User
 */
public class TestFrancisPetSupply {
    
    public static void main(String[] args) {
        ItemSold item1 = new ItemSold(1001,"DogFood",10.50f);
        PetSold puppy = new PetSold(1002,"James",201.00f,true,true,false);

        System.out.println(item1.getDescription() + " was sold for " + item1.getPrice());

        System.out.println("A " + puppy.getDescription() + " was sold for " + puppy.getPrice());
        System.out.println("The " + puppy.getDescription() + " Neutered status is: " + puppy.isNeutered() +
                "\nAnd it is " + puppy.isHousebroken() + " that the " + puppy.getDescription() +" is housebroken");
    }
    
}
