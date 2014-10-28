/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cvadmin
 */
public class ListPractice {
    public static void main(String[] args) {
        
        //Good way to declare, it follows the LSP substitution priciple, Flexible and Non rigid
//        List myList = new ArrayList(); //Uses the LSP principle and is correct way
        
        //Makes it less fragile, but you can only store Strings in this list
        List<String> myList = new ArrayList<>();
        
       //Bad way because you can only store Array list in this variable.
//       ArrayList anotherList = new ArrayList();  //This is fragile and Rigid
       
        String s = "Hello";
        myList.add(s);
//        myList.add(5);
//        Integer i = new Integer(5); //Type wrappers
//        myList.add(i);
        
        //It appears you can do this, but it's an illusion because the compiler does it for you
//        myList.add(5);
       
        String s2 = myList.get(0);
//        String s2 = (String)myList.get(0); //Cast it
        // OR do the below
//        String s2 = myList.get(0).toString(); // Calls the toString method
        
    }
}
