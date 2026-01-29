class Solution {
    public int lengthOfLastWord(String s) {
        String [] string = s.split(" ");
        String lastword = string[string.length-1];
        int num=lastword.length();
        return num;
    }
}
