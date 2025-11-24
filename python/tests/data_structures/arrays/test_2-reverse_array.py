from data_structures.arrays.reverse_array import reverse


def test_basic_case():
    arr = [1, 2, 3, 4, 5]
    reverse(arr)
    assert arr == [5, 4, 3, 2, 1]


def test_even_length():
    arr = [1, 2, 3, 4]
    reverse(arr)
    assert arr == [4, 3, 2, 1]


def test_odd_length():
    arr = [1, 2, 3]
    reverse(arr)
    assert arr == [3, 2, 1]


def test_single_element():
    arr = [42]
    reverse(arr)
    assert arr == [42]


def test_two_elements():
    arr = [1, 2]
    reverse(arr)
    assert arr == [2, 1]


def test_empty_array():
    arr = []
    reverse(arr)
    assert arr == []
