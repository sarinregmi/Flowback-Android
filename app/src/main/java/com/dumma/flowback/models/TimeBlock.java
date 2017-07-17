package com.dumma.flowback.models;

/**
 * Created by sregmi on 6/29/17.
 */

public class TimeBlock {

    public enum Time {
            ONE_DAY,
            ONE_WEEK,
            ONE_MONTH,
            THREE_MONTH,
            SIX_MONTH
    }

    private Time time;

    public TimeBlock(Time time) {
        this.time = time;
    }
}
