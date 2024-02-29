class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        res = 0
        for i in range(len(nums)):
            print('-------------------time %d: ' % i)
            print('before: ', nums)
            if nums[i] != val:
                self.swap(nums, i, res)
                res += 1
            print('after:  ', nums)
        return res

    def swap(self, nums, a, b):
        tmp = nums[a]
        nums[a] = nums[b]
        nums[b] = tmp


sol = Solution()
ans = sol.removeElement([0,1,677,677,3,0,4,677], 677)
print(ans)
