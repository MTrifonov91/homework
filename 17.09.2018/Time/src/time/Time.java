/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author User
 */
public class Time {
    
    private static final int MIN = 0;
    private static final int HOUR_MAX = 23;
    private static final int MAX = 59;
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public int getHour() {
        return hour;
    }
    
    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    public void setSecond(int second) {
        this.second = second;
    }
    
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
                
    }
    
    public int nextSecond () {
        return second++ ; 
    }
    
    public int previousSecond () {
        return second-- ; 
    }
    
     
    
    @Override
    public String toString() {
        return String.format("%02d", hour) + ":" + String.format("%02d", minute) + ":" + String.format("%02d", second);
        
    }
    
    
    
}
