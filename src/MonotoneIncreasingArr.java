
public class MonotoneIncreasingArr {

	public static void main(String[] args) {
		int[] arr = {4,23,35,36,44,55};
		System.out.println(isArrMonotoneIncreasing(arr, 0, false));
	}
	
	static boolean isArrMonotoneIncreasing(int[] arr, int start, boolean isLarger){
		if (start == arr.length - 1) {
			return isLarger;
		}
		if (arr[start] < arr[start + 1]) {
			isLarger = true;
		} 
		if (arr[start] > arr[start + 1]) {
			isLarger = false;
		}
		if (!isLarger) {
			return false;
		}
		return isArrMonotoneIncreasing(arr, start + 1, isLarger);
		
	}

}
