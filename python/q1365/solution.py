class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        times, accumulated_times = [0] * 101, [0] * 101
        for num in nums:
            times[num] += 1
        for i in range(1, 101):
            accumulated_times[i] = times[i - 1] + accumulated_times[i - 1]
        ans = [0] * len(nums)
        for i in range(len(ans)):
            ans[i] = accumulated_times[nums[i]]
        return ans


sol = Solution()
nums = [8,1,2,2,3]
res = sol.smallerNumbersThanCurrent(nums)
print(res)
