import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        double[]score=new double[N];
        double sum=0.0;
        for(int i=0;i<N;i++){
            score[i]=input.nextInt();
        }
        double M=score[0];
        for(int i=0;i<N;i++){
               if(M<score[i]){
                   M=score[i];
               }
        }
         for(int i=0;i<N;i++){
         score[i]=(double)score[i]/M*100;
             sum+= score[i];
        }
        System.out.println(sum/N);
        
    }
}