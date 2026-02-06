package com.google.android.gms.fido.u2f.api.common;

import Ma.C4377a;
import Ma.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import za.c;

@Deprecated
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final Integer f54330a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f54331b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f54332c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f54333d;

    /* renamed from: e  reason: collision with root package name */
    private final List f54334e;

    /* renamed from: f  reason: collision with root package name */
    private final C4377a f54335f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54336g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f54337h;

    SignRequestParams(Integer num, Double d10, Uri uri, byte[] bArr, List list, C4377a aVar, String str) {
        boolean z10;
        boolean z11;
        this.f54330a = num;
        this.f54331b = d10;
        this.f54332c = uri;
        this.f54333d = bArr;
        boolean z12 = false;
        if (list == null || list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C4536s.b(z10, "registeredKeys must not be null or empty");
        this.f54334e = list;
        this.f54335f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.o0() == null && uri == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            C4536s.b(z11, "registered key has null appId and no request appId is provided");
            eVar.p0();
            C4536s.b(true, "register request has null challenge and no default challenge isprovided");
            if (eVar.o0() != null) {
                hashSet.add(Uri.parse(eVar.o0()));
            }
        }
        this.f54337h = hashSet;
        C4536s.b((str == null || str.length() <= 80) ? true : z12, "Display Hint cannot be longer than 80 characters");
        this.f54336g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        if (!C4535q.b(this.f54330a, signRequestParams.f54330a) || !C4535q.b(this.f54331b, signRequestParams.f54331b) || !C4535q.b(this.f54332c, signRequestParams.f54332c) || !Arrays.equals(this.f54333d, signRequestParams.f54333d) || !this.f54334e.containsAll(signRequestParams.f54334e) || !signRequestParams.f54334e.containsAll(this.f54334e) || !C4535q.b(this.f54335f, signRequestParams.f54335f) || !C4535q.b(this.f54336g, signRequestParams.f54336g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f54330a, this.f54332c, this.f54331b, this.f54334e, this.f54335f, this.f54336g, Integer.valueOf(Arrays.hashCode(this.f54333d)));
    }

    public Uri o0() {
        return this.f54332c;
    }

    public C4377a p0() {
        return this.f54335f;
    }

    public byte[] q0() {
        return this.f54333d;
    }

    public String r0() {
        return this.f54336g;
    }

    public List s0() {
        return this.f54334e;
    }

    public Integer t0() {
        return this.f54330a;
    }

    public Double u0() {
        return this.f54331b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.v(parcel, 2, t0(), false);
        c.o(parcel, 3, u0(), false);
        c.B(parcel, 4, o0(), i10, false);
        c.k(parcel, 5, q0(), false);
        c.H(parcel, 6, s0(), false);
        c.B(parcel, 7, p0(), i10, false);
        c.D(parcel, 8, r0(), false);
        c.b(parcel, a10);
    }
}
