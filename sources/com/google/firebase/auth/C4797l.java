package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import za.c;

/* renamed from: com.google.firebase.auth.l  reason: case insensitive filesystem */
public class C4797l extends C4789h {
    public static final Parcelable.Creator<C4797l> CREATOR = new E0();

    /* renamed from: a  reason: collision with root package name */
    private final String f57052a;

    C4797l(String str) {
        this.f57052a = C4536s.f(str);
    }

    public static zzags r0(C4797l lVar, String str) {
        C4536s.l(lVar);
        return new zzags((String) null, lVar.f57052a, lVar.o0(), (String) null, (String) null, (String) null, str, (String) null, (String) null);
    }

    public String o0() {
        return "facebook.com";
    }

    public String p0() {
        return "facebook.com";
    }

    public final C4789h q0() {
        return new C4797l(this.f57052a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f57052a, false);
        c.b(parcel, a10);
    }
}
