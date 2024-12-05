package com.example.tests;

import com.example.pages.MainPage;
import com.example.utils.DynamicProxyFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MethodInterceptionTest {
    @Test
    public void annotationValue() {
        MainPage mainPage = DynamicProxyFactory.createPage(MainPage.class);
        assertNotNull(mainPage);
        assertEquals(mainPage.buttonSearch(), ".//*[@test-attr='button_search']");
        assertEquals(mainPage.textInputSearch(), ".//*[@test-attr='input_search']");
    }
}