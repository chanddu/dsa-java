
public class Alike {
	public static void main(String args[]){
		String str1[];
		String str2[];
		System.out.println("Input two strings to verify");
		Check checker = new Check();
		str1 = checker.readString();
		str2 = checker.readString();
		if(str1.length!=str2.length)
			System.out.println("Input lengths does not match");
		else{
			for(int i=0;i<str1.length;i++){
				int output = checker.checkAlike(str1[i], str2[i]);
				System.out.print(output+" ");
			}
			System.out.println();
		}
	}
}
