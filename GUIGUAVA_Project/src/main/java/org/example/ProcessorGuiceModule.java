package org.example;

import com.google.inject.AbstractModule;

public class ProcessorGuiceModule extends AbstractModule
{
    protected void configure()
    {
        bind(Processor.class).to(SysProdProcessor.class);
    }
}
