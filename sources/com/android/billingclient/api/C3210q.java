package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.q  reason: case insensitive filesystem */
public final /* synthetic */ class C3210q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C3195b f38334a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f38335b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f38336c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f38337d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C3197d f38338e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Bundle f38339f;

    public /* synthetic */ C3210q(C3195b bVar, int i10, String str, String str2, C3197d dVar, Bundle bundle) {
        this.f38334a = bVar;
        this.f38335b = i10;
        this.f38336c = str;
        this.f38337d = str2;
        this.f38338e = dVar;
        this.f38339f = bundle;
    }

    public final Object call() {
        return this.f38334a.E0(this.f38335b, this.f38336c, this.f38337d, this.f38338e, this.f38339f);
    }
}
