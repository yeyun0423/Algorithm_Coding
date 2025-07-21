import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        int sum=0;
        String Quiz;
        for(int i=0;i<n;i++){
            Quiz= input.next();
            for(int j=0;j<Quiz.length();j++){
                    if(Quiz.charAt(j)=='O'){
                        sum+=++count;
                     }else{
                        count=0;
                    }
             }
          System.out.println(sum);
          sum=0;
            count=0;
                
        }
    }
}





