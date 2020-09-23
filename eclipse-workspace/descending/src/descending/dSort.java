package descending;

public class dSort {

	public static void main(String[] args) {
		int[] arr = new int[] {10, 19, 13, 43, 65, 100, 95, 20, 60, 72};
		descendingSort(arr);
		}
		
	public static int[] descendingSort(int[] numbers) {
		
		int[] sorted = new int[numbers.length];
		int temp = 0;
		for(int i = 0;i< numbers.length; i++) {
			
			for(int c = 0; c < numbers.length-1; c++) {
				
				if(numbers[c+1]>numbers[c]) {
					temp = numbers[c];
					numbers[c] = numbers[c+1];
					numbers[c+1] = temp;
				}}}	
		for(int i = 0;i< numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		return sorted;
	}}
