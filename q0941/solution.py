class Solution(object):
    def validMountainArray(self, arr):
        """
        :type arr: List[int]
        :rtype: bool
        # """
        cur_index = 0
        while cur_index + 1 < len(arr) and arr[cur_index] < arr[cur_index + 1]:
            cur_index += 1
        if cur_index == 0 or cur_index + 1 == len(arr):
            return False
        while cur_index + 1 < len(arr) and arr[cur_index] > arr[cur_index + 1]:
            cur_index += 1
        return cur_index + 1 == len(arr)


sol = Solution()
arr = [1,2,3,2,1]
ans = sol.validMountainArray(arr)
print(ans)
