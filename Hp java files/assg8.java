import java.util.Scanner;
class assg8{

	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = n.nextInt();
		int fib1 = 0;
		int fib2 = 1;
		int fib = 0;
		System.out.println(fib1);
		System.out.println(fib2);
		for(int i=0;i<num;i++){
			fib = fib1+fib2;
			System.out.println(fib);
			fib1 = fib2;
			fib2 = fib;
		}
	}
}