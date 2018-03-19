package com.richie.learning.design_pattern.facade;

/**
 * @author Richie on 2018.03.19
 */
public class FacadeTest {

    public static void main(String[] args) {
        System.out.println("-------- Turn on ----------");
        FacadeController facadeController = new FacadeController();
        facadeController.onKeyTurnOn();

        System.out.println("-------- Turn off ----------");
        facadeController.onKeyTurnOff();
    }
}
