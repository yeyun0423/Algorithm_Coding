import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> raceMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            raceMap.put(players[i], i);
        }

        for (String calling : callings) {
            int index = raceMap.get(calling);
            if (index > 0) {
                String temp = players[index - 1];
                players[index - 1] = players[index];
                players[index] = temp;

                raceMap.put(players[index - 1], index - 1);
                raceMap.put(players[index], index);
            }
        }

        return players;  
    }
}
