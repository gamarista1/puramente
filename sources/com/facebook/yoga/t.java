package com.facebook.yoga;

public class t extends YogaNodeJNIBase {
    public t(c cVar) {
        super(cVar);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            v0();
        } finally {
            super.finalize();
        }
    }

    public void v0() {
        long j10 = this.f42604f;
        if (j10 != 0) {
            this.f42604f = 0;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
