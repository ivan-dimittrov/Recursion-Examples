import java.util.Arrays;


public class FindAllNegativeNums {

	public static void main(String[] args) {
		int[][] arr = {{3,4,5,-1},{-3,4,3,-1},{-3,-34,5,5}};
		int[] result = new int[countNegativNums(arr, 0,0, 0)];
		result = findNegativeNums(arr,0,0,0,result);
		System.out.println("All negative numbers from the matrix are: " + Arrays.toString(result));
	}
	static int[] findNegativeNums(int[][] arr,int i,int j, int index ,int[] result){
		if (i == arr.length) {
			return result;
		}
		if (j == arr[i].length) {
			j = 0;
			return findNegativeNums(arr, i + 1,j, index, result);
		}
		if (arr[i][j] < 0) {
			result[index] = arr[i][j];
			index++;
		}
		return findNegativeNums(arr, i,j+1, index, result);
	}
	
	static int countNegativNums(int[][] arr, int i,int j, int cnt){
		if (i == arr.length) {
			return cnt;
		}
		if (j == arr[i].length) {
			j = 0;
			return countNegativNums(arr, i + 1,j, cnt);
		}
		if (arr[i][j] < 0) {
			cnt++;
		}
		return countNegativNums(arr, i,j+1, cnt);
	}
}
