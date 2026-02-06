package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import za.c;

public class D extends C4789h {
    public static final Parcelable.Creator<D> CREATOR = new C4800m0();

    /* renamed from: a  reason: collision with root package name */
    private String f56872a;

    D(String str) {
        this.f56872a = C4536s.f(str);
    }

    public static zzags r0(D d10, String str) {
        C4536s.l(d10);
        return new zzags((String) null, d10.f56872a, d10.o0(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String o0() {
        return "github.com";
    }

    public String p0() {
        return "github.com";
    }

    public final C4789h q0() {
        return new D(this.f56872a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f56872a, false);
        c.b(parcel, a10);
    }
}
