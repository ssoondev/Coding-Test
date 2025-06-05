import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = num_list[0];
        int pow = (int) Math.pow(Arrays.stream(num_list).sum(), 2);

        for (int i = 1; i < num_list.length; i++) {
            multiple *= num_list[i];
        }

        if (multiple < pow) answer++;

        return answer;
    }
}