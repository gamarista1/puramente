package com.google.firebase.auth;

import Db.N;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: com.google.firebase.auth.e0  reason: case insensitive filesystem */
final class C4784e0 extends N {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f57011a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f57012b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ A f57013c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f57014d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f57015e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f57016f;

    C4784e0(FirebaseAuth firebaseAuth, String str, boolean z10, A a10, String str2, String str3) {
        this.f57011a = str;
        this.f57012b = z10;
        this.f57013c = a10;
        this.f57014d = str2;
        this.f57015e = str3;
        this.f57016f = firebaseAuth;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [Db.b0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task d(String str) {
        if (TextUtils.isEmpty(str)) {
            String str2 = this.f57011a;
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            String str3 = this.f57011a;
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str3);
        }
        if (this.f57012b) {
            return this.f57016f.f56881e.zzb(this.f57016f.f56877a, (A) C4536s.l(this.f57013c), this.f57011a, this.f57014d, this.f57015e, str, new FirebaseAuth.d());
        }
        return this.f57016f.f56881e.zzb(this.f57016f.f56877a, this.f57011a, this.f57014d, this.f57015e, str, new FirebaseAuth.c());
    }
}
