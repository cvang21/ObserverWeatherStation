/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Map;

/**
 *
 * @author cvadmin
 */
public class ColorTracker implements TeamColorObserver{

    @Override
    public void processColorEvent() {
        showDisplay();
    }
    
    private void showDisplay(){
        System.out.println("Showing Team Colors!!");
    }
    
   

}
