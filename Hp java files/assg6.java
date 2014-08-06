import java.util.Scanner;
class assg6{

	public static void main(String[] args){
	Scanner n = new Scanner(System.in);
	System.out.println("Enter the lower bound");
	int lower = n.nextInt();
	System.out.println("Enter the upper bound");
	int upper = n.nextInt();
	int j;
	for(int i =lower;i<=upper;i++){
		for(j=2;j<=Math.sqrt(i);j++){
			if(i%j==0)
				break;
		}
		if(j>Math.sqrt(i))
			System.out.println(i);
	}
		
	}
}