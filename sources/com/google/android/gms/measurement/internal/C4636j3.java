package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzdo;

/* renamed from: com.google.android.gms.measurement.internal.j3  reason: case insensitive filesystem */
public final class C4636j3 {

    /* renamed from: a  reason: collision with root package name */
    final Context f55154a;

    /* renamed from: b  reason: collision with root package name */
    String f55155b;

    /* renamed from: c  reason: collision with root package name */
    String f55156c;

    /* renamed from: d  reason: collision with root package name */
    String f55157d;

    /* renamed from: e  reason: collision with root package name */
    Boolean f55158e;

    /* renamed from: f  reason: collision with root package name */
    long f55159f;

    /* renamed from: g  reason: collision with root package name */
    zzdo f55160g;

    /* renamed from: h  reason: collision with root package name */
    boolean f55161h = true;

    /* renamed from: i  reason: collision with root package name */
    Long f55162i;

    /* renamed from: j  reason: collision with root package name */
    String f55163j;

    public C4636j3(Context context, zzdo zzdo, Long l10) {
        C4536s.l(context);
        Context applicationContext = context.getApplicationContext();
        C4536s.l(applicationContext);
        this.f55154a = applicationContext;
        this.f55162i = l10;
        if (zzdo != null) {
            this.f55160g = zzdo;
            this.f55155b = zzdo.zzf;
            this.f55156c = zzdo.zze;
            this.f55157d = zzdo.zzd;
            this.f55161h = zzdo.zzc;
            this.f55159f = zzdo.zzb;
            this.f55163j = zzdo.zzh;
            Bundle bundle = zzdo.zzg;
            if (bundle != null) {
                this.f55158e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
