package com.insert;

public class InsertionSort {

	public int [] insertionSort(int [] arr , int n ) {
		for(int i = 1 ;  i < n-1 ; i++) {
			int value = arr[i];
			int hole = i ;
			while(hole >0 && arr[hole-1]>value) {
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = value ;
		}
		return arr;
	}
	
	public void display(int[] arr, int n) {
		for (int i1 : arr)
			System.out.print(i1 + " ");
		System.out.println();
	}

	public static void main(String[] args) {
       int [] arr = {7,2,4,1,5,3};
       int  n = arr.length;
       InsertionSort insertionSort = new InsertionSort();
       int [] result = insertionSort.insertionSort(arr, n);
		insertionSort.display(result, n);
	}

}
