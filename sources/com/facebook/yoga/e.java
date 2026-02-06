package com.facebook.yoga;

public abstract class e extends c {

    /* renamed from: a  reason: collision with root package name */
    long f42625a;

    private e(long j10) {
        if (j10 != 0) {
            this.f42625a = j10;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    public void a(k kVar) {
        YogaNative.jni_YGConfigSetErrataJNI(this.f42625a, kVar.b());
    }

    public void b(float f10) {
        YogaNative.jni_YGConfigSetPointScaleFactorJNI(this.f42625a, f10);
    }

    e() {
        this(YogaNative.jni_YGConfigNewJNI());
    }
}
