/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author User
 */
public class TestBook {
    
    public static void main(String []args){
       
        Author wasea = new Author("Wasea", "wasea007@gmail.com", 'M');
        
        Book firstBook = new Book("The tale of Bob", wasea, 25.20);
        Book secondBook = new Book("The adventures of Bob", wasea, 25.20, 3);
       
        
        
        
        
        
        System.out.println(wasea);
        System.out.println(firstBook);
        System.out.println(secondBook);
        
    }
    
}
