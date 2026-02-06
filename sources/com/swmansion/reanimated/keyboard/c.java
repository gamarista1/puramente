package com.swmansion.reanimated.keyboard;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WindowsInsetsManager f59630a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f59631b;

    public /* synthetic */ c(WindowsInsetsManager windowsInsetsManager, boolean z10) {
        this.f59630a = windowsInsetsManager;
        this.f59631b = z10;
    }

    public final void run() {
        this.f59630a.lambda$updateWindowDecor$0(this.f59631b);
    }
}
