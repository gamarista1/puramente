package com.google.android.gms.internal.p002firebaseauthapi;

import Ea.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzagr  reason: invalid package */
public final class zzagr {
    private final int zza;
    private List<String> zzb;

    public zzagr() {
        this((List<String>) null);
    }

    public static zzagr zza() {
        return new zzagr((List<String>) null);
    }

    public final List<String> zzb() {
        return this.zzb;
    }

    private zzagr(List<String> list) {
        this.zza = 1;
        this.zzb = new ArrayList();
    }

    public zzagr(int i10, List<String> list) {
        this.zza = 1;
        if (list == null || list.isEmpty()) {
            this.zzb = Collections.emptyList();
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            list.set(i11, p.a(list.get(i11)));
        }
        this.zzb = Collections.unmodifiableList(list);
    }
}
