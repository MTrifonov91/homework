/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flow_control_task_7;

/**
 *  This program is a Mexican dream.
 * @author MihailT
 */
public class Flow_Control_Task_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int populationOfMexico = 121000000;
        int populationOfUSA = 315000000;
        int year=0;
        System.out.println("222");
        for (; populationOfMexico<populationOfUSA; year++){
            System.out.println("Year count = " + year);
            System.out.println("Population of Mexico \t Population of the USA \t Populaion difference"  );
            System.out.println(populationOfMexico + "\t\t " + populationOfUSA + "\t\t " + (populationOfUSA-populationOfMexico));
            populationOfMexico += (populationOfMexico/100)*1.01; 
            populationOfUSA -= (populationOfUSA/100)*0.15;
        }
        if (populationOfMexico>populationOfUSA){
            System.out.println("The population of Mexico has exceeded the population of the USA ");
            System.out.println("Year count = " + year);
            System.out.println("Population of Mexico \t Population of the USA \t Populaion difference"  );
            System.out.println(populationOfMexico + "\t\t " + populationOfUSA + "\t\t " + (populationOfUSA-populationOfMexico));
            populationOfMexico += (populationOfMexico/100)*1.01; 
            populationOfUSA -= (populationOfUSA/100)*0.15; 
        }
        
    }
    
}
