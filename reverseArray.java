public class reverseArray{

	public static void main(String [] args){
		int[] arr = {1,2,3,4,5,6,7};

		arr = reverseInPlace(arr);

		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i] + " ");
		}
	}

	public static int[] reverseInPlace(int[] arr){

		int j = arr.length - 1; 
		for (int i = 0; i < arr.length / 2; i++){
			arr[i] = arr[j] ^ arr[i]; 
			arr[j] = arr[i] ^ arr[j];
			arr[i] = arr[i] ^ arr[j]; 
			j--; 
		}
		return arr; 
	}

	
}


