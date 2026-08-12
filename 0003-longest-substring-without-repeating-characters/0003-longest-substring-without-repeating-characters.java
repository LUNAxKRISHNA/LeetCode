import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int result = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int end = 0; end < s.length(); end++){
            if (map1.containsKey(s.charAt(end)) && start < map1.get(s.charAt(end))+1){
                start = map1.get(s.charAt(end)) + 1;
            }
            else if (result < end-start+1) result = end - start+1;
            map1.put(s.charAt(end),end);
        }
        return (result);
    }
}