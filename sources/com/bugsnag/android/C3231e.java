package com.bugsnag.android;

/* renamed from: com.bugsnag.android.e  reason: case insensitive filesystem */
public final /* synthetic */ class C3231e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AnrPlugin f38689a;

    public /* synthetic */ C3231e(AnrPlugin anrPlugin) {
        this.f38689a = anrPlugin;
    }

    public final void run() {
        AnrPlugin.m15load$lambda0(this.f38689a);
    }
}
