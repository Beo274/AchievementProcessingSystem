package ru.accessStrategies;

import org.springframework.stereotype.Component;

@Component
public class Context {
    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.execute();
    }
}
