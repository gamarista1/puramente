package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import za.c;

public class Z extends C4789h {
    public static final Parcelable.Creator<Z> CREATOR = new w0();

    /* renamed from: a  reason: collision with root package name */
    private String f56982a;

    /* renamed from: b  reason: collision with root package name */
    private String f56983b;

    Z(String str, String str2) {
        this.f56982a = C4536s.f(str);
        this.f56983b = C4536s.f(str2);
    }

    public static zzags r0(Z z10, String str) {
        C4536s.l(z10);
        return new zzags((String) null, z10.f56982a, z10.o0(), (String) null, z10.f56983b, (String) null, str, (String) null, (String) null);
    }

    public String o0() {
        return "twitter.com";
    }

    public String p0() {
        return "twitter.com";
    }

    public final C4789h q0() {
        return new Z(this.f56982a, this.f56983b);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f56982a, false);
        c.D(parcel, 2, this.f56983b, false);
        c.b(parcel, a10);
    }
}
