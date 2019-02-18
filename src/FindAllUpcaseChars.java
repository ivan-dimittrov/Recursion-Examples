
public class FindAllUpcaseChars {

	public static void main(String[] args) {
		String str = "HellO wOrLD ";
		System.out.println(findAllUpcaseSymbols(str, 0,""));
	}
	static String findAllUpcaseSymbols(String str, int i,String result){
		if (i == str.length()) {
			return result;
		}
		if (Character.isUpperCase(str.charAt(i))) {
			result += str.charAt(i) + " ";
		}
		return findAllUpcaseSymbols(str, i + 1, result);
	}
}
