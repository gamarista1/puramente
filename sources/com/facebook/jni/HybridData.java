package com.facebook.jni;

import com.facebook.jni.DestructorThread;
import com.facebook.jni.annotations.DoNotStripAny;
import w8.C4145a;

@DoNotStripAny
public class HybridData {
    private final Destructor mDestructor = new Destructor(this);

    @DoNotStripAny
    public static class Destructor extends DestructorThread.Destructor {
        /* access modifiers changed from: private */
        public volatile long mNativePointer;

        Destructor(Object obj) {
            super(obj);
        }

        static native void deleteNative(long j10);

        /* access modifiers changed from: protected */
        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        C4145a.d("fbjni");
    }

    public boolean isValid() {
        if (this.mDestructor.mNativePointer != 0) {
            return true;
        }
        return false;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}
