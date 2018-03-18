package com.richie.learning.design_pattern.adapter;

/**
 * @author Richie on 2018.03.18
 * 适配器
 */
public class InterfaceAdapter implements ILightningInterface {
    private MicroUsbInterface microUsbInterface;

    public InterfaceAdapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void charge() {
        microUsbInterface.charge();
    }
}
