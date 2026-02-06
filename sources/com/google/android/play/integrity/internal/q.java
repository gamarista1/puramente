package com.google.android.play.integrity.internal;

final class q extends r {

    /* renamed from: a  reason: collision with root package name */
    private final int f56588a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56589b;

    q(int i10, long j10) {
        this.f56588a = i10;
        this.f56589b = j10;
    }

    public final int a() {
        return this.f56588a;
    }

    public final long b() {
        return this.f56589b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f56588a == rVar.a() && this.f56589b == rVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f56589b;
        return ((this.f56588a ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        int i10 = this.f56588a;
        long j10 = this.f56589b;
        return "EventRecord{eventType=" + i10 + ", eventTimestamp=" + j10 + "}";
    }
}
