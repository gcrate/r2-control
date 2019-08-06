package com.gcrate.r2server.controller;

import com.gcrate.r2server.service.R2ControlService;
import com.gcrate.r2server.service.hardware.PiMotor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author grahamcrate
 */
@RestController
public class R2Controller {
    @Autowired
    private R2ControlService r2ControlService;
    
    @GetMapping("/head/left")
    public void headLeft() {
        r2ControlService.headLeft();;
    }
    
    @GetMapping("/head/right")
    public void headRight() {
        r2ControlService.headRight();
    }
    
    @GetMapping("/head/stop")
    public void headStop() {
        r2ControlService.headStop();
    }
    
    @GetMapping("/head/360")
    public void head360() {
        
    }
}
