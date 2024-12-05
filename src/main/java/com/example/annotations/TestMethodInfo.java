package com.example.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;

@Retention(RetentionPolicy.RUNTIME)
@Target(METHOD)
public @interface TestMethodInfo {
    Priority priority() default Priority.Major;
    String author() default "Bill Gates";
    String lastModified() default "01.01.2019";
}