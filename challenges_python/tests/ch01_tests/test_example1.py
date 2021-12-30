import pytest

from src.ch01_intro.example1 import string_reversal


def test_string_reversal():
    assert string_reversal("Lenchen") == "nehcneL"


def test_string_reversal_emptystring():
    """empty input generates empty output"""
    assert string_reversal("") == ""


def test_string_reversal_wrong_type():
    """empty input generates empty output"""
    with pytest.raises(TypeError):
        string_reversal(213)
