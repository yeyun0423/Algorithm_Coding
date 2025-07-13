import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        String s=input.next();
        int sum=0;
        for(int i=0;i<n;i++){
           int c=s.charAt(i)-'0';
            sum+=c;
        }
        System.out.println(sum);
    }
    
}