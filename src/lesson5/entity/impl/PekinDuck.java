package lesson5.entity.impl;

import lesson5.entity.duckTypes.SwimmingDuck;
import lesson5.enums.LiveType;

public class PekinDuck implements SwimmingDuck {

    private final boolean isSwimming;
    private final LiveType liveType;

    public PekinDuck() {
        this.isSwimming = swimmingStatus();
        this.liveType = liveTypeStatus();
    }

    @Override
    public boolean swimmingStatus() {
        return true;
    }

    @Override
    public LiveType liveTypeStatus() {
        return LiveType.HOME;
    }

    @Override
    public String toString() {
        return "PekinDuck{" +
                "isSwimming=" + isSwimming +
                ", liveType=" + liveType +
                '}';
    }
}
