/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author User
 */
public class TestPeople {
    public static void main(String[] args) {
        Person pepa = new Person("Pepa Pig", "Burlington VE USA");
        System.out.println(pepa);
        Student george = new Student("George Pig", "Burlington VE USA", "Geology", 1, 12500);
        System.out.println(george);
        Staff petr = new Staff("Porosenok Petr", "Saransk RF", "Lenin's comunist school",15);
        System.out.println(petr);
    }
    
}
