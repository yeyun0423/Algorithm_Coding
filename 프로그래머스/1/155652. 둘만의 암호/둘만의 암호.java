import java.util.Set;
import java.util.HashSet;

class Solution {
    public String solution(String s, String skip, int index) {
    HashSet<Character> skipSet=new HashSet<>();
        for(char c:skip.toCharArray()){
            skipSet.add(c);
        }
        
        StringBuilder result=new StringBuilder(s);
        
        for(int i=0;i<result.length();i++){
             char ch=result.charAt(i);
            int count=0;
            
            while(count<index){
                ch++;
                if(ch>'z'){
                    ch='a';
                }
                if(!skipSet.contains(ch)){
                    count++;
                }
            }
            result.setCharAt(i,ch);
        }
       
       
        return result.toString();
    }
}
