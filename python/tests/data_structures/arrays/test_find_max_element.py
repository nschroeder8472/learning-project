import pytest
from data_structures.arrays.find_max_element import find_max


def test_basic_case():
    arr = [3, 7, 2, 9, 1]
    assert find_max(arr) == 9


def test_single_element():
    arr = [42]
    assert find_max(arr) == 42


def test_negative_numbers():
    arr = [-5, -2, -8, -1, -10]
    assert find_max(arr) == -1


def test_all_same_elements():
    arr = [5, 5, 5, 5]
    assert find_max(arr) == 5


def test_max_at_beginning():
    arr = [10, 5, 3, 2, 1]
    assert find_max(arr) == 10


def test_max_at_end():
    arr = [1, 2, 3, 4, 15]
    assert find_max(arr) == 15


def test_empty_list_raises_error():
    with pytest.raises(ValueError):
        find_max([])
