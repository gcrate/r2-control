package com.gcrate.r2server.service.hardware;

import com.pi4j.io.gpio.RaspiPin;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author grahamcrate
 */
@Profile("local")
@Configuration
public class HardwareConfigPi {
    @Bean
    @Qualifier("head")
    public Motor headMotor() {
        return new PiMotor(RaspiPin.GPIO_00, RaspiPin.GPIO_07);
    }
}
