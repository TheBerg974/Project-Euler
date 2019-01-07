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
public class numberTwo {
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
