package projecteuler;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class number1 {
    
    /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 
    3, 5, 6 and 9. The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below 1000.*/
    
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i = 3; i < 1000; i++) {
            array.add(i);
        }
        
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) % 3 != 0 && array.get(i) % 5 != 0) {
                array.remove(i);
                i--;
            }
        }
        
        System.out.println(array.toString());
        
        int sum = 0;
        for(int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        
        System.out.println(sum);
    }
}
