package pack;

public class QuadSorts {
	
	public static int[] bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
            for (int second = 0; second < arr.length - 1 - i; second++) {
                if (arr[second] > arr[second + 1]) {
                    int tempvariable = arr[second];
                    arr[second] = arr[second + 1];
                    arr[second + 1] = tempvariable;
                }
            }
        }
		return arr;
	}
	
	public static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
            int smallestvalue = i;
            for (int second = i + 1; second < arr.length; second++) {
                if (arr[second] < arr[smallestvalue]) {
                    smallestvalue = second;
                }
            }
            int temp = arr[smallestvalue];
            arr[smallestvalue] = arr[i];
            arr[i] = temp;
        }
		return arr;
	}
	
	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) { 
            int tosort = arr[i]; 
            int second = i - 1;
            while (second >= 0 && arr[second] > tosort) {
                arr[second + 1] = arr[second];
                second = second - 1;
            }
            arr[second + 1] = tosort; 
        }
		return arr;
	}
	
	public static int[] mergeSort(int[] arr) {
		return arr;
	}
	
}
