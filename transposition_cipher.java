// Encoding a given message using Transposition Cipher Technique.
// A key should be provided by the user to so as to cipher/decipher
// the input message.
import java.io.*;
class transposition_cipher{
    String s,a[][];
    int key;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void input()throws IOException{
        System.out.println("Enter 1 for encoding"+'\n'+"Enter 2 for decoding");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the text:");
        s=br.readLine();
        System.out.println("Enter the key");
        key=Integer.parseInt(br.readLine());
        if(n==1)
            encode();
        else if(n==2)
            decode();
        else
            System.exit(0);
    }
    public void encode(){
        int x=0;
        if(s.length()%key==0)
            x=s.length()/key;
        else
            x=(s.length()/key)+1;
        a=new String[x][key];
        int r=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<key;j++){
                char c=s.charAt(r);
                a[i][j]=c+"";
                ++r;
                if(r>=s.length())
                    break;
            }
        }
        if(s.length()%key!=0){
            int t=s.length()%key;
            while(t<key){
            a[x-1][t]="-999";
            ++t;
           }
        }
        for(int i=0;i<key;i++){
             for(int j=0;j<x;j++){
                 System.out.print(a[j][i]);
                 if((j+1)<x){
                     if(a[j+1][i].equals("-999")){
                         break;
                     }   
                 }
             }
        }
    }
    public void decode(){
        int x=0;
        if(s.length()%key==0)
            x=s.length()/key;
        else
            x=(s.length()/key)+1;
        a=new String[x][key];
        int r=0;
        for(int i=0;i<key;i++){
            for(int j=0;j<x;j++){
                char c=s.charAt(r);
                a[i][j]=c+"";
                ++r;
                if(r>=s.length())
                    break;
            }
        }
         if(s.length()%key!=0){
            int t=s.length()%key;
            while(t<key){
            a[t][x-1]="-999";
            ++t;
           }
        }
        for(int i=0;i<x;i++){
             for(int j=0;j<key;j++){
                 System.out.print(a[j][i]);
                 if((j+1)<x){
                     if(a[j+1][i].equals("-999")){
                         break;
                     }   
                 }
             }
        }
    }
    public static void main(String args[])throws IOException{
        transposition_cipher obj=new transposition_cipher();
        obj.input();
    }
}