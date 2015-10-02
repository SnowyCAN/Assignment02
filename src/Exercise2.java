


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tituo4996
 */
public class Exercise2 
{
    static int sumOfDigits(int n)
    {
        if(n >=0 && n <10)
            return n;
        else
            return n%10 + sumOfDigits(n/10);        
    }
    
    static int triangle(int n)
    {
        if (n==0 || n==1)
            return n;
        else
            return n +triangle(n-1);
        
    }
    
    static String binaryConvert(int n)
    {
        if (n==0 || n==1)
            return "" + n;
        else
            return binaryConvert(n/2) + n%2;
    }
    
    static String convert(int n, int b)
    {
        if (n==0||n==b)
            return "" + n;
        else if(b>10&&n==10)
            return "A";
        else if(b>10&&n==11)
            return "B";
        else if(b>10&&n==12)
            return "C";
        else if(b>10&&n==13)
            return "D";
        else if(b>10&&n==14)
            return "E";
        else if(b>10&&n==15)
            return "F";
        else
            return convert(n/b,b) + n%b;
    }
    
    public static boolean isPalindrome(String s, int length){
        if(length<=1)
            return true;
        else if(s.charAt(0)==s.charAt(s.length()-1))
            return isPalindrome(s.substring(1,s.length()-1),length-2);
        else
            return false;
    }
    
    public static int marbles(int[] bags, int max){
        if(bags.length==0)
            return 0;
        int[] leftOvers= new int[bags.length-1];
        int aBag=bags[0];
        for (int i = 0; i < leftOvers.length; i++)
            leftOvers[i]=bags[i+1];
        int with=aBag+marbles(leftOvers, max-aBag);
        int withOut=marbles(leftOvers, max);
        if(with>withOut&&with<=max)
                return with;
        else if(with<withOut&&withOut<=max)
                return withOut;
        else
            return 0;
        
    }
    
    public static void main(String[] args) {
        
    }
    
}
