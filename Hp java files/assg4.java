import java.util.Scanner;
class assg4{

	public static void main(String[] args){
	System.out.println("Enter the mark");
	Scanner n = new Scanner(System.in);
	float mark = n.nextFloat();
	if(mark>90&&mark<=100)
		System.out.println("S");
	else if(mark>80)
		System.out.println("A");
	else if(mark>70)
		System.out.println("B");
	else if(mark>60)
		System.out.println("C");
	else if(mark>50)
		System.out.println("D");
	else if(mark>40)
		System.out.println("E");
	else if(mark>0)
		System.out.println("F");
	}
}