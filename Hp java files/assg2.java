import java.util.Scanner;
public class assg2{

	public static void main(String[] args){
	System.out.println("Enter two numbers");
	Scanner s = new Scanner(System.in);
	int x = s.nextInt();
	int y = s.nextInt();
	if(x>y)
		System.out.println(y);
	else
		System.out.println(x);
	}
}