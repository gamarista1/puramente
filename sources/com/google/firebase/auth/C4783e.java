package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: com.google.firebase.auth.e  reason: case insensitive filesystem */
public class C4783e extends C5298a {
    public static final Parcelable.Creator<C4783e> CREATOR = new y0();

    /* renamed from: a  reason: collision with root package name */
    private final String f56994a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56995b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56996c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56997d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f56998e;

    /* renamed from: f  reason: collision with root package name */
    private final String f56999f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f57000g;

    /* renamed from: h  reason: collision with root package name */
    private String f57001h;

    /* renamed from: i  reason: collision with root package name */
    private int f57002i;

    /* renamed from: j  reason: collision with root package name */
    private String f57003j;

    /* renamed from: com.google.firebase.auth.e$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f57004a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f57005b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f57006c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public boolean f57007d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f57008e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f57009f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public String f57010g;

        public C4783e a() {
            if (this.f57004a != null) {
                return new C4783e(this);
            }
            throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
        }

        public a b(String str, boolean z10, String str2) {
            this.f57006c = str;
            this.f57007d = z10;
            this.f57008e = str2;
            return this;
        }

        public a c(String str) {
            this.f57010g = str;
            return this;
        }

        public a d(boolean z10) {
            this.f57009f = z10;
            return this;
        }

        public a e(String str) {
            this.f57005b = str;
            return this;
        }

        public a f(String str) {
            this.f57004a = str;
            return this;
        }

        private a() {
            this.f57009f = false;
        }
    }

    public static a u0() {
        return new a();
    }

    public static C4783e y0() {
        return new C4783e(new a());
    }

    public boolean o0() {
        return this.f57000g;
    }

    public boolean p0() {
        return this.f56998e;
    }

    public String q0() {
        return this.f56999f;
    }

    public String r0() {
        return this.f56997d;
    }

    public String s0() {
        return this.f56995b;
    }

    public String t0() {
        return this.f56994a;
    }

    public final int v0() {
        return this.f57002i;
    }

    public final void w0(int i10) {
        this.f57002i = i10;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, t0(), false);
        c.D(parcel, 2, s0(), false);
        c.D(parcel, 3, this.f56996c, false);
        c.D(parcel, 4, r0(), false);
        c.g(parcel, 5, p0());
        c.D(parcel, 6, q0(), false);
        c.g(parcel, 7, o0());
        c.D(parcel, 8, this.f57001h, false);
        c.t(parcel, 9, this.f57002i);
        c.D(parcel, 10, this.f57003j, false);
        c.b(parcel, a10);
    }

    public final void x0(String str) {
        this.f57001h = str;
    }

    public final String zzc() {
        return this.f57003j;
    }

    public final String zzd() {
        return this.f56996c;
    }

    public final String zze() {
        return this.f57001h;
    }

    private C4783e(a aVar) {
        this.f56994a = aVar.f57004a;
        this.f56995b = aVar.f57005b;
        this.f56996c = null;
        this.f56997d = aVar.f57006c;
        this.f56998e = aVar.f57007d;
        this.f56999f = aVar.f57008e;
        this.f57000g = aVar.f57009f;
        this.f57003j = aVar.f57010g;
    }

    C4783e(String str, String str2, String str3, String str4, boolean z10, String str5, boolean z11, String str6, int i10, String str7) {
        this.f56994a = str;
        this.f56995b = str2;
        this.f56996c = str3;
        this.f56997d = str4;
        this.f56998e = z10;
        this.f56999f = str5;
        this.f57000g = z11;
        this.f57001h = str6;
        this.f57002i = i10;
        this.f57003j = str7;
    }
}
