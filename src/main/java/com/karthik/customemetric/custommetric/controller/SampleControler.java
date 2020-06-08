package com.karthik.customemetric.custommetric.controller;
import com.karthik.customemetric.custommetric.component.MessageCustomMetric;
import com.karthik.customemetric.custommetric.service.Greeting;
import io.micrometer.core.annotation.Timed;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class SampleControler {

    private MessageCustomMetric messageCustomMetric;
    private final AtomicLong counter = new AtomicLong();
    private static final String template = "Hello, %s!";
    @Autowired
    public SampleControler(MessageCustomMetric messageCustomMetric) {
        this.messageCustomMetric = messageCustomMetric;
    }


        @Timed
        @GetMapping("/greetings")
        public Greeting index(@RequestParam(value = "name", defaultValue = "World") String name)  {
            messageCustomMetric.longRunnerOperation();
            return new Greeting(counter.incrementAndGet(), String.format(template, name));



        }
}

