import java.util.Scanner;
 public class Solution{
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        int testCases = reader.nextInt();
        while(testCases>0){
            String s = reader.next();
            System.out.println(numberOfSteps(s));
            testCases--;
        }
    }
    
    static boolean isPalindrome(String str){
        int length = str.length();
        int mid = length/2,i=0;
        int var = length-1;
        while(mid>0){
            if(str.charAt(i)==str.charAt(var)){
                i++;
                var--;
                mid--;
            }
            else
                return false;
        }
        
        return true;
    }
    
    static int numberOfSteps(String str){
        int length = str.length();
        int var = length-1;
        int mid = (str.length())/2;
        int steps = 0,i=0;
        if(isPalindrome(str))
            return steps;
        else{
            while(mid>0){
                        int incre = ((int)str.charAt(var)-(int)str.charAt(i));
                        int incr = Math.abs(incre);
                        steps = steps + incr;
                        i++;
                        var--;
                        mid--;

            }
            
            return steps;
        }
    }
}