package com.richie.coding.design_pattern.proxy;

import com.richie.coding.design_pattern.proxy.dynamic.DynamicProxyBuyer;

/**
 * @author Richie on 2018.04.01
 */
public class ProxyTest {

    public static void main(String[] args) {
        // 静态代理
        ITicketBuyer realBuyer = new RealBuyer();
        //ITicketBuyer proxyBuyer = new ProxyBuyer(realBuyer);
        //proxyBuyer.buyTicket();

        // 动态代理
        DynamicProxyBuyer dynamicProxyBuyer = new DynamicProxyBuyer(realBuyer);
        ITicketBuyer proxyBuyer = dynamicProxyBuyer.createProxy();
        proxyBuyer.buyTicket();
    }
}
