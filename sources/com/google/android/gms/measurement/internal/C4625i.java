package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C4622h3;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.i  reason: case insensitive filesystem */
final class C4625i {

    /* renamed from: a  reason: collision with root package name */
    private final EnumMap f55136a;

    C4625i() {
        this.f55136a = new EnumMap(C4622h3.a.class);
    }

    public static C4625i a(String str) {
        EnumMap enumMap = new EnumMap(C4622h3.a.class);
        if (str.length() >= C4622h3.a.values().length) {
            int i10 = 0;
            if (str.charAt(0) == '1') {
                C4622h3.a[] values = C4622h3.a.values();
                int length = values.length;
                int i11 = 1;
                while (i10 < length) {
                    enumMap.put(values[i10], C4639k.b(str.charAt(i11)));
                    i10++;
                    i11++;
                }
                return new C4625i(enumMap);
            }
        }
        return new C4625i();
    }

    public final C4639k b(C4622h3.a aVar) {
        C4639k kVar = (C4639k) this.f55136a.get(aVar);
        if (kVar == null) {
            return C4639k.UNSET;
        }
        return kVar;
    }

    public final void c(C4622h3.a aVar, int i10) {
        C4639k kVar = C4639k.UNSET;
        if (i10 != -30) {
            if (i10 != -20) {
                if (i10 == -10) {
                    kVar = C4639k.MANIFEST;
                } else if (i10 != 0) {
                    if (i10 == 30) {
                        kVar = C4639k.INITIALIZATION;
                    }
                }
            }
            kVar = C4639k.API;
        } else {
            kVar = C4639k.TCF;
        }
        this.f55136a.put(aVar, kVar);
    }

    public final void d(C4622h3.a aVar, C4639k kVar) {
        this.f55136a.put(aVar, kVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("1");
        for (C4622h3.a aVar : C4622h3.a.values()) {
            C4639k kVar = (C4639k) this.f55136a.get(aVar);
            if (kVar == null) {
                kVar = C4639k.UNSET;
            }
            sb2.append(kVar.f55180a);
        }
        return sb2.toString();
    }

    private C4625i(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C4622h3.a.class);
        this.f55136a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
