/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayOfWeek;
import java.util.Arrays;

/**
 *
 * @author User
 */
public class DayOfWeek {
    
    private String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", 
        "Friday", "Saturnday", "Sunday"};
    private String[] openHours = {"9 to 9", "10 to 6", "11 to 5"};
    private String day;
    
    public DayOfWeek(String day) {
        this.day = day;
        
    }

    @Override
    public String toString() {
        String result="";
        for (int i = 0; i< days.length; i++) {
            if (this.day.equals(days[i])) {
                if (i < 5){
                  result = "On " + day + " we are oppened from " + openHours[0];  
                }
                else if (i == 5) {
                  result = "On " + day + " we are oppened from " + openHours[1];
                }
                else {
                  result = "On " + day + " we are oppened from " + openHours[2];
                }
                break;    
                }
            else{
                result = "You entered invalid day";
            }    
            }
            
        
        
        return Arrays.toString(days) + "\n" + result;
    }
    
    
}
