class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        int i,j;
        char Chars[]= s.toCharArray();
        for(i=0,j=1;j<Chars.length;i++,j++){
            if(map.get(Chars[i])>=map.get(Chars[j])){
                result+=map.get(Chars[i]);
            }else{
                result-=map.get(Chars[i]);
            }
        }
        result+=map.get(Chars[i]);
        return result;
    }
}
