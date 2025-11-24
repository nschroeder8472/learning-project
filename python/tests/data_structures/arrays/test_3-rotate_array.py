from data_structures.arrays.rotate_array import rotate


def test_basic_rotation():
    arr = [1, 2, 3, 4, 5, 6, 7]
    rotate(arr, 3)
    assert arr == [5, 6, 7, 1, 2, 3, 4]


def test_rotate_by_zero():
    arr = [1, 2, 3, 4, 5]
    rotate(arr, 0)
    assert arr == [1, 2, 3, 4, 5]


def test_rotate_by_length():
    arr = [1, 2, 3, 4, 5]
    rotate(arr, 5)
    assert arr == [1, 2, 3, 4, 5]


def test_rotate_by_more_than_length():
    arr = [1, 2, 3, 4, 5]
    rotate(arr, 7)  # 7 % 5 = 2
    assert arr == [4, 5, 1, 2, 3]


def test_rotate_by_one():
    arr = [1, 2, 3, 4, 5]
    rotate(arr, 1)
    assert arr == [5, 1, 2, 3, 4]


def test_single_element():
    arr = [42]
    rotate(arr, 3)
    assert arr == [42]


def test_empty_array():
    arr = []
    rotate(arr, 3)
    assert arr == []
