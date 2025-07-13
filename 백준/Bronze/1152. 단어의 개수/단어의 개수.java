import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String S=input.nextLine().trim();
        int count=1;
        if(S.length()==0){
            System.out.print(0);
        }
        else{
                for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch==' '){
                count++;
            }
        }
        System.out.println(count);
        }
    
    }
}