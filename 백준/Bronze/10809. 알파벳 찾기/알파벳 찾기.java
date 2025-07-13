import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String S=input.next();
        int[] alpha=new int[26];
        
        for(int i=0;i<26;i++){
            alpha[i]=-1;
        }
        
        for(int i='a';i<='z';i++){
            for(int k=0;k<S.length();k++){
                if(alpha[i-'a']==-1 && S.charAt(k)==i){
                    alpha[i-'a']=k;
                }
            }
            
        }
       for(int i=0;i<26;i++){
              System.out.print(alpha[i]+" "); 
       }
    }
}