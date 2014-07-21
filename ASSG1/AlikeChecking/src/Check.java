import java.util.Scanner;


public class Check {
	
	Scanner reader = new Scanner(System.in);
	public String[] readString(){
		String str;
		str = reader.nextLine();
		String []s = str.split(" ");
		return s;
	}
	
	public int checkAlike(String s1,String s2){
		int i=0,j=0;
		int count = 0;
		if(s1.length()!=s2.length())
			return 0;
		else{
			while(i<s1.length()&&j<s2.length()){
				if(s1.charAt(i)!=s2.charAt(j))
					count++;
				i++;
				j++;
			}
			if(count>2)
				return 0;
			else 
				return 1;
		}
		
	}
}
