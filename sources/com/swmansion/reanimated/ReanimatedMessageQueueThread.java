package com.swmansion.reanimated;

import B7.a;

@a
public class ReanimatedMessageQueueThread extends ReanimatedMessageQueueThreadBase {
    public boolean isIdle() {
        return this.messageQueueThread.isIdle();
    }

    public boolean runOnQueue(Runnable runnable) {
        return this.messageQueueThread.runOnQueue(runnable);
    }
}
