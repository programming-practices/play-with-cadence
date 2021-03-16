package com.trl;

import com.trl.config.Constans;
import com.uber.cadence.worker.Worker;

public class Main {
    public static void main(String[] args) {
        Worker.Factory factory = new Worker.Factory(Constans.CADENCE_DOMAIN);
        Worker worker = factory.newWorker("hello");
        worker.registerWorkflowImplementationTypes(HelloWorkflowImpl.class);
        factory.start();
    }
}
