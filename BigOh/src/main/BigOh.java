package main;

import java.util.Scanner;
import java.util.Vector;

import javax.lang.model.util.ElementScanner14;

public class BigOh {
	
	/* Binary Search: Should run in Theta(logn) time */
	/* Returns true if item is in the array a */
	public static boolean binarySearch(int[] a, int item) {
		//TODO: IMPLEMENT THIS METHOD
		int lower=0;
		int upper = a.length;
		int mid = 0;
		while(lower<=upper){
			mid = (lower+upper)/2;
			if(mid==item)
				return true;
			else if(item <mid){
				upper = mid;
			}
			else lower = mid;
		}
		return false;
	}
	
	/* Max value in array: Should run in Theta(n) time */
	public static int max(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		if(a.length==0) return 0; //error

		int max = a[0];
		for(int i= 0; i<a.length;i++){
			if(a[i]>max) max = a[i];
		}
		return max;
	}
	
	/* Calls binary search n times. Counts number of successful searches */
	/* You should search for the numbers 1 through n in succession */
	/* Should run in Theta(nlogn) time */
	public static int multipleBinarySearch(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		int count = 0;
		for(int i=0;i<a.length;i++){
			if(binarySearch(a,i)) count++;
		}
		return count;
	}
	
	/* Counts pairs of numbers whose sum is multiple of 5 */
	/* Should run in Theta(n^2) time */
	public static int allPairs(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		int count = 0;
		int aa;
		int b;
		for(int i=0;i<a.length;i++){
			aa=a[i];
			for(int j=i+1;j<a.length;j++){
				b=a[i];
				if(aa+b==5) count++;
			}
		}
		
		return count;
	}
	
	/* Counts the pairs of three in the list a,b,c in which a+b=c */
	/* Should run in Theta(n^3) time */
	public static int allTriads(int[] a) {
		//TODO: IMPLEMENT THIS METHOD
		int count = 0;
		int aa;
		int b;
		for(int i=0;i<a.length;i++){
			aa=a[i];
			for(int j=i+1;j<a.length;j++){
				b=a[i];
				for(int k=0;k<a.length;k++){
					if(aa+b==a[k]) count++;
				}
				
			}
		}
		
		return count;
	}
	
	
	/* Prints all subsets of a */
	/* Should run in Theta(2^n) time */
	/* e..g, {1,2,3} would print {},{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3} */
	public static void allSubsets(int[] a, int i, Vector<Integer> sol) {
		if(i >= a.length) {
			//Found another subset, but not printing because printing is really slow.
			return;
		}		
		allSubsets(a, i+1, sol);
		sol.add(a[i]);
		allSubsets(a, i+1, sol);
		sol.remove(sol.size()-1);
	}

}
