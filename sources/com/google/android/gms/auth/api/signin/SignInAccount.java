package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import za.C5298a;
import za.c;

public class SignInAccount extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new g();

    /* renamed from: a  reason: collision with root package name */
    final String f53875a;

    /* renamed from: b  reason: collision with root package name */
    private final GoogleSignInAccount f53876b;

    /* renamed from: c  reason: collision with root package name */
    final String f53877c;

    SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f53876b = googleSignInAccount;
        this.f53875a = C4536s.g(str, "8.3 and 8.4 SDKs require non-null email");
        this.f53877c = C4536s.g(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    public final GoogleSignInAccount o0() {
        return this.f53876b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f53875a;
        int a10 = c.a(parcel);
        c.D(parcel, 4, str, false);
        c.B(parcel, 7, this.f53876b, i10, false);
        c.D(parcel, 8, this.f53877c, false);
        c.b(parcel, a10);
    }
}
