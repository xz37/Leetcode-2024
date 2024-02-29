class Solution(object):
    def generateMatrix(self, n):
        """
        :type n: int
        :rtype: List[List[int]]
        """
        ans = [[0 for _ in range(n)] for _ in range(n)]
        left, right, top, bottom = 0, n - 1, 0, n - 1
        num = 1
        while left <= right and top <= bottom:
            for i in range(left, right + 1):
                ans[top][i] = num
                num += 1
            top += 1
            for i in range(top, bottom + 1):
                ans[i][right] = num
                num += 1
            right -= 1
            for i in range(right, left - 1, -1):
                ans[bottom][i] = num
                num += 1
            bottom -= 1
            for i in range(bottom, top - 1, -1):
                ans[i][left] = num
                num += 1
            left += 1
        return ans


sol = Solution()
ans = sol.generateMatrix(10)
print(ans)
