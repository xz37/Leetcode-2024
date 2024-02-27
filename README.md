# Leetcode-2024
## array
- 0704 - [二分查找](https://leetcode.cn/problems/binary-search/description/) - [solution](./q0704/solution.py)
    
  左右区间，边界小于等于


- 0027 - [移除元素](https://leetcode.cn/problems/remove-element/description/) - [solution](./q0027/solution.py)

  双指针：用一个额外指针标记累积的非目标元素位置


- 0977 - [有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/description/) - [solution](./q0977/solution.py)

  利用递增的信息，两个指针指向两边，要再来一个位置指针控制res数组


- 0209 - [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/description/) - [solution](./q0209/solution.py)

  用两个指针滑动窗口：如果当前窗口的sum>=target，更新长度，右移left，更新sum；否则右移right，更新sum


- 0059 - [螺旋矩阵II](https://leetcode.cn/problems/spiral-matrix-ii/description/) - [solution](./q0059/solution.py)

  一个while里面4个for，for的关键是控制好4个边界


## array2
- 1356 - [根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/description/) - [solution](./q1356/solution.py)

  - python自定义比较函数的写法
    ```python 
    def compare(num1, num2):
        return num1 - num2
    ans = sorted(some_array, key=functools.cmp_to_key(compare))
    ```
  - 获得一个数字的二进制下 1 的个数
    
      `>>`: 二进制表示下左移
  
      `&`：与运算，同时为1才取1，否则0

- 1365 - [有多少小于当前数字的数字](https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/description/) - [solution](./q1365/solution.py)
  
  构建2个array，一个存0-100数字的出现个数，一个存0-101中比当前数字小的数字出现个数

- 0941 - [有效的山脉数组](https://leetcode.cn/problems/valid-mountain-array/description/) - [solution](./q0941/solution.py)

  用2个while，第一个while找到山顶，第二个while找到山脚，判断山顶山脚的位置是否合理