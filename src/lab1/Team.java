/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvadmin
 */
public class Team {
    
    private String teamColor;
    private List<TeamColorObserver> subscribers;
    
    public Team(){
        // Creating an object with the new operator
        subscribers = new ArrayList<>();  // <> used here is the diamomd pattern
        
    }

    public void AddSubscriber(TeamColorObserver tColorObs){
        subscribers.add(tColorObs);
    }
    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
        notifyObservers();
    }
    
    public void notifyObservers(){
        //Loop through the list and call the common methods
        //Uses the new For looping style
        for(TeamColorObserver obj : subscribers){
            obj.processColorEvent();
        }       
    }
}
