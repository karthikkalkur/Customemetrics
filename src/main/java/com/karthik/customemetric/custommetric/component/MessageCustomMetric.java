package com.karthik.customemetric.custommetric.component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;



@Component
public class MessageCustomMetric {
    private MeterRegistry meterRegistry;
    private Timer totalTime;

    @Autowired
    public MessageCustomMetric(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.totalTime = meterRegistry.timer("LatencyTimer");
    }

    public void longRunnerOperation()  {
        totalTime.record(()->{System.out.println("Method called once");});
    }

}
