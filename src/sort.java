
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
	
	public static void main(String args[]){
		int[] array = new int[]{1,43,1,44,54};
		insertionSort(array);
	}
}
