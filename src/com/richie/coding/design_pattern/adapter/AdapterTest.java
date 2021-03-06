package com.richie.coding.design_pattern.adapter;

/**
 * @author Richie on 2018.03.18
 */
public class AdapterTest {

    public static void main(String[] args) {
        // 直接使用 Lightning 充电口
        ILightningInterface lightningInterface = new LightningInterface();
        lightningInterface.charge();

        // 使用转接头把 MicroUsb 接口转换为 Lightning 接口
        MicroUsbInterface microUsbInterface = new MicroUsbInterface();
        ILightningInterface interfaceAdapter = new InterfaceAdapter(microUsbInterface);
        interfaceAdapter.charge();
    }
}
