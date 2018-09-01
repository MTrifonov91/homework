/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_6;

/**
 * This program displays a patern of Os.
 * @author MihailT
 */
public class Flow_Control_Task_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i+1; j++){
                if (j>0){
                System.out.print(" ");
                }
                
            }
            System.out.println("O");
        }
        
    }
    
}
