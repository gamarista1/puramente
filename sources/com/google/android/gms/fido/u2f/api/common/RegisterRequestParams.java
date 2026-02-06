package com.google.android.gms.fido.u2f.api.common;

import Ma.C4377a;
import Ma.d;
import Ma.e;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import za.c;

@Deprecated
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Integer f54322a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f54323b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f54324c;

    /* renamed from: d  reason: collision with root package name */
    private final List f54325d;

    /* renamed from: e  reason: collision with root package name */
    private final List f54326e;

    /* renamed from: f  reason: collision with root package name */
    private final C4377a f54327f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54328g;

    /* renamed from: h  reason: collision with root package name */
    private Set f54329h;

    RegisterRequestParams(Integer num, Double d10, Uri uri, List list, List list2, C4377a aVar, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f54322a = num;
        this.f54323b = d10;
        this.f54324c = uri;
        boolean z13 = false;
        if (list == null || list.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        C4536s.b(z10, "empty list of register requests is provided");
        this.f54325d = list;
        this.f54326e = list2;
        this.f54327f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (uri == null && dVar.o0() == null) {
                z12 = false;
            } else {
                z12 = true;
            }
            C4536s.b(z12, "register request has null appId and no request appId is provided");
            if (dVar.o0() != null) {
                hashSet.add(Uri.parse(dVar.o0()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            if (uri == null && eVar.o0() == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            C4536s.b(z11, "registered key has null appId and no request appId is provided");
            if (eVar.o0() != null) {
                hashSet.add(Uri.parse(eVar.o0()));
            }
        }
        this.f54329h = hashSet;
        C4536s.b((str == null || str.length() <= 80) ? true : z13, "Display Hint cannot be longer than 80 characters");
        this.f54328g = str;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        if (!C4535q.b(this.f54322a, registerRequestParams.f54322a) || !C4535q.b(this.f54323b, registerRequestParams.f54323b) || !C4535q.b(this.f54324c, registerRequestParams.f54324c) || !C4535q.b(this.f54325d, registerRequestParams.f54325d) || ((((list = this.f54326e) != null || registerRequestParams.f54326e != null) && (list == null || (list2 = registerRequestParams.f54326e) == null || !list.containsAll(list2) || !registerRequestParams.f54326e.containsAll(this.f54326e))) || !C4535q.b(this.f54327f, registerRequestParams.f54327f) || !C4535q.b(this.f54328g, registerRequestParams.f54328g))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f54322a, this.f54324c, this.f54323b, this.f54325d, this.f54326e, this.f54327f, this.f54328g);
    }

    public Uri o0() {
        return this.f54324c;
    }

    public C4377a p0() {
        return this.f54327f;
    }

    public String q0() {
        return this.f54328g;
    }

    public List r0() {
        return this.f54325d;
    }

    public List s0() {
        return this.f54326e;
    }

    public Integer t0() {
        return this.f54322a;
    }

    public Double u0() {
        return this.f54323b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.v(parcel, 2, t0(), false);
        c.o(parcel, 3, u0(), false);
        c.B(parcel, 4, o0(), i10, false);
        c.H(parcel, 5, r0(), false);
        c.H(parcel, 6, s0(), false);
        c.B(parcel, 7, p0(), i10, false);
        c.D(parcel, 8, q0(), false);
        c.b(parcel, a10);
    }
}
