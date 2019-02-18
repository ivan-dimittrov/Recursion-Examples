
public class PrintNums {

	public static void main(String[] args) {
		int n = 6;
		printNums(n,1,"");
	}
	static void printNums(int n, int cnt, String str){
		if (cnt > n) {
			return;
		}
		str += cnt + " ";
		System.out.print(str);
		System.out.println();
		printNums(n, cnt + 1, str);
	}
}
