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
public class numberFour {
    /*A palindromic number reads the same both ways. 
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two 3-digit numbers.*/
    public static void main(String[] args) {
        
        ArrayList<Integer> array = new ArrayList<>();
        
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int mult = i*j;
                if(isPalindromic(mult)) {
                    array.add(mult);
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) > max) {
                max = array.get(i);
            }
        }
        
        System.out.println(max);
    }
    
    public static boolean isPalindromic(int num) {
        String s1 = Integer.toString(num);
        String s2 = "";

        for(int i = s1.length(); i > 0 ; i--) {
            s2 += s1.charAt(i-1);
            
        }
        
        if(s1.equals(s2)) {
            return true;
        }else {
            return false;
        }
    }
}
