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
	
	public static void mergeSort(int arr[], int l, int r) {
		if (l < r) {
            int m = (l + r) / 2;
            QuadSorts.mergeSort(arr, l, m);
            QuadSorts.mergeSort(arr, m + 1, r);
            sort(arr, l, m, r);
        }
    }
    public static void sort(int arr[], int l, int m, int r) {
        int leftarr = m - l + 1;
        int rightarr = r - m;

        int left[] = new int[leftarr];
        int right[] = new int[rightarr];

        for (int i = 0; i < leftarr; ++i)
            left[i] = arr[l + i];
        for (int j = 0; j < rightarr; ++j)
            right[j] = arr[m + 1 + j];
        int i = 0;
        int j = 0;
        int k = l;
        while (i < leftarr && j < rightarr) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftarr) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rightarr) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
