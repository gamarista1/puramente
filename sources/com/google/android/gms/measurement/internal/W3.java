package com.google.android.gms.measurement.internal;

import android.net.Uri;

final class W3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f54918a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Uri f54919b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f54920c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f54921d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ X3 f54922e;

    W3(X3 x32, boolean z10, Uri uri, String str, String str2) {
        this.f54918a = z10;
        this.f54919b = uri;
        this.f54920c = str;
        this.f54921d = str2;
        this.f54922e = x32;
    }

    public final void run() {
        X3.a(this.f54922e, this.f54918a, this.f54919b, this.f54920c, this.f54921d);
    }
}
