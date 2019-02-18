import java.util.Arrays;

//Reversing elements in array
public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = reverseArr(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr2));
	}
	
	public static int[] reverseArr(int[] arr,int start,int end){
		if (start > end) {
			return arr;
		}else {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		return reverseArr(arr, ++start, --end);
	}
}
