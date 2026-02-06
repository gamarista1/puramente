package com.amazon.device.iap.internal.util;

public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);
    

    /* renamed from: e  reason: collision with root package name */
    private int f37986e;

    private d(int i10) {
        this.f37986e = i10;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f37986e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f37986e < dVar.f37986e;
    }
}
