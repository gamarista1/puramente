package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import za.c;

public class F extends C4789h {
    public static final Parcelable.Creator<F> CREATOR = new C4802n0();

    /* renamed from: a  reason: collision with root package name */
    private final String f56873a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56874b;

    F(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        } else if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        } else if (str2 == null || str2.length() != 0) {
            this.f56873a = str;
            this.f56874b = str2;
        } else {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
    }

    public static zzags r0(F f10, String str) {
        C4536s.l(f10);
        return new zzags(f10.f56873a, f10.f56874b, f10.o0(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String o0() {
        return "google.com";
    }

    public String p0() {
        return "google.com";
    }

    public final C4789h q0() {
        return new F(this.f56873a, this.f56874b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f56873a, false);
        c.D(parcel, 2, this.f56874b, false);
        c.b(parcel, a10);
    }
}
