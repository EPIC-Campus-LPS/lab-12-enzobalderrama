package pack;

public class SortingTester {

	public static void main(String[] args) {
		int[] arr = new int[100];
		
		long startTime = System.currentTimeMillis();
		QuadSorts.bubbleSort(arr);
		long startTime1 = System.currentTimeMillis();
		QuadSorts.insertionSort(arr);
		long startTime2 = System.currentTimeMillis();
		QuadSorts.selectionSort(arr);
		long startTime3 = System.currentTimeMillis();
		
		
		System.out.printf("%d%n",  startTime1 - startTime);

		System.out.printf("%d%n",startTime2-startTime1);
		
		System.out.printf("%d%n",startTime3-startTime2);
	}
	

}
