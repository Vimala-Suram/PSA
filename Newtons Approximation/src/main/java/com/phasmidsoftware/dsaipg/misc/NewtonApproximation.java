/*
 * Copyright (c) 2017-2024. Robin Hillyard
 */

package com.phasmidsoftware.dsaipg.misc;

class NewtonApproximation {
    public static void main(String[] args) {
        // Newton's Approximation to solve sin(x)=x
        double x = 1.0;
        int left = 200;
        for (; left > 0; left--) {
            final double y = Math.sin(x) - x;
            if (Math.abs(y) < 1E-7) {
                System.out.println("the solution to sin(x)=x is: " + x);
                //System.exit(0);
                break;
            }
            x = x -( y / (Math.cos(x) - 1));
        }

        //calculating sqrt of 2
        x = 1.0;
        left = 200;
        for (; left > 0; left--) {
            final double y = x * x - 2;  
            if (Math.abs(y) < 1E-7) {  
                System.out.println("The solution to sqrt(2) is: " + x);
                System.exit(0);  
            }
            x = x - (y / (2 * x));  
        }
    }
}