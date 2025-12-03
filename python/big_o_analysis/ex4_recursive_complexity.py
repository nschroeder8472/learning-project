"""
Exercise 4: Recursive Complexity Analysis (Medium)

Analyze the time complexity of recursive algorithms. For each function,
determine its time complexity by analyzing the recurrence relation.

Tips:
- Count how many recursive calls are made
- Determine how the problem size decreases with each call
- Draw a recursion tree if helpful
- Use Master Theorem when applicable: T(n) = aT(n/b) + f(n)

Difficulty: Medium
Topics: Recursion, Recurrence Relations, Master Theorem
"""

from typing import List


def factorial(n: int) -> int:
    """Recursive 1: Simple factorial"""
    if n <= 1:
        return 1
    return n * factorial(n - 1)


def get_complexity_factorial() -> str:
    """
    Analyze factorial's time complexity.

    Hint: How many recursive calls? T(n) = T(n-1) + O(1)
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def fibonacci(n: int) -> int:
    """Recursive 2: Naive Fibonacci"""
    if n <= 1:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)


def get_complexity_fibonacci() -> str:
    """
    Analyze naive fibonacci's time complexity.

    Hint: Each call makes 2 recursive calls. Draw the tree!
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def binary_search_recursive(arr: List[int], target: int, left: int, right: int) -> int:
    """Recursive 3: Binary search (recursive version)"""
    if left > right:
        return -1
    mid = left + (right - left) // 2
    if arr[mid] == target:
        return mid
    if arr[mid] > target:
        return binary_search_recursive(arr, target, left, mid - 1)
    return binary_search_recursive(arr, target, mid + 1, right)


def get_complexity_binary_search() -> str:
    """
    Analyze recursive binary search complexity.

    Hint: How does the search space change? T(n) = T(n/2) + O(1)
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def merge_sort(arr: List[int], left: int, right: int) -> None:
    """Recursive 4: Merge sort"""
    if left < right:
        mid = left + (right - left) // 2
        merge_sort(arr, left, mid)
        merge_sort(arr, mid + 1, right)
        merge(arr, left, mid, right)


def merge(arr: List[int], left: int, mid: int, right: int) -> None:
    """Merge helper for merge sort"""
    L = arr[left:mid + 1]
    R = arr[mid + 1:right + 1]

    i = j = 0
    k = left

    while i < len(L) and j < len(R):
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    while i < len(L):
        arr[k] = L[i]
        i += 1
        k += 1

    while j < len(R):
        arr[k] = R[j]
        j += 1
        k += 1


def get_complexity_merge_sort() -> str:
    """
    Analyze merge sort complexity.

    Hint: T(n) = 2T(n/2) + O(n). Use Master Theorem!
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def tower_of_hanoi(n: int, source: str, destination: str, auxiliary: str) -> None:
    """Recursive 5: Tower of Hanoi"""
    if n == 1:
        return  # Move one disk
    tower_of_hanoi(n - 1, source, auxiliary, destination)
    # Move disk from source to destination
    tower_of_hanoi(n - 1, auxiliary, destination, source)


def get_complexity_tower_of_hanoi() -> str:
    """
    Analyze Tower of Hanoi complexity.

    Hint: Each call makes 2 recursive calls with n-1. T(n) = 2T(n-1) + O(1)
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def sum_array(arr: List[int], left: int, right: int) -> int:
    """Recursive 6: Sum of array (divide and conquer)"""
    if left == right:
        return arr[left]
    mid = left + (right - left) // 2
    return sum_array(arr, left, mid) + sum_array(arr, mid + 1, right)


def get_complexity_sum_array() -> str:
    """
    Analyze divide-and-conquer sum complexity.

    Hint: T(n) = 2T(n/2) + O(1). Compare with merge sort!
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Big O Analysis - Exercise 4: Recursive Complexity\n")

    try:
        print(f"Factorial: {get_complexity_factorial()}")
        print(f"Fibonacci (naive): {get_complexity_fibonacci()}")
        print(f"Binary Search: {get_complexity_binary_search()}")
        print(f"Merge Sort: {get_complexity_merge_sort()}")
        print(f"Tower of Hanoi: {get_complexity_tower_of_hanoi()}")
        print(f"Sum Array (D&C): {get_complexity_sum_array()}")
    except NotImplementedError:
        print("Not yet implemented!")
