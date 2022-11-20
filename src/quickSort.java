
public class quickSort {
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i =low-1;
		
		for (int j=low; j<high; j++) {
			if (arr[j]< pivot) {
				i++;
				//swap
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
		}
	}
		i++ ;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] =temp;
		return i;
	}
	public static void quickSort(int arr[], int low, int high) {
		if (low< high) {
			int pidx = partition(arr,low,high);
			
			quickSort(arr, low, pidx-1);
			quickSort(arr,pidx+1, high);
			
					
		}
	}
	 
	   public static void main(String args[]) {
		   
	       int arr[] = {8,9,3,7,6,10,5};
	       int n = arr.length; // lenght of array
	       
	       quickSort(arr, 0, n-1); // low=0; high=n-1
	       
	 // print
	       for(int i=0; i<n; i++) {
	    	   System.out.print(arr[i] + " ");
	       }
	     System.out.println();
	   }
}
	
