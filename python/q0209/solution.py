class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        left, right = 0, 0
        ans = len(nums) + 1
        cur_sum = nums[0]
        while left <= right < len(nums):
            if cur_sum < target:
                right += 1
                if right == len(nums):
                    break
                cur_sum += nums[right]
            else:
                ans = min(ans, right - left + 1)
                cur_sum -= nums[left]
                left += 1
        return 0 if ans == len(nums) + 1 else ans


sol = Solution()
ans = sol.minSubArrayLen(4, [1,1,1])
print(ans)
