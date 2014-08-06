import java.util.Scanner;
class assg9{

	public static void main(String[] args){
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number");
		int height = n.nextInt();
		int hai = (int)'A';
		int h = height;
		for(int i=1;i<=height;i++){
			for(int j=1;j<h;j++){
				System.out.print(" ");
			}
			h--;
			int z = 2*i-1;
			for(int k=0;k<=Math.ceil(z/2);k++){
				System.out.print((char)hai);
				hai++;
			}
			hai--;
			for(int k=0;k<Math.floor(z/2);k++){
				hai--;
				System.out.print((char)hai);
			}
			System.out.print("\n");
			
		}
	}
}