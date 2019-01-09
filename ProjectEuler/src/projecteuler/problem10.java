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
public class problem10 {

    public static void main(String[] args) {
        ArrayList<Long> array = new ArrayList<>();
        array.add(2L);
        for (long i = 3; i < 2000000; i++) {
            if(isPrime(i)) {
                array.add(i);
            }
        }
        
        long sum = 0;
        
        for (Long num : array) {
            sum += num;
        }
        System.out.println(array.toString());
        System.out.println(sum);
    }

    public static boolean isPrime(long num) {
        if (num % 2 == 0) {
            return false; // checks divisibility by 2
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
