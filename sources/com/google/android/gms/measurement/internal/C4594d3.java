package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzpg;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.d3  reason: case insensitive filesystem */
final class C4594d3 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f55040a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f55041b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ I2 f55042c;

    C4594d3(I2 i22, E5 e52, Bundle bundle) {
        this.f55040a = e52;
        this.f55041b = bundle;
        this.f55042c = i22;
    }

    public final /* synthetic */ Object call() {
        this.f55042c.f54718a.p0();
        q5 a10 = this.f55042c.f54718a;
        E5 e52 = this.f55040a;
        Bundle bundle = this.f55041b;
        a10.zzl().i();
        if (!zzpg.zza() || !a10.a0().z(e52.f54557a, F.f54584A0) || e52.f54557a == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a10.zzj().B().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C4646l c02 = a10.c0();
                        String str = e52.f54557a;
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        C4536s.f(str);
                        c02.i();
                        c02.p();
                        try {
                            int delete = c02.w().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            X1 F10 = c02.zzj().F();
                            F10.d("Pruned " + delete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            c02.zzj().B().c("Error pruning trigger URIs. appId", V1.q(str), e10);
                        }
                    }
                }
            }
        }
        return a10.c0().M0(e52.f54557a);
    }
}
