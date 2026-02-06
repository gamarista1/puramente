package com.google.android.gms.internal.p000authapiphone;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzr  reason: invalid package */
public final class zzr extends e {
    private static final a.g zza;
    private static final a.C0818a zzb;
    private static final a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzn zzn = new zzn();
        zzb = zzn;
        zzc = new a("SmsCodeAutofill.API", zzn, gVar);
    }

    public zzr(Activity activity) {
        super(activity, zzc, (a.d) a.d.f53921V, e.a.f53922c);
    }

    public final Task<Integer> checkPermissionState() {
        return doRead(C4510w.a().d(zzac.zza).b(new zzk(this)).e(1564).a());
    }

    public final Task<Boolean> hasOngoingSmsRequest(String str) {
        C4536s.l(str);
        C4536s.b(!str.isEmpty(), "The package name cannot be empty.");
        return doRead(C4510w.a().d(zzac.zza).b(new zzl(this, str)).e(1565).a());
    }

    public final Task<Void> startSmsCodeRetriever() {
        return doWrite(C4510w.a().d(zzac.zza).b(new zzm(this)).e(1563).a());
    }

    public zzr(Context context) {
        super(context, zzc, (a.d) a.d.f53921V, e.a.f53922c);
    }
}
