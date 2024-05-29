package lesson5.entity.impl;

import lesson5.entity.duckTypes.RunningDuck;
import lesson5.enums.LiveType;

public class RunnerDuck implements RunningDuck {
    private final boolean isRunning;
    private final LiveType liveType;

    public RunnerDuck() {
        this.isRunning = runningStatus();
        this.liveType = liveTypeStatus();
    }

    @Override
    public boolean runningStatus() {
        return true;
    }

    @Override
    public LiveType liveTypeStatus() {
        return LiveType.WILD;
    }

    @Override
    public String toString() {
        return "RunnerDuck{" +
                "isRunning=" + isRunning +
                ", liveType=" + liveType +
                '}';
    }
}
