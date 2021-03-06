package com.netflix.governator;

import com.netflix.governator.guice.jetty.JettyModule;

public class JettyGuiceContextListenerExample {
    public static void main(String args[]) throws Exception {
        Governator.createInjector(
                new SampleServletModule(), 
                new ShutdownHookModule(), 
                new JettyModule())
                .awaitTermination();
    }
}
