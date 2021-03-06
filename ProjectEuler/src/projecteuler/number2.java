/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.util.ArrayList;

/**
 *
 * @author Sam
 */
public class number2 {
    
    /*Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
    By starting with 1 and 2, the first 10 terms will be:
    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
    find the sum of the even-valued terms.*/
    
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        
        array.add(1);
        array.add(2);
        
        for(int i = 2; i < 4000000; i++) {
            int fn = array.get(i-1) + array.get(i-2);
            if (fn > 4000000) {
                break;
            } else {
                array.add(fn);
            }
        }
        
        for(int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 != 0) {
                array.remove(i);
                i--;
            }
        }
        
        int sum = 0;
        for(int i = 0; i < array.size(); i++) {
            sum += array.get(i);
        }
        
        System.out.println(sum);
    }
}
