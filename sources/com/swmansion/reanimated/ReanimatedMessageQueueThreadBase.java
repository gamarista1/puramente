package com.swmansion.reanimated;

import B7.a;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@a
public abstract class ReanimatedMessageQueueThreadBase implements MessageQueueThread {
    protected final MessageQueueThreadImpl messageQueueThread = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new e());

    /* access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Exception exc) {
        throw new RuntimeException(exc);
    }

    public void assertIsOnThread() {
        this.messageQueueThread.assertIsOnThread();
    }

    public <T> Future<T> callOnQueue(Callable<T> callable) {
        return this.messageQueueThread.callOnQueue(callable);
    }

    public MessageQueueThreadPerfStats getPerfStats() {
        return this.messageQueueThread.getPerfStats();
    }

    public boolean isOnThread() {
        return this.messageQueueThread.isOnThread();
    }

    public void quitSynchronous() {
        try {
            Field declaredField = this.messageQueueThread.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(this.messageQueueThread, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    public void resetPerfStats() {
        this.messageQueueThread.resetPerfStats();
    }

    public void assertIsOnThread(String str) {
        this.messageQueueThread.assertIsOnThread(str);
    }
}
