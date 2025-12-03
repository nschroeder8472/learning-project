"""
Exercise 1: Identify Time Complexity (Easy)

For each function below, identify its time complexity in Big O notation.
Implement the get_complexity() functions to return the correct complexity as a string.

Examples of valid return values: "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(n^2)", "O(2^n)"

Difficulty: Easy
Topics: Big O Analysis, Algorithm Analysis
"""

from typing import List


def snippet1(arr: List[int], index: int) -> int:
    """Snippet 1: Simple array access"""
    return arr[index]


def get_complexity_snippet1() -> str:
    """
    Return the time complexity of snippet1.

    Hint: How does the operation change when array size increases?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet2(arr: List[int], target: int) -> int:
    """Snippet 2: Linear search"""
    for i, val in enumerate(arr):
        if val == target:
            return i
    return -1


def get_complexity_snippet2() -> str:
    """
    Return the time complexity of snippet2.

    Hint: How many elements might we need to check in the worst case?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet3(arr: List[int], target: int) -> int:
    """Snippet 3: Binary search (assume arr is sorted)"""
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == target:
            return mid
        if arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1


def get_complexity_snippet3() -> str:
    """
    Return the time complexity of snippet3.

    Hint: How does the search space change with each iteration?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet4(arr: List[int]) -> None:
    """Snippet 4: Nested loops - print all pairs"""
    for i in range(len(arr)):
        for j in range(len(arr)):
            print(f"{arr[i]}, {arr[j]}")


def get_complexity_snippet4() -> str:
    """
    Return the time complexity of snippet4.

    Hint: How many times does the print statement execute?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet5(arr1: List[int], arr2: List[int]) -> None:
    """Snippet 5: Two separate loops"""
    for val in arr1:
        print(val)
    for val in arr2:
        print(val)


def get_complexity_snippet5() -> str:
    """
    Return the time complexity of snippet5.

    Hint: The loops are independent. For this exercise, assume both arrays have size n.
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet6(arr: List[int]) -> bool:
    """Snippet 6: Finding duplicates with nested loops"""
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] == arr[j]:
                return True
    return False


def get_complexity_snippet6() -> str:
    """
    Return the time complexity of snippet6.

    Hint: Even though j starts at i+1, this is still a nested loop pattern.
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Big O Analysis - Exercise 1")
    print("Implement get_complexity functions to identify time complexities\n")

    try:
        print(f"Snippet 1 (array access): {get_complexity_snippet1()}")
        print(f"Snippet 2 (linear search): {get_complexity_snippet2()}")
        print(f"Snippet 3 (binary search): {get_complexity_snippet3()}")
        print(f"Snippet 4 (nested loops): {get_complexity_snippet4()}")
        print(f"Snippet 5 (two loops): {get_complexity_snippet5()}")
        print(f"Snippet 6 (find duplicates): {get_complexity_snippet6()}")
    except NotImplementedError:
        print("Not yet implemented!")
