package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.y2  reason: case insensitive filesystem */
final class C4728y2 implements zzo {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f55414a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4681q2 f55415b;

    C4728y2(C4681q2 q2Var, String str) {
        this.f55414a = str;
        this.f55415b = q2Var;
    }

    public final String zza(String str) {
        Map map = (Map) this.f55415b.f55272d.get(this.f55414a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
