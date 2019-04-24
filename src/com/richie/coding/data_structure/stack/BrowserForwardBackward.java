package com.richie.coding.data_structure.stack;

/**
 * @author richie on 2019.04.24
 * 模拟实现浏览器的前进、后退功能
 */
public class BrowserForwardBackward {
    private MyStackByArray<String> forwardStack = new MyStackByArray<>();
    private MyStackByArray<String> backwardStack = new MyStackByArray<>();

    public void open(String url) {
        forwardStack.push(url);
        backwardStack.clear();
        System.out.println("you open " + url);
    }

    public void forward() {
        String url = backwardStack.pop();
        forwardStack.push(url);
        System.out.println("you forward to " + forwardStack.peek());
    }

    public void backward() {
        String url = forwardStack.pop();
        backwardStack.push(url);
        System.out.println("you backward to " + forwardStack.peek());
    }

}
