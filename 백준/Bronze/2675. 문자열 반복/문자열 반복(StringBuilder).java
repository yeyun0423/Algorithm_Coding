import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int T=input.nextInt();
        
        for(int i=0;i<T;i++){
            int repeat=input.nextInt();
            String S = input.next();
            StringBuilder sb= new StringBuilder();
            for(int j=0;j<S.length();j++){
                char ch=S.charAt(j);
                for(int r=0;r<repeat;r++){
                sb.append(ch);
                }
            }
            System.out.println(sb);
        }
    }
}
