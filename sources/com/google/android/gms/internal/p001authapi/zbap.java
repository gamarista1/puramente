package com.google.android.gms.internal.p001authapi;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4495g;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ra.C5181C;
import ra.C5184b;
import ra.C5185c;
import ra.C5187e;
import ra.C5188f;
import ra.k;
import ra.l;
import ya.C5286c;

/* renamed from: com.google.android.gms.internal.auth-api.zbap  reason: invalid package */
public final class zbap extends e implements k {
    private static final a.g zba;
    private static final a.C0818a zbb;
    private static final a zbc;
    private final String zbd = zbas.zba();

    static {
        a.g gVar = new a.g();
        zba = gVar;
        zbak zbak = new zbak();
        zbb = zbak;
        zbc = new a("Auth.Api.Identity.SignIn.API", zbak, gVar);
    }

    public zbap(Activity activity, C5181C c10) {
        super(activity, zbc, (a.d) c10, e.a.f53922c);
    }

    public final Task<C5185c> beginSignIn(C5184b bVar) {
        C4536s.l(bVar);
        C5184b.a v02 = C5184b.v0(bVar);
        v02.h(this.zbd);
        return doRead(C4510w.a().d(new C5286c("auth_api_credentials_begin_sign_in", 8)).b(new zbai(this, v02.a())).c(false).e(1553).a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) {
        if (intent != null) {
            Status status = (Status) za.e.b(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new b(Status.f53911j);
            } else if (status.s0()) {
                String stringExtra = intent.getStringExtra("phone_number_hint_result");
                if (stringExtra != null) {
                    return stringExtra;
                }
                throw new b(Status.f53909h);
            } else {
                throw new b(status);
            }
        } else {
            throw new b(Status.f53909h);
        }
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(C5187e eVar) {
        C4536s.l(eVar);
        return doRead(C4510w.a().d(zbar.zbh).b(new zbag(this, eVar)).e(1653).a());
    }

    public final l getSignInCredentialFromIntent(Intent intent) {
        if (intent != null) {
            Status status = (Status) za.e.b(intent, "status", Status.CREATOR);
            if (status == null) {
                throw new b(Status.f53911j);
            } else if (status.s0()) {
                l lVar = (l) za.e.b(intent, "sign_in_credential", l.CREATOR);
                if (lVar != null) {
                    return lVar;
                }
                throw new b(Status.f53909h);
            } else {
                throw new b(status);
            }
        } else {
            throw new b(Status.f53909h);
        }
    }

    public final Task<PendingIntent> getSignInIntent(C5188f fVar) {
        C4536s.l(fVar);
        C5188f.a t02 = C5188f.t0(fVar);
        t02.f(this.zbd);
        return doRead(C4510w.a().d(zbar.zbf).b(new zbaj(this, t02.a())).e(1555).a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        for (f h10 : f.c()) {
            h10.h();
        }
        C4495g.a();
        return doWrite(C4510w.a().d(zbar.zbb).b(new zbah(this)).c(false).e(1554).a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zba(C5187e eVar, zbaq zbaq, TaskCompletionSource taskCompletionSource) {
        ((zbv) zbaq.getService()).zbd(new zbao(this, taskCompletionSource), eVar, this.zbd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zbb(zbaq zbaq, TaskCompletionSource taskCompletionSource) {
        ((zbv) zbaq.getService()).zbf(new zbam(this, taskCompletionSource), this.zbd);
    }

    public zbap(Context context, C5181C c10) {
        super(context, zbc, (a.d) c10, e.a.f53922c);
    }
}
