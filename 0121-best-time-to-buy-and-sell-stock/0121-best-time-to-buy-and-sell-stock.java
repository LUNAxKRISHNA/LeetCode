class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit = 0;
        for(int x:prices){
            if (x<min) min=x;
            if(profit < x-min) profit=x-min;
        }
        return (profit);
    }
}