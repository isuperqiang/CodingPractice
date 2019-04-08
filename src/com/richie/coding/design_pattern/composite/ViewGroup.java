package com.richie.coding.design_pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Richie on 2018.03.27
 */
public class ViewGroup extends View {
    private List<View> viewList;

    public ViewGroup(int width, int height) {
        super(width, height);
        viewList = new ArrayList<>();
    }

    @Override
    public void display() {
        System.out.println("我是容器，宽：" + width + "，高：" + height + "，里面有" + viewList.size() + "个子视图");
        for (View view : viewList) {
            view.display();
        }
    }

    public void addView(View view) {
        viewList.add(view);
    }

    public void removeView(View view) {
        viewList.remove(view);
    }
}
