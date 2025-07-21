import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[]num=new int[9];
        int index=0;
        for(int i=0;i<9;i++){
            num[i]=input.nextInt();
        }
          int max=num[0];
          for(int i=0;i<9;i++){
              if(max<num[i]){
                  max=num[i];
                  index=i;
              }
        }
        System.out.println(max);
         System.out.println(index+1);
    }
}