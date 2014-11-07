import java.lang.System; 

public class merge_sort{

	public static void main(String [] args){
		System.out.println("test");

		int array [] = {1, 7, 4, 5, 8, 3, 99, 102};
		

		int[] solution = sort(array);
		for (int i = 0; i < solution.length; i++){
			System.out.print(solution[i] + " ");
		}

	}

	public static int[] sort(int [] array){

		if (array.length <= 1){
			return array; 
		}

		int[] a = new int[(array.length / 2)];
		int[] b = new int[array.length - a.length];

		System.arraycopy(array, 0, a, 0, a.length);
		System.arraycopy(array, a.length, b, 0, b.length);

		//sort each half recursively. 
		sort(a);
		sort(b);

		return merge(a, b, array);
	}

	public static int[] merge(int[] a, int[] b, int [] array){
		int a_index = 0; 
		int b_index = 0; 
		int array_index = 0; 

		while (a_index < a.length && b_index < b.length){
			if (a[a_index] < b[b_index]){
				array[array_index] = a[a_index];
				a_index++; 
			}
			else {
				array[array_index] = b[b_index];
				b_index++; 
			} 
			array_index++; 
		}

		if (a_index != a.length){
			System.arraycopy(a, a_index, array, array_index, a.length - a_index);
		}
		if (b_index != b.length){
			System.arraycopy(b, b_index, array, array_index, b.length - b_index);
		}
		return array; 
	}

}