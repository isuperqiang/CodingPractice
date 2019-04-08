package com.richie.coding.design_pattern.composite;

/**
 * @author Richie on 2018.03.27
 */
public class CompositeTest {

    public static void main(String args[]) {
        Button button = new Button(100, 200);
        TextView textView = new TextView(200, 200);
        ViewGroup viewGroup = new ViewGroup(300, 300);
        viewGroup.addView(button);
        viewGroup.addView(textView);
        viewGroup.display();
    }
}
