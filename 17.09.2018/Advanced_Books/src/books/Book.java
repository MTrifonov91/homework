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
public class Book {
    private String name;
    private Author author;
    private double price;
    private int quantity = 0;
    
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAuthor() {
        return author.toString();
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice (double price) {
        this.price = price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Book - " + name + author + "\nPrice - " + price + "\nQuantity - " + quantity;
    }
    
    
           
}
