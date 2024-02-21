class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        val2index = dict()
        for i in range(len(nums)):
            if (target - nums[i]) in val2index:
                return [val2index[target - nums[i]], i]
            val2index[nums[i]] = i


sol = Solution()
res = sol.twoSum([3,3], 6)
print(res)
