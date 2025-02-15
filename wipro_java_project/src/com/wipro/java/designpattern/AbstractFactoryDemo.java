package com.wipro.java.designpattern;

import com.wipro.java.designpattern.factory.*;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory;

        // Simulating ostype selection
        String osType = "Windows"; // Change to "Mac" for Mac UI
        if (osType.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}