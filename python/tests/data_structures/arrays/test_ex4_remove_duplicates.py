from data_structures.arrays.ex4_remove_duplicates import remove_duplicates


def test_basic_case():
    arr = [1, 1, 2, 2, 3, 4, 4, 5]
    new_length = remove_duplicates(arr)
    assert new_length == 5
    assert arr[:new_length] == [1, 2, 3, 4, 5]


def test_no_duplicates():
    arr = [1, 2, 3, 4, 5]
    new_length = remove_duplicates(arr)
    assert new_length == 5
    assert arr[:new_length] == [1, 2, 3, 4, 5]


def test_all_duplicates():
    arr = [5, 5, 5, 5, 5]
    new_length = remove_duplicates(arr)
    assert new_length == 1
    assert arr[:new_length] == [5]


def test_single_element():
    arr = [42]
    new_length = remove_duplicates(arr)
    assert new_length == 1


def test_empty_array():
    arr = []
    new_length = remove_duplicates(arr)
    assert new_length == 0


def test_consecutive_duplicates():
    arr = [1, 1, 1, 2, 2, 3]
    new_length = remove_duplicates(arr)
    assert new_length == 3
    assert arr[:new_length] == [1, 2, 3]
