"""
Exercise 3: Best, Worst, and Average Case Analysis (Medium)

For each algorithm below, determine the time complexity for:
- Best case: Most favorable input
- Worst case: Least favorable input
- Average case: Typical/random input

Return format: "O(...)" (e.g., "O(n)", "O(1)", "O(n^2)")

Difficulty: Medium
Topics: Big O Analysis, Algorithm Analysis, Case Analysis
"""

from typing import List


def linear_search(arr: List[int], target: int) -> int:
    """Linear Search: Find target in array"""
    for i, val in enumerate(arr):
        if val == target:
            return i
    return -1


def linear_search_best_case() -> str:
    """What's the best case? When is the target found fastest?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def linear_search_worst_case() -> str:
    """What's the worst case? When do we search the longest?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def linear_search_average_case() -> str:
    """On average, where might the target be in a random array?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def insertion_sort(arr: List[int]) -> None:
    """Insertion Sort: Sort array by inserting elements in correct position"""
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key


def insertion_sort_best_case() -> str:
    """When does insertion sort perform best? (Hint: what if array is already sorted?)"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def insertion_sort_worst_case() -> str:
    """When does insertion sort perform worst? (Hint: reverse sorted?)"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def insertion_sort_average_case() -> str:
    """What's the average case for random data?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def quick_sort(arr: List[int], low: int, high: int) -> None:
    """Quick Sort: Divide and conquer sorting"""
    if low < high:
        pivot_index = partition(arr, low, high)
        quick_sort(arr, low, pivot_index - 1)
        quick_sort(arr, pivot_index + 1, high)


def partition(arr: List[int], low: int, high: int) -> int:
    """Partition helper for quick sort"""
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1


def quick_sort_best_case() -> str:
    """When does quicksort perform best? (Hint: balanced partitions)"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def quick_sort_worst_case() -> str:
    """When does quicksort perform worst? (Hint: unbalanced partitions)"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def quick_sort_average_case() -> str:
    """What's the average case complexity?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def binary_search(arr: List[int], target: int) -> int:
    """Binary Search: Find target in sorted array"""
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


def binary_search_best_case() -> str:
    """Best case for binary search?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def binary_search_worst_case() -> str:
    """Worst case for binary search?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def binary_search_average_case() -> str:
    """Average case for binary search?"""
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Big O Analysis - Exercise 3: Best/Worst/Average Cases\n")

    print("Linear Search:")
    try:
        print(f"  Best: {linear_search_best_case()}")
        print(f"  Worst: {linear_search_worst_case()}")
        print(f"  Average: {linear_search_average_case()}")
    except NotImplementedError:
        print("  Not yet implemented!")

    print("\nInsertion Sort:")
    try:
        print(f"  Best: {insertion_sort_best_case()}")
        print(f"  Worst: {insertion_sort_worst_case()}")
        print(f"  Average: {insertion_sort_average_case()}")
    except NotImplementedError:
        print("  Not yet implemented!")

    print("\nQuick Sort:")
    try:
        print(f"  Best: {quick_sort_best_case()}")
        print(f"  Worst: {quick_sort_worst_case()}")
        print(f"  Average: {quick_sort_average_case()}")
    except NotImplementedError:
        print("  Not yet implemented!")

    print("\nBinary Search:")
    try:
        print(f"  Best: {binary_search_best_case()}")
        print(f"  Worst: {binary_search_worst_case()}")
        print(f"  Average: {binary_search_average_case()}")
    except NotImplementedError:
        print("  Not yet implemented!")
