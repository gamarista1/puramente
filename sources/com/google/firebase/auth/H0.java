package com.google.firebase.auth;

import Db.C4255c;
import Db.C4265m;
import Db.i0;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaak;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.Q;
import ub.m;

final class H0 implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ P f56906a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f56907b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ FirebaseAuth f56908c;

    H0(FirebaseAuth firebaseAuth, P p10, String str) {
        this.f56906a = p10;
        this.f56907b = str;
        this.f56908c = firebaseAuth;
    }

    public final void onComplete(Task task) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            String str3 = "Error while validating application identity: ";
            if (exception != null) {
                str3 = str3 + exception.getMessage();
            }
            Log.e("FirebaseAuth", str3);
            if (exception == null || !C4255c.f(exception)) {
                Log.e("FirebaseAuth", "Proceeding without any application identifier.");
                str2 = null;
                str = null;
            } else {
                FirebaseAuth.j0((m) exception, this.f56906a, this.f56907b);
                return;
            }
        } else {
            str2 = ((i0) task.getResult()).c();
            str = ((i0) task.getResult()).a();
        }
        long longValue = this.f56906a.i().longValue();
        Q.b Y10 = this.f56908c.a0(this.f56906a.j(), this.f56906a.g());
        if (TextUtils.isEmpty(str2)) {
            Y10 = this.f56908c.Z(this.f56906a, Y10);
        }
        Q.b bVar = Y10;
        C4265m mVar = (C4265m) C4536s.l(this.f56906a.e());
        if (mVar.r0()) {
            zzaak r02 = this.f56908c.f56881e;
            String str4 = (String) C4536s.l(this.f56906a.j());
            String y02 = this.f56908c.f56885i;
            if (this.f56906a.f() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            r02.zza(mVar, str4, y02, longValue, z11, this.f56906a.m(), str2, str, this.f56908c.H0(), bVar, this.f56906a.k(), this.f56906a.b());
            return;
        }
        zzaak r03 = this.f56908c.f56881e;
        U u10 = (U) C4536s.l(this.f56906a.h());
        String y03 = this.f56908c.f56885i;
        if (this.f56906a.f() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        r03.zza(mVar, u10, y03, longValue, z10, this.f56906a.m(), str2, str, this.f56908c.H0(), bVar, this.f56906a.k(), this.f56906a.b());
    }
}
