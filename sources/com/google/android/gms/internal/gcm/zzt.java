package com.google.android.gms.internal.gcm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzt extends WeakReference<Throwable> {
    private final int zzdv;

    public zzt(Throwable th2, ReferenceQueue<Throwable> referenceQueue) {
        super(th2, referenceQueue);
        if (th2 != null) {
            this.zzdv = System.identityHashCode(th2);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzt.class) {
            if (this == obj) {
                return true;
            }
            zzt zzt = (zzt) obj;
            if (this.zzdv == zzt.zzdv && get() == zzt.get()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdv;
    }
}
