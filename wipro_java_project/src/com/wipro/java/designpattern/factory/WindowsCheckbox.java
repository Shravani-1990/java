package com.wipro.java.designpattern.factory;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("You have created WindowsCheckbox.");
    }
}