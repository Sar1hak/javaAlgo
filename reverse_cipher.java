// Cipher a given message using Reverse Cipher Technique
// Here the given message is reversed so as to be converted to ciphered message
import java.io.*;
class reverse_cipher{
    String s;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void input()throws IOException{
        System.out.println("Press 1 for encoding the text"+'\n'+"Press 2 for decoding the text");
        int choice=Integer.parseInt(br.readLine());
        System.out.println("Enter the text:");
        s=br.readLine();
        if(choice==1)
            coding();
        else if(choice==2)
            coding();
        else{
            System.out.println("Invalid choice."+'\n'+"Program terminated.");
            System.exit(0);
        }    
    }
    public void coding(){
        for(int i=s.length()-1;i>=0;i--)
            System.out.print(s.charAt(i));
    }
    public static void main(String args[])throws IOException{
        reverse_cipher obj=new reverse_cipher();
        obj.input();
    }
}