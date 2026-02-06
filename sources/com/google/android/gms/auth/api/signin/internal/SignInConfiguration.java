package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import va.C5243b;
import va.y;
import za.C5298a;
import za.c;

public final class SignInConfiguration extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new y();

    /* renamed from: a  reason: collision with root package name */
    private final String f53880a;

    /* renamed from: b  reason: collision with root package name */
    private final GoogleSignInOptions f53881b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f53880a = C4536s.f(str);
        this.f53881b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f53880a.equals(signInConfiguration.f53880a)) {
            GoogleSignInOptions googleSignInOptions = this.f53881b;
            GoogleSignInOptions googleSignInOptions2 = signInConfiguration.f53881b;
            if (googleSignInOptions == null) {
                if (googleSignInOptions2 == null) {
                    return true;
                }
            } else if (!googleSignInOptions.equals(googleSignInOptions2)) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return new C5243b().a(this.f53880a).a(this.f53881b).b();
    }

    public final GoogleSignInOptions o0() {
        return this.f53881b;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f53880a;
        int a10 = c.a(parcel);
        c.D(parcel, 2, str, false);
        c.B(parcel, 5, this.f53881b, i10, false);
        c.b(parcel, a10);
    }
}
