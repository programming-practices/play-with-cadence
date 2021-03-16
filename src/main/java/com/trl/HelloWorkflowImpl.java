package com.trl;

import com.uber.cadence.workflow.Workflow;

import java.time.Duration;

public class HelloWorkflowImpl implements HelloWorkflow {

    @Override
    public String getGreetings(String name) {
        Workflow.sleep(Duration.ofMinutes(1));
        return "Hello " + name + "!";
    }
}
