
public class duplicate {

	public static void main(String[] args) {
		//initialize an array
		int arr[]= {1,2,3,8,9,8,2,4,7,7};
		
		// find if the choosen number has duplicate element, 
		//to store the we choosen number we choose i variabe
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]  && i !=j) {
					System.out.print(arr[i]+ " ");
					break;
				}
			}
		
		}

	}

}
