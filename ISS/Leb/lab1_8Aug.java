import java.io.*;
import java.util.*;
// Lab 01 - 8 Aug 2017
class GFG {
    public static void Encrypt(String s,int k){
        int n = s.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(s.charAt(i))){
                int c = (int)s.charAt(i);
		        c -= 65;
		        if( c != -33){
		            c = (c + k) % 26;
		            
		            System.out.print(Character.toString ((char) (c+65)));
		        }else{
		            System.out.print(" ");
		        }
            }else{
                int c = (int)s.charAt(i);
		        c -= 97;
		        if( c != -65){
		            c = (c + k) % 26;
		            
		            System.out.print(Character.toString ((char) (c+97)));
		        }else{
		            System.out.print(" ");
		        }
            }
		        
		}
    }
    public static void Decrypt(String s,int k){
        int n = s.length();
        for(int i=0;i<n;i++){
            int c = (int)s.charAt(i);
            if(Character.isUpperCase(s.charAt(i))){
		        c -= 65;
		        if( c != -33){
		            c = (c - k + 26) % 26;
		            System.out.print(Character.toString ((char) (c+65)));
		        }else{
		            System.out.print(" ");
		        }
            }else{
		        c -= 97;
		        if( c != -65){
		            c = (c - k + 26) % 26;
		            System.out.print(Character.toString ((char) (c+97)));
		        }else{
		            System.out.print(" ");
		        }
            }
        }
    }
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		StringBuilder sb = new StringBuilder(s.nextLine());
		
		if(k>26)
		    k = k% 26;
	  // Encrypt(sb.toString(),k);
	
		Decrypt(sb.toString(),k); 
	/*	
		for(int j=1;j<=26;j++){
		    System.out.print("Foe Key "+j+" : ");
		    Decrypt(sb.toString(),j);
		    System.out.println();
		}
	*/
	
	}
}
