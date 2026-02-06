package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C4489a;
import com.google.android.gms.common.api.internal.C4508u;
import com.google.android.gms.common.d;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import pa.C5124a;
import ua.C5223f;
import va.q;

public class b extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final f f53878a = new f((C5223f) null);

    /* renamed from: b  reason: collision with root package name */
    static int f53879b = 1;

    b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C5124a.f61217b, (a.d) googleSignInOptions, (C4508u) new C4489a());
    }

    private final synchronized int g() {
        int i10;
        try {
            i10 = f53879b;
            if (i10 == 1) {
                Context applicationContext = getApplicationContext();
                com.google.android.gms.common.a o10 = com.google.android.gms.common.a.o();
                int h10 = o10.h(applicationContext, d.f54103a);
                if (h10 == 0) {
                    i10 = 4;
                    f53879b = 4;
                } else if (o10.b(applicationContext, h10, (String) null) != null || DynamiteModule.a(applicationContext, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f53879b = 2;
                } else {
                    i10 = 3;
                    f53879b = 3;
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return i10;
    }

    public Intent d() {
        Context applicationContext = getApplicationContext();
        int g10 = g();
        int i10 = g10 - 1;
        if (g10 == 0) {
            throw null;
        } else if (i10 == 2) {
            return q.a(applicationContext, (GoogleSignInOptions) getApiOptions());
        } else {
            if (i10 != 3) {
                return q.b(applicationContext, (GoogleSignInOptions) getApiOptions());
            }
            return q.c(applicationContext, (GoogleSignInOptions) getApiOptions());
        }
    }

    public Task e() {
        boolean z10;
        f asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (g() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        return r.b(q.f(asGoogleApiClient, applicationContext, z10));
    }

    public Task f() {
        boolean z10;
        f asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) getApiOptions();
        if (g() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        return r.a(q.e(asGoogleApiClient, applicationContext, googleSignInOptions, z10), f53878a);
    }

    public Task signOut() {
        boolean z10;
        f asGoogleApiClient = asGoogleApiClient();
        Context applicationContext = getApplicationContext();
        if (g() == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        return r.b(q.g(asGoogleApiClient, applicationContext, z10));
    }

    b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C5124a.f61217b, (a.d) googleSignInOptions, new e.a.C0820a().c(new C4489a()).a());
    }
}
