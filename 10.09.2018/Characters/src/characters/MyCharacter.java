/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

/**
 *
 * @author User
 */
public class MyCharacter {
    private String eyesColor;
    private String race;
    private String gender;
    private int level;

    public MyCharacter(String eyesColor, String race, String gender, int level) {
        this.eyesColor = eyesColor;
        this.race = race;
        this.gender = gender;
        this.level = level;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public String getRace() {
        return race;
    }

    public String getGender() {
        return gender;
    }

    public int getLevel() {
        return level;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "MyCharacter{" + "eyesColor=" + eyesColor + ", race=" + race + ", gender=" + gender + ", level=" + level + '}';
    }
    
    
    
    
    
}
