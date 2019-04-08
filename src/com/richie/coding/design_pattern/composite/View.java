package com.richie.coding.design_pattern.composite;

/**
 * @author Richie on 2018.03.27
 */
public abstract class View {
    protected int width;
    protected int height;

    public View(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract void display();
}
