package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.List;
import za.C5298a;
import za.c;

public class SaveAccountLinkingTokenRequest extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<SaveAccountLinkingTokenRequest> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final PendingIntent f53821a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53822b;

    /* renamed from: c  reason: collision with root package name */
    private final String f53823c;

    /* renamed from: d  reason: collision with root package name */
    private final List f53824d;

    /* renamed from: e  reason: collision with root package name */
    private final String f53825e;

    /* renamed from: f  reason: collision with root package name */
    private final int f53826f;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private PendingIntent f53827a;

        /* renamed from: b  reason: collision with root package name */
        private String f53828b;

        /* renamed from: c  reason: collision with root package name */
        private String f53829c;

        /* renamed from: d  reason: collision with root package name */
        private List f53830d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private String f53831e;

        /* renamed from: f  reason: collision with root package name */
        private int f53832f;

        public SaveAccountLinkingTokenRequest a() {
            boolean z10;
            boolean z11 = false;
            if (this.f53827a != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            C4536s.b(z10, "Consent PendingIntent cannot be null");
            C4536s.b("auth_code".equals(this.f53828b), "Invalid tokenType");
            C4536s.b(!TextUtils.isEmpty(this.f53829c), "serviceId cannot be null or empty");
            if (this.f53830d != null) {
                z11 = true;
            }
            C4536s.b(z11, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.f53827a, this.f53828b, this.f53829c, this.f53830d, this.f53831e, this.f53832f);
        }

        public a b(PendingIntent pendingIntent) {
            this.f53827a = pendingIntent;
            return this;
        }

        public a c(List list) {
            this.f53830d = list;
            return this;
        }

        public a d(String str) {
            this.f53829c = str;
            return this;
        }

        public a e(String str) {
            this.f53828b = str;
            return this;
        }

        public final a f(String str) {
            this.f53831e = str;
            return this;
        }

        public final a g(int i10) {
            this.f53832f = i10;
            return this;
        }
    }

    SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i10) {
        this.f53821a = pendingIntent;
        this.f53822b = str;
        this.f53823c = str2;
        this.f53824d = list;
        this.f53825e = str3;
        this.f53826f = i10;
    }

    public static a o0() {
        return new a();
    }

    public static a t0(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C4536s.l(saveAccountLinkingTokenRequest);
        a o02 = o0();
        o02.c(saveAccountLinkingTokenRequest.q0());
        o02.d(saveAccountLinkingTokenRequest.r0());
        o02.b(saveAccountLinkingTokenRequest.p0());
        o02.e(saveAccountLinkingTokenRequest.s0());
        o02.g(saveAccountLinkingTokenRequest.f53826f);
        String str = saveAccountLinkingTokenRequest.f53825e;
        if (!TextUtils.isEmpty(str)) {
            o02.f(str);
        }
        return o02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        if (this.f53824d.size() != saveAccountLinkingTokenRequest.f53824d.size() || !this.f53824d.containsAll(saveAccountLinkingTokenRequest.f53824d) || !C4535q.b(this.f53821a, saveAccountLinkingTokenRequest.f53821a) || !C4535q.b(this.f53822b, saveAccountLinkingTokenRequest.f53822b) || !C4535q.b(this.f53823c, saveAccountLinkingTokenRequest.f53823c) || !C4535q.b(this.f53825e, saveAccountLinkingTokenRequest.f53825e) || this.f53826f != saveAccountLinkingTokenRequest.f53826f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C4535q.c(this.f53821a, this.f53822b, this.f53823c, this.f53824d, this.f53825e);
    }

    public PendingIntent p0() {
        return this.f53821a;
    }

    public List q0() {
        return this.f53824d;
    }

    public String r0() {
        return this.f53823c;
    }

    public String s0() {
        return this.f53822b;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, p0(), i10, false);
        c.D(parcel, 2, s0(), false);
        c.D(parcel, 3, r0(), false);
        c.F(parcel, 4, q0(), false);
        c.D(parcel, 5, this.f53825e, false);
        c.t(parcel, 6, this.f53826f);
        c.b(parcel, a10);
    }
}
