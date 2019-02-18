import java.util.*;
public class MinNumInArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the length of the array");
		int length;
		
		do {
			length = sc.nextInt();
			if (length<0) {
				System.out.println("Enter a positive num for length");
			}
		} while (length < 0);
		
		int[] arr = new int[length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int minNum = findMinNum(arr,0,arr[0]);
		System.out.println(minNum);
		sc.close();
	}
	
	static int  findMinNum(int[] arr, int startIndex,int minNum){
		if (startIndex == arr.length) {
			return minNum;
		}
		if (arr[startIndex] < minNum) {
			minNum = arr[startIndex];
		}
		return findMinNum(arr, startIndex + 1, minNum);
	}

}

