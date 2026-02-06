package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.C1773v;
import com.google.android.gms.common.internal.C4536s;

/* renamed from: com.google.android.gms.common.api.internal.i  reason: case insensitive filesystem */
public class C4497i {

    /* renamed from: a  reason: collision with root package name */
    private final Object f54042a;

    public C4497i(Activity activity) {
        C4536s.m(activity, "Activity must not be null");
        this.f54042a = activity;
    }

    public final Activity a() {
        return (Activity) this.f54042a;
    }

    public final C1773v b() {
        return (C1773v) this.f54042a;
    }

    public final boolean c() {
        return this.f54042a instanceof Activity;
    }

    public final boolean d() {
        return this.f54042a instanceof C1773v;
    }
}
