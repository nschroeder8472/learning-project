from data_structures.arrays.ex5_trapping_rain_water import trap


def test_basic_case():
    height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    assert trap(height) == 6


def test_no_water_trapped():
    height = [1, 2, 3, 4, 5]
    assert trap(height) == 0


def test_simple_case():
    height = [3, 0, 2, 0, 4]
    assert trap(height) == 7


def test_two_barriers():
    height = [4, 0, 0, 0, 4]
    assert trap(height) == 12


def test_empty_array():
    height = []
    assert trap(height) == 0


def test_single_element():
    height = [5]
    assert trap(height) == 0


def test_two_elements():
    height = [3, 2]
    assert trap(height) == 0


def test_descending_then_ascending():
    height = [5, 2, 1, 2, 1, 5]
    assert trap(height) == 14
