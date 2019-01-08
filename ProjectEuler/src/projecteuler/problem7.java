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
public class problem7 {

    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int counter = 2;
        array.add(2);
        while (true) {
            if (isPrime(counter)) {
                array.add(counter);
            } 
            
            counter++;

            if (array.size() == 10001) {
                break;
            }
        }

        System.out.println(array.get(10000));
    }

    public static boolean isPrime(long num) {
        if (num % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
