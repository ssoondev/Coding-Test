import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();
        String tmp = "";

        for (int i = l; i <= r; i++) {
            tmp = String.valueOf(i);
            if (tmp.matches("^[05]+$"))
                answer.add(i);
        }

        if (answer.isEmpty())
            answer.add(-1);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}