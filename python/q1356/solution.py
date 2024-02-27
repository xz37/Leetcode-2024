import functools


class Solution(object):
    def sortByBits(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        ans = sorted(arr, key=functools.cmp_to_key(self.compare))
        return ans

    def compare(self, num1, num2):
        num1_bit = self.getBit(num1)
        num2_bit = self.getBit(num2)
        return num1 - num2 if num1_bit == num2_bit else num1_bit - num2_bit

    def getBit(self, num):
        bit = 0
        while num > 0:
            bit += (num & 1)
            num >>= 1
        return bit


sol = Solution()
arr = [1024,512,256,128,64,32,16,8,4,2,1]
ans = sol.sortByBits(arr)
print(ans)
