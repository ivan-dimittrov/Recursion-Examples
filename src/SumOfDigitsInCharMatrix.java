
public class SumOfDigitsInCharMatrix {
// Finding all digits in char matrix and return the sum of them.
	public static void main(String[] args) {
		char[][] arr = {{'a','2','a','a','3',},{'a','a','5','a',},
				{'a','5','5','a','a',},{'a','a','a','a','a','a','5',}};
		int n = digitSum(arr,0,0,0);
		System.out.println(n);
	}
	static int digitSum(char[][] arr, int i,int j, int sum){
		if (i == arr.length) {
			return sum;
		}
		if (j == arr[i].length) {
			j = 0;
			return digitSum(arr, i + 1, j, sum);
		}
		if (Character.isDigit(arr[i][j])) {
			sum += Integer.parseInt(arr[i][j]+"");
		}
		return digitSum(arr, i, j+1, sum);
	}
}
