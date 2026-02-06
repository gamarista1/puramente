package com.google.android.gms.measurement.internal;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.s2  reason: case insensitive filesystem */
public final /* synthetic */ class C4692s2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C4681q2 f55341a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f55342b;

    public /* synthetic */ C4692s2(C4681q2 q2Var, String str) {
        this.f55341a = q2Var;
        this.f55342b = str;
    }

    public final Object call() {
        C4681q2 q2Var = this.f55341a;
        String str = this.f55342b;
        Z1 C02 = q2Var.l().C0(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        hashMap.put("gmp_version", 97001L);
        if (C02 != null) {
            String o10 = C02.o();
            if (o10 != null) {
                hashMap.put("app_version", o10);
            }
            hashMap.put("app_version_int", Long.valueOf(C02.U()));
            hashMap.put("dynamite_version", Long.valueOf(C02.v0()));
        }
        return hashMap;
    }
}
