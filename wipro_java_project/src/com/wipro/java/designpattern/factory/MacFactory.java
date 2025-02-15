package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.factory.Button;
import com.wipro.java.designpattern.factory.MacButton;
import com.wipro.java.designpattern.factory.Checkbox;
import com.wipro.java.designpattern.factory.MacCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
