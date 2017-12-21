package com.sean.algorithm.sort;

/**
 * Created by sean on 2017/12/19 9:41.
 */
public class Quickcort {

	private static void recursive (int []a,int left,int right){
		int provit;
		while(left < right){
			provit = partition(a,left,right);
			recursive(a,left,provit-1);
			recursive(a,provit+1,right);
		}
	}

	private static int partition(int []a,int left, int right){

		int privot = a[left];
		while(left<right){
			while(left<right && a[right] >= privot){
				right--;
			}
			if(left<right){
				a[left++] = a[right];
			}

			while(left<right && a[left] <= privot){
				left++;
			}
			if(left<right){
				a[right--] = a[left];
			}
		}
		a[left] = privot;

		return left;
	}

	public static void main(String[] args) {
		int a[] = {5,3,6,9,1,2,8,10};
		recursive(a,0,a.length-1);
		for (int i:a) {
			System.out.println(i);
		}
	}
}

class test{

	static void quicksort(int []a,int left,int right){
		int privot;
		if(left < right){
			privot = partition(a,left,right);
			quicksort(a,left,privot-1);
			quicksort(a,privot+1,right);
		}
	}

	static int partition(int []a,int left,int right){

		int privot = a[left];
		while(left<right){
			while (left<right && privot <= a[right]){
				right--;
			}
			if(left<right){
				a[left++] = a[right];
			}

			while(left<right && privot>= a[left]){
				left++;
			}
			if(left<right){
				a[right--] = a[left];
			}
		}

		a[left] = privot;
		return left;
	}

	public static void main(String[] args) {
		int [] a = {1,4,2,5,3,7,4,8,9};
		quicksort(a,0,a.length-1);
		for (int i:
			 a) {
			System.out.println(i);
		}
	}
}
