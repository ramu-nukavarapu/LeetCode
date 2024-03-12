class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> bigList = new ArrayList<>();
        int index=0;
        for(int i=1;i<=numRows;i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1)
                    list.add(1);
                else{
                    list.add(bigList.get(index-1).get(j-1) + bigList.get(index-1).get(j));
                }
            }
            bigList.add(list);
            index++;
        }
        return bigList;
    }
}