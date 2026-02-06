package com.swmansion.reanimated;

import B7.a;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;

public class AndroidUIScheduler {
    private final AtomicBoolean mActive = new AtomicBoolean(true);
    private final ReactApplicationContext mContext;
    @a
    private final HybridData mHybridData = initHybrid();
    /* access modifiers changed from: private */
    public final Runnable mUIThreadRunnable = new a(this);

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private native HybridData initHybrid();

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        if (this.mActive.get()) {
            triggerUI();
        }
    }

    @a
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mContext.getExceptionHandler()) {
            public void runGuarded() {
                AndroidUIScheduler.this.mUIThreadRunnable.run();
            }
        });
    }

    public void deactivate() {
        this.mActive.set(false);
    }

    public native void triggerUI();
}
