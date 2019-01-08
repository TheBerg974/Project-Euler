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
public class number3 {
    
    /*The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?*/
    
    public static void main(String[] args) {
        long num = 600851475143L;
        long counter = 0;
        
        for (double i = Math.floor(Math.sqrt(num)); i > 0; i--) {
            double temp = num/i;
            if(temp == (int)temp) {
                long number = (long)i;
                if(isPrime(number)) {
                    System.out.println(i);
                    break;
                }
            }
        }
        
        
    }
    
    public static boolean isPrime(long num) {
        if (num % 2 == 0) {
          return false; // checks divisibility by 2
        }
        for (long i=3; i*i<=num; i+=2) {
          if (num % i == 0) {
            return false;
          }
        }
        return true;
   }
}
