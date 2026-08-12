class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp=[[0]*n for _ in range(m)]
        def solve(i,j):
            if i==0 or j==0:
                return 1
            elif dp[i][j]==0:
                dp[i][j]=solve(i-1,j) + solve(i,j-1)
            return dp[i][j]
        return solve(m-1,n-1)   