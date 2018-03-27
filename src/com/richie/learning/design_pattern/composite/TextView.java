package com.richie.learning.design_pattern.composite;

/**
 * @author Richie on 2018.03.27
 */
public class TextView extends View {

    public TextView(int width, int height) {
        super(width, height);
    }

    @Override
    public void display() {
        System.out.println("我是文本域，宽：" + width + "，高：" + height);
    }
}
