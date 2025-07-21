import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int K=input.nextInt();
         int [] d =new int[N];
           int index=0;
        
        for(int i=1;i<=N;i++){
            if(N%i==0){
                d[index]=i;
                index++;
            } 
        }
             if (K <= index) {
            System.out.println(d[K - 1]); 
        } else {
            System.out.println(0);
        }
      
    }
}