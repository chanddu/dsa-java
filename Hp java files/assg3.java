import java.util.Random;
class assg3{
	public static void main(String[] args){
	Random n = new Random();
	int num;
	for(int i=0;i<5;i++)
	{
		num = 1+n.nextInt(100);
		System.out.println(num);
	}
	}
}