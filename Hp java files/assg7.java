import java.util.Scanner;
class assg7{

	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = n.nextInt();
		int factorial = 1;
		for(int i=num;i>0;i--){
			factorial = factorial*i;
		}
		System.out.println(factorial);
	}
}