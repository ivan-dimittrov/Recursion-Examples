
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 7;
		System.out.println(primeNumCheck(n,1,false));
	}
	static boolean primeNumCheck(int n, int cnt,boolean b){
		if (cnt == n) {
			return b;
		}
		if (cnt != 1) {
			if (n % cnt == 0) {
				b = false;
				return b;
			}
		} 
		if (n % cnt != 0) {
			b = true;
		}
		return primeNumCheck(n, cnt+1, b);
	}
}
