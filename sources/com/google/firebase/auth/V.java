package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import za.c;

public class V extends C4789h {
    public static final Parcelable.Creator<V> CREATOR = new u0();

    /* renamed from: a  reason: collision with root package name */
    private final String f56977a;

    V(String str) {
        this.f56977a = C4536s.f(str);
    }

    public static zzags r0(V v10, String str) {
        C4536s.l(v10);
        return new zzags((String) null, (String) null, v10.o0(), (String) null, (String) null, v10.f56977a, str, (String) null, (String) null);
    }

    public String o0() {
        return "playgames.google.com";
    }

    public String p0() {
        return "playgames.google.com";
    }

    public final C4789h q0() {
        return new V(this.f56977a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f56977a, false);
        c.b(parcel, a10);
    }
}
