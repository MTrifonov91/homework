/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_4_24;

/**
 *
 * @author User
 */
public class Task_4_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int r=0; r<=8; r++){
            if (r==0 || r==8){
                for (int c=0; c<=8; c++){
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                            System.out.print(" ");
                            break;
                        case 4:
                            System.out.print("*");
                            break;
                        default:
                            System.out.println(" ");
                            break;
                    }
                }
            }
               else if (r==1 || r==7){
                for (int c=0; c<=8; c++){
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:
                        case 6:
                        case 7:
                            System.out.print(" ");
                            break;
                        case 3:    
                        case 4:
                        case 5:
                            System.out.print("*");
                            break;
                        default:
                            System.out.println(" ");
                            break;
                    }
                }
            }
            else if (r==2 || r==6){
                for (int c=0; c<=8; c++){
                    switch (c) {
                        case 0:
                        case 1:
                        case 7:
                            System.out.print(" ");
                            break;
                        case 2:    
                        case 3:    
                        case 4:
                        case 5:
                        case 6:    
                            System.out.print("*");
                            break;
                        default:
                            System.out.println(" ");
                            break;
                    }
                }
            }
            else if (r==3 || r==5){
                for (int c=0; c<=8; c++){
                    switch (c) {
                        case 0:
                            System.out.print(" ");
                            break;
                        case 1:
                        case 2:    
                        case 3:    
                        case 4:
                        case 5:
                        case 6:   
                        case 7:
                            System.out.print("*");
                            break;
                        default:
                            System.out.println(" ");
                            break;
                    }
                }
            
        }
            else {
                for (int c=0; c<=8; c++){
                    switch (c) {
                        case 0:
                        case 1:
                        case 2:    
                        case 3:    
                        case 4:
                        case 5:
                        case 6:   
                        case 7:
                            System.out.print("*");
                            break;
                        default:
                            System.out.println("*");
                            break;
                    }
                }
            }
    }
}
}
