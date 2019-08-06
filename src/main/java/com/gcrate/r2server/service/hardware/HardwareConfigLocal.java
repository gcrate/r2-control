package com.gcrate.r2server.service.hardware;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author grahamcrate
 */
@Profile("default")
@Configuration
public class HardwareConfigLocal {
    @Bean
    @Qualifier("head")
    public Motor headMotor() {
        return new TestMotor("head");
    }
}
