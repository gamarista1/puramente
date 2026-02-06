package com.google.firebase.auth;

import Db.N;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;

final class N0 extends N {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f56931a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C4783e f56932b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56933c;

    N0(FirebaseAuth firebaseAuth, String str, C4783e eVar) {
        this.f56931a = str;
        this.f56932b = eVar;
        this.f56933c = firebaseAuth;
    }

    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f56931a;
            Log.i("FirebaseAuth", "Email link sign in for " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f56931a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for email link sign in for " + str3);
        }
        return this.f56933c.f56881e.zzb(this.f56933c.f56877a, this.f56931a, this.f56932b, this.f56933c.f56887k, str);
    }
}
