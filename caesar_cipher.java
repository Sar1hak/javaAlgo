// Cipher a given message using Caesar Cipher Technique.
// Cipher technique deals with shifting of the alphabetical order 
// for cipher/decipher the code.

import java.util.*;
import java.io.*;
public class caesar_cipher{
    String s;
    int key,n;
    char r,x;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void choice()throws IOException{
        System.out.println("Enter 1 for Encoding."+'\n'+"Enter 2 for Decoding");
        n=Integer.parseInt(br.readLine());
        if(n==1){
            input();
            encode();
            System.out.println();
        }
        else if(n==2){
            input();
            if(x==1)
                decode();
            else{
                for(key=1;key<=26;key++){
                decode();
                System.out.println();
                }
            }    
        }
        else{
            System.out.println("Invalid Option."+'\n'+"Program terminated.");
            System.exit(0);
        }
    }
    public void input()throws IOException{
        System.out.println("Enter the text:");
        s=br.readLine();
        if(n==2){
            System.out.println("Do you want to use brute force, enter Y/N");
            x=(char)br.read();
            if(x=='N'){
                System.out.println("Enter the key:"); 
                key=Integer.parseInt(br.readLine());
            }
        }
        else{
             System.out.println("Enter the key:"); 
             key=Integer.parseInt(br.readLine());
        }
        while(key>26){
            key=key-26;
        }
    }
    public void encode(){
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int a=(int)c+key;
            if((int)c<=90&&(int)c>=65){
                if(a>90){
                    a=a-26;
                }
            }
            else if((int)c<=122&&(int)c>=97){
                if(a>122){
                    a=a-26;
                }
            }
            else if((int)c>=48&&(int)c<=57){
                if(a>57){
                    do{
                    a=a-9;
                }while(a>57);                    
                }
            }
            else
                
            a=(int)c;
            r=(char)a;
            System.out.print(r);
        }
    }
    public void decode(){
         for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int a=(int)c-key;
            if((int)c<=90&&(int)c>=65){
                if(a<65){
                    a=a+26;
                }
            }
            else if((int)c<=122&&(int)c>=97){
                if(a<97){
                    a=a+26;
                }
            }
            else if((int)c>=48&&(int)c<=57){
                if(a<48){
                   do{
                       a=a+9;
                    }while(a<48);
                }
            }
            else
                a=(int)c;
            r=(char)a;
            System.out.print(r);
        }
    }
    public static void main(String args[])throws IOException{
        caesar_cipher obj=new caesar_cipher();
        obj.choice();
    } 
}