package com.wipro.java.designpattern;

import com.wipro.java.designpattern.factory.Button;
import com.wipro.java.designpattern.factory.Checkbox;
import com.wipro.java.designpattern.factory.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI() {
    	button.render();
    	checkbox.render();
    }
 }