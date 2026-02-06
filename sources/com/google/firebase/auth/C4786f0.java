package com.google.firebase.auth;

import Db.C4254b0;
import Db.N;
import Db.k0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.f0  reason: case insensitive filesystem */
final class C4786f0 extends N {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f57024a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ A f57025b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C4793j f57026c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f57027d;

    C4786f0(FirebaseAuth firebaseAuth, boolean z10, A a10, C4793j jVar) {
        this.f57024a = z10;
        this.f57025b = a10;
        this.f57026c = jVar;
        this.f57027d = firebaseAuth;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (!this.f57024a) {
            return this.f57027d.f56881e.zza(this.f57027d.f56877a, this.f57026c, str, (k0) new FirebaseAuth.c());
        }
        return this.f57027d.f56881e.zzb(this.f57027d.f56877a, (A) C4536s.l(this.f57025b), this.f57026c, str, (C4254b0) new FirebaseAuth.d());
    }
}
