package com.trl;

import com.uber.cadence.workflow.WorkflowMethod;

public interface HelloWorkflow {

    @WorkflowMethod(executionStartToCloseTimeoutSeconds = 300)
    String getGreetings(String name);
}
