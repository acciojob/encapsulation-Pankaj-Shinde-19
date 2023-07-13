package com.driver.test;

import com.driver.RWOnly;

public class TestCases {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        obj.setName("Jane");
        System.out.println("Name: " + obj.getName());
    }
}
