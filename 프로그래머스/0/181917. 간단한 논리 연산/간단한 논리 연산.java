class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean cal1 = x1 != x2 || x1;
        boolean cal2 = x3 != x4 || x3;

        return cal1 == cal2 && cal1;
    }
}