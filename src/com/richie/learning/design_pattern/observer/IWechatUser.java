package com.richie.learning.design_pattern.observer;

/**
 * @author Richie on 2018.03.07
 * 微信用户, observer 观察者
 */
public interface IWechatUser {
    /**
     * 接收到消息
     *
     * @param message
     */
    void onReceived(String message);

    /**
     * 允许用户获取内部消息
     *
     * @param officialAccount
     */
    void onReceivedCustom(IOfficialAccount officialAccount);
}
