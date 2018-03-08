package com.richie.learning.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Richie on 2018.03.07
 * 具体的微信公众号
 */
public class OfficialAccount implements IOfficialAccount {

    private String name;
    private List<IWechatUser> wechatUsers;
    private String customMessage;

    public OfficialAccount(String name) {
        this.name = name;
        wechatUsers = new ArrayList<>();
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
        for (IWechatUser wechatUser : wechatUsers) {
            wechatUser.onReceivedCustom(this);
        }
    }

    public String getCustomMessage() {
        return customMessage;
    }

    @Override
    public void addSubscriber(IWechatUser wechatUser) {
        if (!wechatUsers.contains(wechatUser)) {
            wechatUsers.add(wechatUser);
        }
    }

    @Override
    public void removeSubscriber(IWechatUser wechatUser) {
        wechatUsers.remove(wechatUser);
    }

    @Override
    public void notifyAllSubscribers(String message) {
        for (IWechatUser wechatUser : wechatUsers) {
            wechatUser.onReceived(this.name + " - " + message);
        }
    }
}
