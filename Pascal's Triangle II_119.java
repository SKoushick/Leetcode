class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> n1 = new ArrayList();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> n2 = new ArrayList<>();
            n2.add(1);
            for(int j=1;j<i;j++){
                List<Integer> n3 = n1.get(i-1);
                int value = n3.get(j-1)+n3.get(j);
                n2.add(value);
            }
            if(i>0){
                n2.add(1);
            }
            n1.add(n2);
        }
        return n1.get(rowIndex);
    }
}
