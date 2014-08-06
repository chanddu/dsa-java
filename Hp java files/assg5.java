import java.util.Scanner;
class assg5{

	public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	int num = n.nextInt();
	for(int i=2;i<=Math.sqrt(num);i++){
		if(num%i==0){
			System.out.println("Not Prime");
			break;
		}
	}
		if(i>Math.sqrt(num))
			System.out.println("Prime");
	}
}