package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import ra.C5186d;
import ra.h;
import ra.i;
import ra.j;
import ra.r;

/* renamed from: com.google.android.gms.internal.auth-api.zbaf  reason: invalid package */
public final class zbaf extends e implements C5186d {
    private static final a.g zba;
    private static final a.C0818a zbb;
    private static final a zbc;
    private final String zbd = zbas.zba();

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbac zbac = new zbac();
        zbb = zbac;
        zbc = new a("Auth.Api.Identity.CredentialSaving.API", zbac, gVar);
    }

    public zbaf(Activity activity, r rVar) {
        super(activity, zbc, (a.d) rVar, e.a.f53922c);
    }

    public final Status getStatusFromIntent(Intent intent) {
        if (intent == null) {
            return Status.f53909h;
        }
        Status status = (Status) za.e.b(intent, "status", Status.CREATOR);
        if (status == null) {
            return Status.f53909h;
        }
        return status;
    }

    public final Task<h> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C4536s.l(saveAccountLinkingTokenRequest);
        SaveAccountLinkingTokenRequest.a t02 = SaveAccountLinkingTokenRequest.t0(saveAccountLinkingTokenRequest);
        t02.f(this.zbd);
        return doRead(C4510w.a().d(zbar.zbg).b(new zbaa(this, t02.a())).c(false).e(1535).a());
    }

    public final Task<j> savePassword(i iVar) {
        C4536s.l(iVar);
        i.a q02 = i.q0(iVar);
        q02.c(this.zbd);
        return doRead(C4510w.a().d(zbar.zbe).b(new zbab(this, q02.a())).c(false).e(1536).a());
    }

    public zbaf(Context context, r rVar) {
        super(context, zbc, (a.d) rVar, e.a.f53922c);
    }
}
