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
public class problem6 {
    
    /*The sum of the squares of the first ten natural numbers is,
    1^2 + 2^2 + ... + 10^2 = 385
    The square of the sum of the first ten natural numbers is,
    (1 + 2 + ... + 10)^2 = 552 = 3025
    Hence the difference between the sum of the squares of the 
    first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
    Find the difference between the sum of the squares of the first one 
    hundred natural numbers and the square of the sum.*/
    
    public static void main(String[] args) {
        int sumOfSquares = 0;
        int squareOfSum = 0;
        
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        
        for (int i = 1; i <= 100; i++) {
            squareOfSum += i;
        }
        
        squareOfSum = (int)Math.pow(squareOfSum, 2);
        
        System.out.println(squareOfSum - sumOfSquares);
    }
    
}
