/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package f1app;

/**
 *
 * @author Kyle Haines - 2025
 */
// delete this comment by reverting
public class Team {
    private String teamName;
    private String teamHome;
    private Driver [] drivers = new Driver[2];
    public String deleteMe;
    
    public String getTeamName(){
        return this.teamName;
    }
    
    public String getTeamHome(){
        return this.teamHome;
    }
    
    public String driversOutput;
    public String getDriver(){
        
        for(int i = 0; i < drivers.length; i++){
          driversOutput += drivers[i] + "\n";  
        }
        return driversOutput;
    }
}
