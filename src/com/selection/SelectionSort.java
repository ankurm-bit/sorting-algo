package com.selection;

public class SelectionSort {

	public int[] sort(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	public int [] selectionSort(int [] arr , int n ) {
		for(int i = 0 ; i < n-1 ; i++) {
			int imin = i ;
			for(int j = i+1 ; j < n ; j++) {
				if(arr[j] < arr[imin])
					imin = j ;
			}
			int temp = arr[imin];
			arr[imin] = arr[i];
			arr[i] = temp ;
		}
		return arr;
	}

	public void display(int[] arr, int n) {
		for (int i1 : arr)
			System.out.print(i1 + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 2, 7, 4, 1, 5, 3 };
		int n = arr.length;
		SelectionSort sort = new SelectionSort();
		int[] res = sort.selectionSort(arr, n);
		sort.display(res, n);
	}

}
