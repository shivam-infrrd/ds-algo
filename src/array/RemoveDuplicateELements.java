package array;

public class RemoveDuplicateELements {

	
	public static void main(String args[]) {
		
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
        int n = arr.length; 

        n = removeDuplicates(arr, n); 
        
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
        
	}

	private static int removeDuplicates(int[] arr, int n) {
		
		int j=0;
		for(int i=0;i<n-1;i++) {
			
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		
		return j;
	}
}
