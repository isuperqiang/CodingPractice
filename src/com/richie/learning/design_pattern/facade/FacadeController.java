package com.richie.learning.design_pattern.facade;

/**
 * @author Richie on 2018.03.19
 */
public class FacadeController {
    private LightSystem lightSystem;
    private TelevisionSystem televisionSystem;
    private AirConditionSystem airConditionSystm;

    public FacadeController() {
        lightSystem = new LightSystem();
        televisionSystem = new TelevisionSystem();
        airConditionSystm = new AirConditionSystem();
    }

    public void onKeyTurnOn() {
        lightSystem.turnOn();
        televisionSystem.turnOn();
        airConditionSystm.turnOn();
    }

    public void onKeyTurnOff() {
        lightSystem.turnOff();
        televisionSystem.turnOff();
        airConditionSystm.turnOff();
    }
}
