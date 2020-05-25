/*
Chef has a string S consisting of lowercase English characters.
L(X) is defined as shifting all characters of string X one step towards left 
and moving the first character to the end.
R(X) is defined as shifting all characters of string X one step towards the 
right and moving the last character to the beginning.

Chef wants to find out whether there exists a string V of the same length as 
S such that both L(V)=S and R(V)=S holds.
 */
import java.util.*;
public class ChefandString{
    public static String L(String s){
        return (s.substring(1)+s.charAt(0));
    }
    public static String R(String s){
        return (s.charAt(s.length()-1)+s.substring(0,s.length()-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
        int t=sc.nextInt();
        String[] a=new String[t];
        for(int i=0;i<t;i++){
            String s=sc.next();
            if(s.length()==1)   a[i]="YES";
            else if(L(s).equals(R(s)))   a[i]="YES";
            else    a[i]="NO";
        }
        for(int i=0;i<t;i++)    System.out.println(a[i]);
        }
        catch(Exception e){return;}
    
    }
}
