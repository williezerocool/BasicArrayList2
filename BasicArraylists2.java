/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarraylists2;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class BasicArraylists2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        ArrayList<Integer> arrList = new ArrayList<>();
        Random r = new Random();
       
      
        
        
        do{
            Integer num = 1 + r.nextInt(99);
            arrList.add(num);
          
        }while(arrList.size() < 10);
    
    
        
        System.out.print("ArrayList: " + arrList);
    }
 }
