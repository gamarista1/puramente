package com.google.firebase.auth;

import Db.N;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;

final class O0 extends N {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f56939a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4783e f56940b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56941c;

    O0(FirebaseAuth firebaseAuth, String str, C4783e eVar) {
        this.f56939a = str;
        this.f56940b = eVar;
        this.f56941c = firebaseAuth;
    }

    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f56939a;
            Log.i("FirebaseAuth", "Password reset request " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f56939a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + str3);
        }
        return this.f56941c.f56881e.zza(this.f56941c.f56877a, this.f56939a, this.f56940b, this.f56941c.f56887k, str);
    }
}
