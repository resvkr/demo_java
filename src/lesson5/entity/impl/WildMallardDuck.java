package lesson5.entity.impl;

import lesson5.entity.duckTypes.FlyingDuck;
import lesson5.entity.duckTypes.SwimmingDuck;
import lesson5.enums.LiveType;

public class WildMallardDuck implements SwimmingDuck, FlyingDuck {
    private final boolean isSwimming;
    private final boolean isFlying;
    private final LiveType liveType;

    public WildMallardDuck() {
        this.isSwimming = swimmingStatus();
        this.isFlying = flyingStatus();
        this.liveType = liveTypeStatus();
    }

    @Override
    public boolean flyingStatus() {
        return true;
    }

    @Override
    public boolean swimmingStatus() {
        return true;
    }

    @Override
    public LiveType liveTypeStatus() {
        return LiveType.WILD;
    }

    @Override
    public String toString() {
        return "WildMallardDuck{" +
                "isSwimming=" + isSwimming +
                ", isFlying=" + isFlying +
                ", liveType=" + liveType +
                '}';
    }
}
