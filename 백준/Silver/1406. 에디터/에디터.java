import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
         //readInt()로 받으면 개행문자가 남아 그 다음 명령어를 받을 때 오류가 남!
        //readLine()을 사용하고 싶다면 이것만 쓰는 것이 안전!
        String s = input.readLine(); 
        int n = Integer.parseInt(input.readLine()); 
        
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            left.push(s.charAt(i)); 
        }

        for (int i = 0; i < n; i++) {
            String command = input.readLine();

            if (command.charAt(0) == 'L') {
                if (!left.isEmpty()) {
                    right.push(left.pop());
                }
            } else if (command.charAt(0) == 'D') {
                if (!right.isEmpty()) {
                    left.push(right.pop());
                }
            } else if (command.charAt(0) == 'B') {
                if (!left.isEmpty()) {
                    left.pop();
                }
            } else if (command.charAt(0) == 'P') {
                char ch = command.charAt(2);
                left.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : left) {
            sb.append(ch);
        }
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.print(sb.toString());
    }
}
