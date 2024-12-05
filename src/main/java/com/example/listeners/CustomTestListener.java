package com.example.listeners;

import com.example.annotations.TestMethodInfo;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.lang.reflect.Method;

public class CustomTestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        Method method = result.getMethod().getConstructorOrMethod().getMethod();
        if (method.isAnnotationPresent(TestMethodInfo.class)) {
            TestMethodInfo info = method.getAnnotation(TestMethodInfo.class);
            System.out.println("Priority: " + info.priority());
            System.out.println("Author: " + info.author());
            System.out.println("Last Modified: " + info.lastModified());
        }
    }
}