package com.gcrate.r2server.service.hardware;

/**
 *
 * @author grahamcrate
 */
public class TestMotor implements Motor {

    private final String motorName;

    public TestMotor(String motorName) {
        this.motorName = motorName;
    }
    
    @Override
    public void setState(MotorState newState) {
        System.out.printf("Setting motor %s to %s\n", motorName, newState.name());
    }
    
}
