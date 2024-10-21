class Solution {
    public int maximum69Number (int num) {
        String s_num = Integer.toString(num);
        s_num = s_num.replaceFirst("6","9");
        return Integer.parseInt(s_num);
    }
}