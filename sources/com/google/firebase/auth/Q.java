package com.google.firebase.auth;

import Ba.C4246a;
import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.P;
import java.util.concurrent.TimeUnit;
import ub.m;
import za.C5298a;
import za.c;

public class Q {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f56965a;

    public static class a extends C5298a {
        public static final Parcelable.Creator<a> CREATOR = new A0();

        a() {
        }

        public static a o0() {
            return new a();
        }

        public void writeToParcel(Parcel parcel, int i10) {
            c.b(parcel, c.a(parcel));
        }
    }

    public static abstract class b {
        private static final C4246a zza = new C4246a("PhoneAuthProvider", new String[0]);

        public void onCodeAutoRetrievalTimeOut(String str) {
            zza.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public abstract void onCodeSent(String str, a aVar);

        public abstract void onVerificationCompleted(O o10);

        public abstract void onVerificationFailed(m mVar);
    }

    private Q(FirebaseAuth firebaseAuth) {
        this.f56965a = firebaseAuth;
    }

    public static O a(String str, String str2) {
        return O.s0(str, str2);
    }

    public static Q b(FirebaseAuth firebaseAuth) {
        return new Q(firebaseAuth);
    }

    public static void c(P p10) {
        C4536s.l(p10);
        FirebaseAuth.h0(p10);
    }

    public void d(String str, long j10, TimeUnit timeUnit, Activity activity, b bVar) {
        c(P.a(this.f56965a).h(str).i(Long.valueOf(j10), timeUnit).c(activity).d(bVar).a());
    }

    public void e(String str, long j10, TimeUnit timeUnit, Activity activity, b bVar, a aVar) {
        P.a d10 = P.a(this.f56965a).h(str).i(Long.valueOf(j10), timeUnit).c(activity).d(bVar);
        if (aVar != null) {
            d10.e(aVar);
        }
        c(d10.a());
    }
}
