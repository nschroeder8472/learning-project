from data_structures.arrays.max_sliding_window import max_sliding_window


def test_basic_case():
    arr = [1, 3, -1, -3, 5, 3, 6, 7]
    expected = [3, 3, 5, 5, 6, 7]
    assert max_sliding_window(arr, 3) == expected


def test_window_size_one():
    arr = [1, 2, 3, 4, 5]
    expected = [1, 2, 3, 4, 5]
    assert max_sliding_window(arr, 1) == expected


def test_window_size_equals_array_length():
    arr = [1, 3, 5, 2, 4]
    expected = [5]
    assert max_sliding_window(arr, 5) == expected


def test_decreasing_array():
    arr = [5, 4, 3, 2, 1]
    expected = [5, 4, 3]
    assert max_sliding_window(arr, 3) == expected


def test_increasing_array():
    arr = [1, 2, 3, 4, 5]
    expected = [3, 4, 5]
    assert max_sliding_window(arr, 3) == expected


def test_duplicate_values():
    arr = [1, 3, 3, 3, 5]
    expected = [3, 3, 5]
    assert max_sliding_window(arr, 3) == expected


def test_negative_numbers():
    arr = [-7, -8, -1, -5, -3]
    expected = [-1, -1, -1]
    assert max_sliding_window(arr, 3) == expected


def test_empty_array():
    arr = []
    expected = []
    assert max_sliding_window(arr, 3) == expected
