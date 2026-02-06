package com.swmansion.reanimated.keyboard;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowsInsetsManager f59632a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f59633b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f59634c;

    public /* synthetic */ d(WindowsInsetsManager windowsInsetsManager, int i10, int i11) {
        this.f59632a = windowsInsetsManager;
        this.f59633b = i10;
        this.f59634c = i11;
    }

    public final void run() {
        this.f59632a.lambda$updateInsets$1(this.f59633b, this.f59634c);
    }
}
