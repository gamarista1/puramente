package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import io.intercom.android.sdk.models.AttributeType;
import za.c;

public class O extends C4789h implements Cloneable {
    public static final Parcelable.Creator<O> CREATOR = new C4809r0();

    /* renamed from: a  reason: collision with root package name */
    private String f56934a;

    /* renamed from: b  reason: collision with root package name */
    private String f56935b;

    /* renamed from: c  reason: collision with root package name */
    private String f56936c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56937d;

    /* renamed from: e  reason: collision with root package name */
    private String f56938e;

    O(String str, String str2, String str3, boolean z10, String str4) {
        boolean z11;
        if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
            z11 = false;
        } else {
            z11 = true;
        }
        C4536s.b(z11, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f56934a = str;
        this.f56935b = str2;
        this.f56936c = str3;
        this.f56937d = z10;
        this.f56938e = str4;
    }

    public static O s0(String str, String str2) {
        return new O(str, str2, (String) null, true, (String) null);
    }

    public static O u0(String str, String str2) {
        return new O((String) null, (String) null, str, true, str2);
    }

    public /* synthetic */ Object clone() {
        return new O(this.f56934a, r0(), this.f56936c, this.f56937d, this.f56938e);
    }

    public String o0() {
        return AttributeType.PHONE;
    }

    public String p0() {
        return AttributeType.PHONE;
    }

    public final C4789h q0() {
        return (O) clone();
    }

    public String r0() {
        return this.f56935b;
    }

    public final O t0(boolean z10) {
        this.f56937d = false;
        return this;
    }

    public final String v0() {
        return this.f56936c;
    }

    public final boolean w0() {
        return this.f56937d;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, this.f56934a, false);
        c.D(parcel, 2, r0(), false);
        c.D(parcel, 4, this.f56936c, false);
        c.g(parcel, 5, this.f56937d);
        c.D(parcel, 6, this.f56938e, false);
        c.b(parcel, a10);
    }

    public final String zzc() {
        return this.f56934a;
    }

    public final String zzd() {
        return this.f56938e;
    }
}
