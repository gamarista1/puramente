package com.bugsnag.android;

public final class N0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f38553a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f38554b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f38555c;

    public N0(int i10, boolean z10, boolean z11) {
        this.f38553a = i10;
        this.f38554b = z10;
        this.f38555c = z11;
    }

    public final int a() {
        return this.f38553a;
    }

    public final boolean b() {
        return this.f38554b;
    }

    public final boolean c() {
        return this.f38555c;
    }

    public String toString() {
        return "LastRunInfo(consecutiveLaunchCrashes=" + this.f38553a + ", crashed=" + this.f38554b + ", crashedDuringLaunch=" + this.f38555c + ')';
    }
}
