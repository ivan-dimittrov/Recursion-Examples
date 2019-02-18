
public class FindMirrorNumber {

	public static void main(String[] args) {
		int num = 321;
		findMirrorNum(num, 0);
	}
	static void findMirrorNum(int num, int mirrorNum){
		String str = new StringBuffer(Integer.toString(num)).reverse().toString();
		if (str.equals(Integer.toString(mirrorNum))) {
			System.out.println(mirrorNum);
			return;
		}
		findMirrorNum(num, mirrorNum + 1);
	}
}
