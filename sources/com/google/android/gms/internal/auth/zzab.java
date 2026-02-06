package com.google.android.gms.internal.auth;

import Ba.C4246a;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.api.internal.C4511x;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import oa.b;
import oa.j;
import oa.k;

final class zzab extends e implements zzg {
    private static final a.g zza;
    private static final a.C0818a zzb;
    private static final a zzc;
    private static final C4246a zzd = j.a("GoogleAuthServiceClient");
    private final Context zze;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        zzv zzv = new zzv();
        zzb = zzv;
        zzc = new a("GoogleAuthService.API", zzv, gVar);
    }

    zzab(Context context) {
        super(context, zzc, (a.d) a.d.f53921V, e.a.f53922c);
        this.zze = context;
    }

    static /* bridge */ /* synthetic */ void zzf(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (!C4511x.c(status, obj, taskCompletionSource)) {
            zzd.h("The task is already complete.", new Object[0]);
        }
    }

    public final Task zza(zzbw zzbw) {
        return doWrite(C4510w.a().d(k.f61171l).b(new zzt(this, zzbw)).e(1513).a());
    }

    public final Task zzb(b bVar) {
        C4536s.m(bVar, "request cannot be null.");
        return doWrite(C4510w.a().d(k.f61170k).b(new zzu(this, bVar)).e(1515).a());
    }

    public final Task zzc(Account account, String str, Bundle bundle) {
        C4536s.m(account, "Account name cannot be null!");
        C4536s.g(str, "Scope cannot be null!");
        return doWrite(C4510w.a().d(k.f61171l).b(new zzs(this, account, str, bundle)).e(1512).a());
    }

    public final Task zzd(Account account) {
        C4536s.m(account, "account cannot be null.");
        return doWrite(C4510w.a().d(k.f61170k).b(new zzr(this, account)).e(1517).a());
    }

    public final Task zze(String str) {
        C4536s.m(str, "Client package name cannot be null!");
        return doWrite(C4510w.a().d(k.f61170k).b(new zzq(this, str)).e(1514).a());
    }
}
