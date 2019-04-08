package com.richie.coding.design_pattern.composite;

/**
 * @author Richie on 2018.03.27
 */
public class Button extends View {

    public Button(int width, int height) {
        super(width, height);
    }

    @Override
    public void display() {
        System.out.println("我是按钮，宽：" + width + "，高：" + height);
    }
}
