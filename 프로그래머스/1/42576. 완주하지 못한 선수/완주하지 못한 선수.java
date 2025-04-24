import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : completion) {
            map.replace(s, map.get(s) - 1);
        }

        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
}