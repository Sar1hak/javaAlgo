import java.util.*;

class CORUS{
    public static int newval(String s, int x){
        int count=0;
        while(x!=0){
        String str="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            s=s.substring(0,i)+s.substring(i+1);
            if(s.indexOf(c)!=-1){str=str+c;}
            --i;
        }
        count=str.length();
        s=str;
        --x;
        //System.out.println(str);
    }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        
        try{
            int t=sc.nextInt();
            ArrayList<Integer> r=new ArrayList<Integer>();
            for(int i=0;i<t;i++){
                int n=sc.nextInt();
                int q=sc.nextInt();
                String s=sc.next();
                int[] c=new int[q];
                for(int j=0;j<q;j++){
                    c[j]=sc.nextInt();
                }
                for(int j=0;j<q;j++){
                r.add(newval(s,c[j]));
                }
            }
            for(int i=0;i<r.size();i++){
                System.out.println(r.get(i));
            }
            
        }
        catch(Exception e){}
    
    }
}