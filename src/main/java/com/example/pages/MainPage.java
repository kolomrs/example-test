package com.example.pages;

import com.example.annotations.Selector;

public interface MainPage {
    @Selector(xpath = ".//*[@test-attr='input_search']")
    String textInputSearch();

    @Selector(xpath = ".//*[@test-attr='button_search']")
    String buttonSearch();
}