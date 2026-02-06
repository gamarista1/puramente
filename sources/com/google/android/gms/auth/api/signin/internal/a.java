package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import androidx.loader.app.a;
import c2.c;
import com.google.android.gms.common.api.f;
import va.g;
import va.z;

final class a implements a.C0307a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SignInHubActivity f53888a;

    /* synthetic */ a(SignInHubActivity signInHubActivity, z zVar) {
        this.f53888a = signInHubActivity;
    }

    public final /* bridge */ /* synthetic */ void a(c cVar, Object obj) {
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = this.f53888a;
        signInHubActivity.setResult(signInHubActivity.f53886d, signInHubActivity.f53887e);
        this.f53888a.finish();
    }

    public final c onCreateLoader(int i10, Bundle bundle) {
        return new g(this.f53888a, f.c());
    }

    public final void b(c cVar) {
    }
}
