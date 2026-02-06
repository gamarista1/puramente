package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.t3  reason: case insensitive filesystem */
public final /* synthetic */ class C4699t3 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4643k3 f55350a;

    public /* synthetic */ C4699t3(C4643k3 k3Var) {
        this.f55350a = k3Var;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f55350a.H(sharedPreferences, str);
    }
}
