package ru.accessStrategies.strategies;

import lombok.extern.slf4j.Slf4j;
import ru.accessStrategies.Strategy;

@Slf4j
public class SteamStrategy implements Strategy {
    @Override
    public void execute() {
        log.info("Steam gave access");
    }
}
