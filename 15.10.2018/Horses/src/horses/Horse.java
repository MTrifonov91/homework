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
public class Horse {
    
    private String name;
private String color;
private int birthYear;

public String getName()
{
  return name;
}

public void setName(String aName)
{
  name = aName;
}

public String getColor()
{
  return color;
}

public void setColor(String aColor)
{
  color = aColor;
}

public int getBirthYear()
{
  return birthYear;
}

public void setBirthYear(int aBirthYear)
{
  birthYear = aBirthYear;
}
@Override
public String toString()
{
  return "Horse Name: " + name + "\n"
    + "Color: " + color + "\n"
    + "Birth Year: " + birthYear + "\n";
}

public Horse(String aName, String aColor, int aBirthYear)
{
  name = aName;
  color = aColor;
  birthYear = aBirthYear;
}
    
}
