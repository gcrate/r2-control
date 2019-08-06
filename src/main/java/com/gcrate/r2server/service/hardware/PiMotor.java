package com.gcrate.r2server.service.hardware;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;

/**
 *
 * @author gcrate
 */
public class PiMotor implements Motor {

    // create gpio controller
    final GpioController gpio = GpioFactory.getInstance();    
    // control for relay 1
    final GpioPinDigitalOutput relay1Control;
    // control for relay 2
    final GpioPinDigitalOutput relay2Control;
    
    public PiMotor(Pin relay1Pin, Pin relay2Pin) {
        this.relay1Control = gpio.provisionDigitalOutputPin(relay1Pin, PinState.LOW);
        this.relay2Control = gpio.provisionDigitalOutputPin(relay2Pin, PinState.LOW);
        
        this.relay2Control.setShutdownOptions(true, PinState.LOW);
        this.relay2Control.setShutdownOptions(true, PinState.LOW);
    }
    
    public void setState(Motor.MotorState newState) {
        switch(newState) {
            case FORWARD:
                relay1Control.high();
                relay2Control.low();
                break;
            case BACKWARD:
                relay1Control.low();
                relay2Control.high();
                break;
            case STOP:
                relay1Control.low();
                relay2Control.low();
                break;
        }
    }
    
    
}
