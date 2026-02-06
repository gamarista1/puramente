package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import za.C5298a;
import za.c;

public class TokenData extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f53783a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53784b;

    /* renamed from: c  reason: collision with root package name */
    private final Long f53785c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f53786d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f53787e;

    /* renamed from: f  reason: collision with root package name */
    private final List f53788f;

    /* renamed from: g  reason: collision with root package name */
    private final String f53789g;

    TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f53783a = i10;
        this.f53784b = C4536s.f(str);
        this.f53785c = l10;
        this.f53786d = z10;
        this.f53787e = z11;
        this.f53788f = list;
        this.f53789g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f53784b, tokenData.f53784b) || !C4535q.b(this.f53785c, tokenData.f53785c) || this.f53786d != tokenData.f53786d || this.f53787e != tokenData.f53787e || !C4535q.b(this.f53788f, tokenData.f53788f) || !C4535q.b(this.f53789g, tokenData.f53789g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C4535q.c(this.f53784b, this.f53785c, Boolean.valueOf(this.f53786d), Boolean.valueOf(this.f53787e), this.f53788f, this.f53789g);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f53783a);
        c.D(parcel, 2, this.f53784b, false);
        c.y(parcel, 3, this.f53785c, false);
        c.g(parcel, 4, this.f53786d);
        c.g(parcel, 5, this.f53787e);
        c.F(parcel, 6, this.f53788f, false);
        c.D(parcel, 7, this.f53789g, false);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f53784b;
    }
}
