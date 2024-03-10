# Leetcode-2024
## array
- 0704 - [二分查找](https://leetcode.cn/problems/binary-search/description/) - [python](python/q0704/solution.py) - [java](java/src/q0704/Solution.java)
    
  左右区间，边界小于等于


- 0027 - [移除元素](https://leetcode.cn/problems/remove-element/description/) - [python](python/q0027/solution.py) - [java](java/src/q0027/Solution.java)

  双指针：left指针从前往后，right指针从后往前。left的元素如果是val，把right的元素赋给left位置，right左移；否则left右移


- 0977 - [有序数组的平方](https://leetcode.cn/problems/squares-of-a-sorted-array/description/) - [python](python/q0977/solution.py) - [java](java/src/q0977/Solution.java)

  利用递增的信息，两个指针指向两边，要再来一个位置指针控制res数组


- 0209 - [长度最小的子数组](https://leetcode.cn/problems/minimum-size-subarray-sum/description/) - [python](python/q0209/solution.py) - [java](java/src/q0209/Solution.java)

  用两个指针滑动窗口：如果当前窗口的sum>=target，更新长度，右移left，更新sum；否则右移right，更新sum


- 0059 - [螺旋矩阵II](https://leetcode.cn/problems/spiral-matrix-ii/description/) - [python](python/q0059/solution.py) - [java](java/src/q0059/Solution.java)

  一个while里面4个for，for的关键是控制好4个边界


## array2
- 1356 - [根据数字二进制下 1 的数目排序](https://leetcode.cn/problems/sort-integers-by-the-number-of-1-bits/description/) - [python](python/q1356/solution.py) - [java](java/src/q1356/Solution.java)

  - java 
    - `Integer[]` 转 `int[]`
      ```java
      Integer[] arr1 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
      ```
    - `int[]` 转 `Integer[]`
      ```java
      int[] arr2 = Arrays.stream(arr1).mapToInt(i -> i).toArray();
      ```
    - 自定义比较函数的写法
      ```java
      Arrays.sort(arr, (o1, o2) -> {
          return o2 - o1;
      });
      ```
  - python 自定义比较函数的写法
    ```python 
    def compare(num1, num2):
        return num1 - num2
    ans = sorted(some_array, key=functools.cmp_to_key(compare))
    ```
  - 获得一个数字的二进制下 1 的个数
    
      `>>`: 二进制表示下左移
  
      `&`：与运算，同时为1才取1，否则0


- 1365 - [有多少小于当前数字的数字](https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/description/) - [python](python/q1365/solution.py) - [java](java/src/q1365/Solution.java)
  
  用一个array用来存当前indx出现次数


- 0941 - [有效的山脉数组](https://leetcode.cn/problems/valid-mountain-array/description/) - [python](python/q0941/solution.py) - [java](java/src/q0941/Solution.java)

  用2个while，第一个while找到山顶，第二个while找到山脚，判断山顶山脚的位置是否合理


- 1207 - [独一无二的出现次数](https://leetcode.cn/problems/unique-number-of-occurrences/description/) - [java](java/src/q1207/Solution.java)
  - java初始化`hashmap`和`hashset`
    ```java
    Map<Integer, Integer> map = new HashMap<>();
    Set<Integer> occurred = new HashSet<>();
    ```

- 0283 - [移动零](https://leetcode.cn/problems/move-zeroes/description/) - [java](java/src/q0283/Solution.java)

  一次遍历：快指针指向遍历的数，慢指针指向整理后最后一个非零的数


## linkedList


- 0203 - [移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/description/) - [java](java/src/q0203/Solution.java)


- 0707 - [设计链表](https://leetcode.cn/problems/design-linked-list/description/) - [java](java/src/q0707/MyLinkedList.java)


- 0206 - [反转链表](https://leetcode.cn/problems/reverse-linked-list/description/) - [java](java/src/q0206/Solution.java)

  1. 最直接的思路：while循环迭代，外面先标记当前指针cur和它的前一个pre，while里先记住cur的next节点，再把cur的next指针掰向pre，最后更新pre为现在cur、cur为原来的next节点
  2. 抽象一些的递归：想象reverseList已经实现，此时如果拿掉head，对剩下的链表操作reverseList，则返回的newHead就是期望的头节点，此时再把原来的head放在链表结尾（通过head.next.next）+更新head的next，就完成了


- 0024 - [两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/description/) - [java](java/src/q0024/Solution.java)

  用和0206非常相似的递归
