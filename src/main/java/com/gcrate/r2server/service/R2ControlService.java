package com.gcrate.r2server.service;

import com.gcrate.r2server.service.hardware.Motor;
import com.gcrate.r2server.service.hardware.PiMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author grahamcrate
 */
@Service
public class R2ControlService {
    
    public static boolean soundAuto = true;
    public static boolean lightsAuto = true;
    
    @Autowired
    @Qualifier("head")
    private Motor headMotor;       
    
    public void headLeft() {
        headMotor.setState(PiMotor.MotorState.STOP);
        headMotor.setState(PiMotor.MotorState.FORWARD);
    }
    
    public void headRight() {
        headMotor.setState(PiMotor.MotorState.STOP);
        headMotor.setState(PiMotor.MotorState.BACKWARD);
    }
    
    public void headStop() {
        headMotor.setState(PiMotor.MotorState.STOP);
    }
}
