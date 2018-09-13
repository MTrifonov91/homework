/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardGame;

/**
 *
 * @author User
 */
public class Card {
    private char suit;
    private int cardValue;

    Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public void setCardValue(int cardValue) {
        if (cardValue>0 && cardValue<14){
            this.cardValue = cardValue;
        }
        
    }

    @Override
    public String toString() {
        return "Card{" + "suit=" + suit + ", cardValue=" + cardValue + '}';
    }
    
    
    
    
}
