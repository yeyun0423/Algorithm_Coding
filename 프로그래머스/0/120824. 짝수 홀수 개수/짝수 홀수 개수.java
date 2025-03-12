class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int [2];
        int positiveCount=0;
        int negativeCount=0;
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                positiveCount++;
            }
            else{
                negativeCount++;
            }
        }
        
       answer[0]=positiveCount;
      answer[1]=negativeCount;
        
        return answer;
    }
}