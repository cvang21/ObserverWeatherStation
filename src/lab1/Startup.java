/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author cvadmin
 */
public class Startup {
    
    public static void main(String[] args) {
        Team team = new Team();
        ColorTracker ct = new ColorTracker();
        team.AddSubscriber(ct);
        team.setTeamColor("Blue");
    }
}
