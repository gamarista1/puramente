package com.google.firebase.auth;

import Db.N;
import Db.k0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

final class L0 extends N {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f56917a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f56918b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56919c;

    L0(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f56917a = str;
        this.f56918b = str2;
        this.f56919c = firebaseAuth;
    }

    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f56917a;
            Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f56917a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str3);
        }
        return this.f56919c.f56881e.zza(this.f56919c.f56877a, this.f56917a, this.f56918b, this.f56919c.f56887k, str, (k0) new FirebaseAuth.c());
    }
}
