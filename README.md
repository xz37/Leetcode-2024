# Leetcode-2024
## Array
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


- 0724 - [寻找数组的中心下标](https://leetcode.cn/problems/find-pivot-index/description/) - [java](java/src/q0724/Solution.java)


- 0922 - [按奇偶排序数组 II](https://leetcode.cn/problems/sort-array-by-parity-ii/description/) - [java](java/src/q0922/Solution.java)

  新建数组，比遍历原数组元素，放到新数组对应位置


- 0035 - [搜索插入位置](https://leetcode.cn/problems/search-insert-position/description/) - [java](java/src/q0035/Solution.java)

  要寻找第一个大于等于target的元素
  
  修改二分法的部分：初始化ans的值为数组长度n，因为mid遍历不到n；合并target小于等于的情况


- q0289 - [轮转数组](https://leetcode.cn/problems/rotate-array/description/) - [java](java/src/q0189/Solution.java)

  只用空间O1比较难：比较巧的思路是把整个数组翻转后在分别翻转


## linkedList

**🌟链表类大概率用双指针**


- 0203 - [移除链表元素](https://leetcode.cn/problems/remove-linked-list-elements/description/) - [java](java/src/q0203/Solution.java)


- 0707 - [设计链表](https://leetcode.cn/problems/design-linked-list/description/) - [java](java/src/q0707/MyLinkedList.java)


- 0206 - [反转链表](https://leetcode.cn/problems/reverse-linked-list/description/) - [java](java/src/q0206/Solution.java)

  1. 最直接的思路：while循环迭代，外面先标记当前指针cur和它的前一个pre，while里先记住cur的next节点，再把cur的next指针掰向pre，最后更新pre为现在cur、cur为原来的next节点
  2. 抽象一些的递归：想象reverseList已经实现，此时如果拿掉head，对剩下的链表操作reverseList，则返回的newHead就是期望的头节点，此时再把原来的head放在链表结尾（通过head.next.next）+更新head的next，就完成了


- 0024 - [两两交换链表中的节点](https://leetcode.cn/problems/swap-nodes-in-pairs/description/) - [java](java/src/q0024/Solution.java)

  用和0206非常相似的递归


- 0141 - [环形链表](https://leetcode.cn/problems/linked-list-cycle/description/) - [java](java/src/q0141/Solution.java)

  `a.equals(b)` 用来比较两个引用所指向的 object 的 value 是否一样
  
  `a == b` 用来比较两个引用是否指向同一个东西

  ```java
  String str1 = new String('Hello');
  String str2 = new String('Hello');
  System.out.println(str1 == str2);         // false
  System.out.println(str1.equals(str2));    // true
  ```


- 0242 - [有效的字母异位词](https://leetcode.cn/problems/valid-anagram/description/) - [java](java/src/q0242/Solution.java)


- 1002 - [查找常用字符](https://leetcode.cn/problems/find-common-characters/description/) - [java](java/src/q1002/Solution.java)

  ```java
  // int -> char
  int a = 52;
  char ch = (char)a;
  // char -> String
  String str = String.valueOf(ch);
  ```


- q0202 - [快乐数](https://leetcode.cn/problems/happy-number/description/) - [java](java/src/q0202/Solution.java)

  - S1：题目暗示最后都是个循环，要么循环1，要么循环一个环，用快慢指针得到循环的那个元素，判断是不是1
  - S2：用HashSet装着出现过的元素


- q0160 - [链表相交](https://leetcode.cn/problems/intersection-of-two-linked-lists/description/) - [java](java/src/q0160/Solution.java)

  先走遍我的路，再走遍你的路，如果我们的路相交，我们会在交点相遇，否则，我们的终点都是null


- q0349 - [两个数组的交集](https://leetcode.cn/problems/intersection-of-two-arrays/description/) - [java](java/src/q0349/Solution.java)


- q0001 - [两数之和](https://leetcode.cn/problems/two-sum/description/) - [java](java/src/q0001/Solution.java)


- q0019 - [删除链表的倒数第N个节点](https://leetcode.cn/problems/remove-nth-node-from-end-of-list/description/) - [java](java/src/q0019/Solution.java)

  只扫描一次的思路：快慢指针


- q0142 - [环形链表II](https://leetcode.cn/problems/linked-list-cycle-ii/description/) - [java](java/src/q0142/Solution.java)

  q0141的环形链表只要判断是不是环，这个再多问一个环的入口在哪

  快慢指针在这里应用的原理是，一倍速的慢指针走过的长度正好是环的长度，因为：
  - 二倍速的快指针和一倍速慢指针如果相遇，一定是在环里相遇
  - 快慢指针相遇的时候，快指针一定比慢指针正好多走了一个环（想象跑步套圈的情况）
  - 所以快指针和慢指针的走过的长度差就是环的长度
  - 快指针和慢指针的走过的长度差 = 慢指针走过的长度
  
  最后再用q0019的思路得到入口


## String


- 0344 - [反转字符串](https://leetcode.cn/problems/reverse-string/description/) - [java](java/src/q0344/Solution.java)


- 0541 - [反转字符串II](https://leetcode.cn/problems/reverse-string-ii/description/) - [java](java/src/q0541/Solution.java)


- LCR122 - [替换空格](https://leetcode.cn/problems/ti-huan-kong-ge-lcof/description/) - [java](java/src/qLCR122/Solution.java)


- 0151 - [翻转字符串里的单词](https://leetcode.cn/problems/reverse-words-in-a-string/description/) - [java](java/src/q0151/Solution.java)

  - Java中 `StringBuilder`/`StringBuffer`的基本用法：
    ```java
    StringBuilder sb = new StringBuilder();
    sb.append("1");
    sb.insert(0, "z");
    ```
  - 正则
    ```java
    String[] ss = s.split("\\s+"); // 按照空格分割
    ```
    `\s` 匹配一个空格，`\s+` 匹配一个或更多空格


- LCR182 - [动态口令](https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/description/) - [java](java/src/qLCR182/Solution.java)


- 0925 - [长按键入](https://leetcode.cn/problems/long-pressed-name/description/) - [java](java/src/q0925/Solution.java)
  
  两个指针分别指向name和typed，三种情况：指向的char一样/不一样但是长按/不一样且不是长按