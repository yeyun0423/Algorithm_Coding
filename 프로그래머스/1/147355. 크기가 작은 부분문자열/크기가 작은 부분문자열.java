class Solution {
    public int solution(String t, String p) {
        int num = t.length() - p.length() + 1;
        int count = 0;

        for (int i = 0; i < num; i++) {
            String sub = t.substring(i, i + p.length());

            if (Long.parseLong(sub) <= Long.parseLong(p)) {
                count++;
            }
        }
        return count; 
    }
}
