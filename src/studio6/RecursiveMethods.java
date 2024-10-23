package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
			// FIXME compute the geometric sum for the first n terms recursively
		if (n == 0) {
			return 0;
		}
		return (1 / Math.pow(2, n) + geometricSum(n - 1));
	}
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
		double radiusMinimumDrawingThreshold) {
	    
		if (radius < radiusMinimumDrawingThreshold) {
	        return;
	    }
		StdDraw.circle(xCenter, yCenter, radius);
		double newRadius = radius / 3.0;
		
		circlesUponCircles(xCenter, yCenter + radius, newRadius, radiusMinimumDrawingThreshold);  // Top
	    circlesUponCircles(xCenter, yCenter - radius, newRadius, radiusMinimumDrawingThreshold);  // Bottom
	    circlesUponCircles(xCenter + radius, yCenter, newRadius, radiusMinimumDrawingThreshold);  // Right
	    circlesUponCircles(xCenter - radius, yCenter, newRadius, radiusMinimumDrawingThreshold);  // Left
		// FIXME
	}

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		
			// FIXME create a helper method that can recursively reverse the given array
			
		    // Handle edge case: if the array is empty, return an empty array
		    if (array.length == 0) {
		        return new int[0];
		    }

		    // Create a new array to store the reversed elements
		    int[] reversedArray = new int[array.length];

		    // Call the recursive helper method
		    toReversedHelper(array, reversedArray, 0);

		    // Return the reversed array
		    return reversedArray;
		
	}
	
	private static void toReversedHelper(int[] original, int[] reversed, int index) {
	    // Base case: if index reaches the length of the original array, stop recursion
	    if (index == original.length) {
	        return;
	    }

	    // Place the element from the original array at the reversed position in the new array
	    reversed[original.length - 1 - index] = original[index];

	    // Recursive call to process the next element
	    toReversedHelper(original, reversed, index + 1);
	}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
		 public static int gcdRecursive(int p, int q) {
		        // Base case: if q becomes 0, return p as the GCD
		        if (q == 0) {
		            return p;
		        }

		        // Recursive case: call gcd with q and p % q
		        return gcdRecursive(q, p % q);
		 }
	}


