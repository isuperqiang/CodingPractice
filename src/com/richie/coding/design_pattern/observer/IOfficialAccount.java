package com.richie.coding.design_pattern.observer;

/**
 * @author Richie on 2018.03.07
 * 微信公众号, observable 被观察者
 */
public interface IOfficialAccount {
    /**
     * 订阅公众号
     *
     * @param wechatUser
     */
    void addSubscriber(IWechatUser wechatUser);

    /**
     * 取消订阅公众号
     *
     * @param wechatUser
     */
    void removeSubscriber(IWechatUser wechatUser);

    /**
     * 群发消息
     *
     * @param message
     */
    void notifyAllSubscribers(String message);
    /*
    void notifySubscribe(IOfficialAccount officialAccount);
    */
}
