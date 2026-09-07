# Sliding Window

## What is Sliding Window?

**Sliding Window** is a technique used to solve problems involving **subarrays or consecutive elements** efficiently.

Instead of checking every possible subarray again and again, we maintain a **window** and move it through the array.

### Simple Idea

Imagine an array:

```text
2  1  5  1  3  2
```

If the window size `k = 3`:

```text
[2  1  5]  1  3  2
  2  1  5

  2  [1  5  1]  3  2

  2  1  [5  1  3]  2

  2  1  5  [1  3  2]
```

The window **slides from left to right**.

---

## Example: Maximum Sum of K Consecutive Elements

Given:

```text
arr = {2, 1, 5, 1, 3, 2}
k = 3
```

We need to find the maximum sum of any 3 consecutive elements.

### Step 1: Calculate the first window

```text
2 + 1 + 5 = 8
```

### Step 2: Slide the window

Remove the element going out and add the new element.

```text
Old Window = 2 + 1 + 5 = 8

Remove 2
Add 1

New Window = 8 - 2 + 1 = 7
```

Next:

```text
7 - 1 + 3 = 9
```

Next:

```text
9 - 5 + 2 = 6
```

Maximum sum is:

```text
9
```

---

## Java Code

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // Calculate the first window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum + arr[i] - arr[i - k];

            maxSum = Math.max(maxSum, windowSum);
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}
```

### Output

```text
Maximum Sum = 9
```

---

## Important Formula

The main idea of Sliding Window is:

```text
New Window = Old Window - Element Going Out + New Element
```

In Java:

```java
windowSum = windowSum + arr[i] - arr[i - k];
```

---

## Why Use Sliding Window?

Without Sliding Window, we may calculate the sum of the same elements multiple times.

Sliding Window avoids this unnecessary work.

### Time Complexity

**Brute Force:**

```text
O(n × k)
```

**Sliding Window:**

```text
O(n)
```

So Sliding Window is much more efficient for large arrays.

---

## Where is Sliding Window Used?

Sliding Window is commonly used for:

* Maximum sum of `k` consecutive elements
* Minimum sum of `k` consecutive elements
* Longest substring
* Shortest substring
* Maximum/minimum in a window
* Finding subarrays with specific conditions
* String and array problems

---

## Easy Way to Remember

Think of a **window moving over an array**.

```text
[2 1 5] 1 3 2
  ↓

2 [1 5 1] 3 2
    ↓

2 1 [5 1 3] 2
      ↓

2 1 5 [1 3 2]
```

**Sliding Window = Keep a window + remove the old element + add the new element.**
