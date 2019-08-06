/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gcrate.r2server.service.hardware;

/**
 *
 * @author grahamcrate
 */
public interface Motor {
    public void setState(MotorState newState);
    
    public enum MotorState {
        FORWARD,
        BACKWARD,
        STOP;
    }
}
