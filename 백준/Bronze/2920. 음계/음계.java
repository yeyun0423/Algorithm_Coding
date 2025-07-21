import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[8];
        
        for (int i = 0; i < 8; i++) {
            num[i] = input.nextInt();
        }

        boolean asce = true;
        boolean desc = true;

        for (int i = 0; i < 7; i++) {
            if (num[i] < num[i + 1]) {
                desc = false;
            } else if (num[i] > num[i + 1]) {
                asce = false;
            }
        }

        if (asce) {
            System.out.println("ascending");
        } else if (desc) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
