package com.driver;

public class Main {
    public static void main(String args[]) {
        RWOnly obj = new RWOnly();

        // Directly accessing the private member variable will result in an error
        // obj.name = "John"; // Error: The field RWOnly.name is not visible

        // Using the setter function to set the value of the name
        obj.set_name("John");

        // Using the getter function to access the value of the name
        System.out.println("Name: " + obj.get_name());
    }
}