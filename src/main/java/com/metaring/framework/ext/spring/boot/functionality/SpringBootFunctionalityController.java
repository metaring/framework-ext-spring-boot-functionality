package com.metaring.framework.ext.spring.boot.functionality;

import com.metaring.framework.ext.spring.boot.MetaRingSpringBootApplication;
import com.metaring.framework.functionality.FunctionalityController;

public class SpringBootFunctionalityController implements FunctionalityController {

    @Override
    public final void execute(Runnable action) {
        MetaRingSpringBootApplication.EXECUTOR.execute(action);
    }
}