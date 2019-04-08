package com.richie.coding.design_pattern.adapter;

/**
 * @author Richie on 2018.03.18
 * Lightning 接口
 */
public class LightningInterface implements ILightningInterface {

    @Override
    public void charge() {
        System.out.println("charge with Lightning");
    }
}
