/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_task_4;

/**
 *
 * @author User
 */
public class Sandwich {
    private String mainIngridient;
    private String breadType;
    private double price;

    Sandwich(){
        mainIngridient = "";
        breadType = "";
        price = 0;
    }
    public void setmainIngridient (String mainIngridient){
        this.mainIngridient = mainIngridient;
    }
    public void setbreadType (String breadType){
        this.breadType = breadType;
    }
    public void setprice (double price){
        this.price = price;
    }
    public String getmainIngridient(){
        return mainIngridient;
    }
    public String getbreadType(){
        return breadType;
    }
    public double getprice(){
        return price;
    }
}
