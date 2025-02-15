package com.wipro.java.designpattern.factory;

import com.wipro.java.designpattern.factory.Button;
import com.wipro.java.designpattern.factory.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
