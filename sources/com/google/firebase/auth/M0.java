package com.google.firebase.auth;

import Db.C4254b0;
import Db.N;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

final class M0 extends N {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ A f56920a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4793j f56921b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56922c;

    M0(FirebaseAuth firebaseAuth, A a10, C4793j jVar) {
        this.f56920a = a10;
        this.f56921b = jVar;
        this.f56922c = firebaseAuth;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        return this.f56922c.f56881e.zza(this.f56922c.f56877a, this.f56920a, (C4789h) this.f56921b, str, (C4254b0) new FirebaseAuth.d());
    }
}
