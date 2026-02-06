package com.facebook.yoga;

public class f extends e {
    public void c() {
        long j10 = this.f42625a;
        if (j10 != 0) {
            this.f42625a = 0;
            YogaNative.jni_YGConfigFreeJNI(j10);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            c();
        } finally {
            super.finalize();
        }
    }
}
