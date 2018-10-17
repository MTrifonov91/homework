/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horses;

/**
 *
 * @author User
 */
public class RaceHorse extends Horse {
    
    private int completedRaces;

public int getCompletedRaces()
{
  return completedRaces;
}

public void setCompletedRaces(int aCompletedRaces)
{
  completedRaces = aCompletedRaces;
}
@Override
public String toString()
{
  return super.toString()
    + "Completed Races: " + completedRaces + "\n";
}

public RaceHorse(String aName, String aColor, int aBirthYear, int aCompletedRaces)
{
  super(aName, aColor, aBirthYear);
  completedRaces = aCompletedRaces;
}
}
