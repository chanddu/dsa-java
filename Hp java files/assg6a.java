import java.util.Scanner;
class assg6a{

	public static void main(String[] args){
	
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = n.nextInt();
		cubes c = new cubes();
		int flag = 0;
		/*while(flag!=5){
			if(num == c.findsoc(num)){
				System.out.println(num);
				flag++;
				num++;
			}
			else num++;
		}*/
			System.out.println(c.findsoc(num));
	}
}
		
class cubes{
private int sum=0;
public int findsoc(int x){
while(x!=0){
	sum+=Math.pow(x%10,3);
	x=x/10;
	}
	return sum;
	}
}