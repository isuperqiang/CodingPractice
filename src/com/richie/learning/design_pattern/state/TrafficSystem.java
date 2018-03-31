package com.richie.learning.design_pattern.state;

/**
 * @author Richie on 2018.03.31 交通
 */
public class TrafficSystem {
    private ILightState redLight = new RedLight();
    private ILightState greenLight = new GreenLight();
    private ILightState yellowLight = new YellowLight();

    public void work() {
        double random = Math.random();
        if (random > 0.33) {
            redLight.behave();
        } else if (random > 0.67) {
            greenLight.behave();
        } else {
            yellowLight.behave();
        }
    }
}
