package com.richie.learning.design_pattern.observer;

/**
 * @author Richie on 2018.03.07
 */
public class WechatObserverTest {

    public static void main(String[] args){
        OfficialAccount xdxx = new OfficialAccount("小道消息");
        IOfficialAccount rmrb = new OfficialAccount("人民日报");

        IWechatUser zs = new WechatUser("张三", xdxx);
        IWechatUser ls = new WechatUser("李四", rmrb);

        xdxx.notifyAllSubscribers("走在前沿，拥抱变化");
        rmrb.notifyAllSubscribers("热爱祖国，热爱人民");

        xdxx.setCustomMessage("特别的消息");
    }
}
