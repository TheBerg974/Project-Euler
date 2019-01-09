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
public class problem9 {
    
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        
        for (int i = 1; i < 1000; i++) {
            a = i;
            for (int j = 1; j < 1000; j++) {
                b = j;
                c = (int)(Math.pow(a, 2) + Math.pow(b, 2));

                
                if(isNumberSquare(c)) {
                    if((a + b + Math.sqrt(c)) == 1000.0) {
                        System.out.println((int)(a*b*Math.sqrt(c)));
                        break;
                    } else {
                        continue;
                    }
                }
            }
                if(isNumberSquare(c)) {
                    if((a + b + c) == 1000) {
                        break;
                    } else {
                        continue;
                    }
                }
        }
        
        
    }
    
    public static boolean isNumberSquare(int num) {
        double sqrt = Math.sqrt(num);
        return (sqrt == (int)sqrt);
    }
    
}
