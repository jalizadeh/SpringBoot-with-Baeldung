package com.jalizadeh.basa.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
 
@Component
public class MainHealthIndicator implements HealthIndicator {
 
    @Override
    public Health health() {
        return Health.down()
        		.withDetail("Memory Usage", 
        				"Limit reached [com.jalizadeh.basa.actuator.MainHealthIndicator]")
        		.build();
    }
 
}