import java.util.ArrayList;
import java.util.List;


public class sort {

	public static void bubbleSort(int[] arr){
		boolean swapped = true;
		int j = 0;
		int tmp;
		while(swapped){
			swapped = false;
			j++;
			for(int i = 0; i < arr.length - j; i++){
				if(arr[i] > arr[i+1]){
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
					swapped = true;
				}
			}
		}
		printArray(arr);
	}
	
	public static void selectionSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			int index = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[j] < arr[index]){
					index = j;
				}
			}
			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
 		}
		printArray(arr);
	}
	
	public static void insertionSort(int[] arr){
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j-1;
            while ( (i > -1) && ( arr [i] > key ) ) {
                arr [i+1] = arr [i];
                i--;
            }
            arr[i+1] = key;
        }
        printArray(arr);

	}
	
	public static void printArray(int[] array){
		//Print out elements
		for(int k = 0; k < array.length; k++){
			System.out.println(array[k]);
		}
	}
	
	 public static void radixSort(int[] input) {
		  final int RADIX = 10;
		  // declare and initialize bucket[]
		  List<Integer>[] bucket = new ArrayList[RADIX];
		  for (int i = 0; i < bucket.length; i++) {
		    bucket[i] = new ArrayList<Integer>();
		  }
		 
		  // sort
		  boolean maxLength = false;
		  int tmp = -1, placement = 1;
		  while (!maxLength) {
		    maxLength = true;
		    // split input between lists
		    for (Integer i : input) {
		      tmp = i / placement;
		      bucket[tmp % RADIX].add(i);
		      if (maxLength && tmp > 0) {
		        maxLength = false;
		      }
		    }
		    // empty lists into input array
		    int a = 0;
		    for (int b = 0; b < RADIX; b++) {
		      for (Integer i : bucket[b]) {
		        input[a++] = i;
		      }
		      bucket[b].clear();
		    }
		    // move to next digit
		    placement *= RADIX;
		  }
		  printArray(input);
		}
	
	public static void main(String args[]){
		int[] array = new int[]{1,43,1,44,54};
		radixSort(array);
	}
}
