import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] time = new int[N];
        int Y = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            time[i] = input.nextInt();
        }

      
        for (int i = 0; i < N; i++) {
            Y += ((time[i] / 30) + 1) * 10;  
        }

        
        for (int i = 0; i < N; i++) {
            M += ((time[i] / 60) + 1) * 15; 
        }

       
        if (Y == M) {
            System.out.println("Y M " + Y);
        } else if (Y < M) {
            System.out.println("Y " + Y);
        } else {
            System.out.println("M " + M);
        }

    }
}
