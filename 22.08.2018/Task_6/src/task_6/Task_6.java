/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_6;

/**
 * This program displays all perfect numbers from 1 to 1000.
 * @author MihailT
 */
public class Task_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int devider;
        int perfect;
        int sum_of_deviders=0;
        for (int i =2; i<=10; i++){
            System.out.println("i is " + i);
            for (int j = 1; j<i; j++){
                System.out.println("j is " + j);
                     if (j<i){ 
                    if (i%j==0){
                    devider = j;
                        System.out.println("devider is " + devider);
                        
                        sum_of_deviders += devider;
                        System.out.println("sum is " + sum_of_deviders);
                    }              
    }  
}
}
}
}