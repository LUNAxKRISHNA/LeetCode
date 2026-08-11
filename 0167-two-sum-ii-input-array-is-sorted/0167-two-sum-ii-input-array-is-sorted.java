class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(hm.containsKey(numbers[i])) return new int[] {(hm.get(numbers[i]))+1,i+1};
            else{
                int r_val=target-numbers[i];
                hm.put(r_val,i);
            }
        }
        return (null);
    }
}