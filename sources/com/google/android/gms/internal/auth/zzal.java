package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.a;
import com.google.android.gms.auth.account.b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;

public final class zzal implements b {
    /* access modifiers changed from: private */
    public static final Status zza = new Status(13);

    public final h addWorkAccount(f fVar, String str) {
        return fVar.b(new zzae(this, a.f53793a, fVar, str));
    }

    public final h removeWorkAccount(f fVar, Account account) {
        return fVar.b(new zzag(this, a.f53793a, fVar, account));
    }

    public final void setWorkAuthenticatorEnabled(f fVar, boolean z10) {
        setWorkAuthenticatorEnabledWithResult(fVar, z10);
    }

    public final h setWorkAuthenticatorEnabledWithResult(f fVar, boolean z10) {
        return fVar.b(new zzac(this, a.f53793a, fVar, z10));
    }
}
