class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character>  s1 = new HashSet<>();
        int left=0,right=0,max=0; 
        while(right<s.length()){
            char current = s.charAt(right);
            if(!s1.contains(current)){
                max=Math.max(max,right-left+1);
                s1.add(current);
                right++;
            }
            else{
                s1.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}