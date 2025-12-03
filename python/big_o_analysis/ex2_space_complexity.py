"""
Exercise 2: Space Complexity Analysis (Easy)

Analyze the space complexity of each function below. Space complexity measures
the additional memory an algorithm uses beyond the input.

Remember:
- Input size doesn't count toward space complexity
- Count auxiliary space (variables, data structures, recursion stack)
- O(1) = constant space, O(n) = linear space, etc.

Difficulty: Easy
Topics: Space Complexity, Memory Analysis
"""

from typing import List, Dict


def snippet1(arr: List[int]) -> int:
    """Snippet 1: Sum array elements"""
    total = 0
    for num in arr:
        total += num
    return total


def get_space_complexity_snippet1() -> str:
    """
    Return the space complexity of snippet1.

    Hint: How many extra variables do we use regardless of input size?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet2(arr: List[int]) -> List[int]:
    """Snippet 2: Create a copy of the list"""
    copy = []
    for num in arr:
        copy.append(num)
    return copy


def get_space_complexity_snippet2() -> str:
    """
    Return the space complexity of snippet2.

    Hint: How does the size of 'copy' relate to the input size?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet3(n: int) -> int:
    """Snippet 3: Recursive factorial"""
    if n <= 1:
        return 1
    return n * snippet3(n - 1)


def get_space_complexity_snippet3() -> str:
    """
    Return the space complexity of snippet3.

    Hint: Consider the call stack. How many recursive calls are made?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet4(n: int) -> List[List[int]]:
    """Snippet 4: Create 2D matrix"""
    matrix = []
    for i in range(n):
        row = []
        for j in range(n):
            row.append(i + j)
        matrix.append(row)
    return matrix


def get_space_complexity_snippet4() -> str:
    """
    Return the space complexity of snippet4.

    Hint: How many elements are in an n×n matrix?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet5(arr: List[int], threshold: int) -> List[int]:
    """Snippet 5: Filter array into list"""
    result = []
    for num in arr:
        if num > threshold:
            result.append(num)
    return result


def get_space_complexity_snippet5() -> str:
    """
    Return the space complexity of snippet5.

    Hint: In the worst case, how many elements might be in the result list?
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


def snippet6(n: int, memo: Dict[int, int] = None) -> int:
    """Snippet 6: Fibonacci with memoization"""
    if memo is None:
        memo = {}
    if n <= 1:
        return n
    if n in memo:
        return memo[n]

    memo[n] = snippet6(n - 1, memo) + snippet6(n - 2, memo)
    return memo[n]


def get_space_complexity_snippet6() -> str:
    """
    Return the space complexity of snippet6.

    Hint: Consider both the memo dict size and the recursion stack depth.
    """
    # TODO: Implement this
    raise NotImplementedError("Not implemented yet")


if __name__ == "__main__":
    print("Big O Analysis - Exercise 2: Space Complexity")
    print("Implement get_space_complexity functions\n")

    try:
        print(f"Snippet 1 (sum array): {get_space_complexity_snippet1()}")
        print(f"Snippet 2 (copy array): {get_space_complexity_snippet2()}")
        print(f"Snippet 3 (recursive factorial): {get_space_complexity_snippet3()}")
        print(f"Snippet 4 (2D matrix): {get_space_complexity_snippet4()}")
        print(f"Snippet 5 (filter array): {get_space_complexity_snippet5()}")
        print(f"Snippet 6 (fibonacci memoization): {get_space_complexity_snippet6()}")
    except NotImplementedError:
        print("Not yet implemented!")
