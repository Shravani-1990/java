package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.factory.Button;
import com.wipro.java.designpattern.factory.WindowsButton;
import com.wipro.java.designpattern.factory.Checkbox;
import com.wipro.java.designpattern.factory.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
