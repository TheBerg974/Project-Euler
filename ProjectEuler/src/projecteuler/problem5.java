/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

/**
 *
 * @author Sam
 */
public class problem5 {
    
    /*2520 is the smallest number that can be divided by each 
    of the numbers from 1 to 10 without any remainder.
    What is the smallest positive number that is evenly divisible 
    by all of the numbers from 1 to 20? */
    
    public static void main(String[] args) {
        int counter = 20;
        while(true) {
            if(isDivisibleby1To20(counter)) {
                System.out.println(counter);
                break;
            } else {
                counter++;
                continue;
            }
        }
    }
    
    public static boolean isDivisibleby1To20(int num) {
        
        for (int i = 2; i <= 20; i++) {
            if(num % i != 0) {
                return false;
            }
        }
        
        return true;
    }
}
