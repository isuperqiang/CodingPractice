package com.richie.coding.design_pattern.observer;

/**
 * @author Richie on 2018.03.07
 * 具体的微信用户
 */
public class WechatUser implements IWechatUser {

    private String name;

    public WechatUser(String name, IOfficialAccount officialAccount) {
        this.name = name;
        officialAccount.addSubscriber(this);
    }

    @Override
    public void onReceived(String message) {
        System.out.println(this.name + " 收到: " + message);
    }

    @Override
    public void onReceivedCustom(IOfficialAccount officialAccount) {
        if (officialAccount instanceof OfficialAccount) {
            System.out.println(this.name + " 取到: " + ((OfficialAccount) officialAccount).getCustomMessage());
        }
    }

}
