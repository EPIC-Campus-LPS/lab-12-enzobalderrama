package pack;

public class SortingTester {

	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)((Math.random()+5)*10);
		}
		//I changed the array length to test out the sheet
		
		int[] arr1 = arr;
		long startTime1 = System.currentTimeMillis();
		QuadSorts.bubbleSort(arr1);
		long endTime1 = System.currentTimeMillis();
		
		int[] arr2 = arr;
		long startTime2 = System.currentTimeMillis();
		QuadSorts.insertionSort(arr2);
		long endTime2 = System.currentTimeMillis();
		
		int[] arr3 = arr;
		long startTime3 = System.currentTimeMillis();
		QuadSorts.selectionSort(arr3);
		long endTime3 = System.currentTimeMillis();
		
		int[] arr4 = arr;
		long startTime4 = System.currentTimeMillis();
		QuadSorts.mergeSort(arr4, 0, arr4.length/2);
		long endTime4 = System.currentTimeMillis();
		
		
		System.out.printf("%d%n",  endTime1 - startTime1);
		System.out.printf("%d%n",  endTime2 - startTime2);
		System.out.printf("%d%n",  endTime3 - startTime3);
		System.out.printf("%d%n",  endTime4 - startTime4);
	}
	

}
