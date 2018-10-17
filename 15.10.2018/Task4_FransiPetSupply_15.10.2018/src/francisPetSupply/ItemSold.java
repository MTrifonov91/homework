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
public class ItemSold {
    private int invoiceNum;
    private String description;
    private float price;

    public ItemSold(int invoiceNum, String description, float price) {
        this.invoiceNum = invoiceNum;
        this.description = description;
        this.price = price;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
}
