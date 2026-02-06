package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C4622h3;

/* renamed from: com.google.android.gms.measurement.internal.i3  reason: case insensitive filesystem */
public enum C4629i3 {
    STORAGE(C4622h3.a.AD_STORAGE, C4622h3.a.ANALYTICS_STORAGE),
    DMA(C4622h3.a.AD_USER_DATA);
    
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C4622h3.a[] f55144a;

    private C4629i3(C4622h3.a... aVarArr) {
        this.f55144a = aVarArr;
    }

    public final C4622h3.a[] a() {
        return this.f55144a;
    }
}
