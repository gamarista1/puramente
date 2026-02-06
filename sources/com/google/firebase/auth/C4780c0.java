package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import za.C5298a;
import za.c;

/* renamed from: com.google.firebase.auth.c0  reason: case insensitive filesystem */
public class C4780c0 extends C5298a {
    public static final Parcelable.Creator<C4780c0> CREATOR = new x0();

    /* renamed from: a  reason: collision with root package name */
    private String f56985a;

    /* renamed from: b  reason: collision with root package name */
    private String f56986b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56987c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56988d;

    /* renamed from: e  reason: collision with root package name */
    private Uri f56989e;

    /* renamed from: com.google.firebase.auth.c0$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f56990a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f56991b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f56992c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f56993d;

        public C4780c0 a() {
            String str;
            String str2 = this.f56990a;
            Uri uri = this.f56991b;
            if (uri == null) {
                str = null;
            } else {
                str = uri.toString();
            }
            return new C4780c0(str2, str, this.f56992c, this.f56993d);
        }

        public a b(String str) {
            if (str == null) {
                this.f56992c = true;
            } else {
                this.f56990a = str;
            }
            return this;
        }

        public a c(Uri uri) {
            if (uri == null) {
                this.f56993d = true;
            } else {
                this.f56991b = uri;
            }
            return this;
        }
    }

    C4780c0(String str, String str2, boolean z10, boolean z11) {
        Uri uri;
        this.f56985a = str;
        this.f56986b = str2;
        this.f56987c = z10;
        this.f56988d = z11;
        if (TextUtils.isEmpty(str2)) {
            uri = null;
        } else {
            uri = Uri.parse(str2);
        }
        this.f56989e = uri;
    }

    public String g() {
        return this.f56985a;
    }

    public Uri o0() {
        return this.f56989e;
    }

    public final boolean p0() {
        return this.f56987c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 2, g(), false);
        c.D(parcel, 3, this.f56986b, false);
        c.g(parcel, 4, this.f56987c);
        c.g(parcel, 5, this.f56988d);
        c.b(parcel, a10);
    }

    public final String zza() {
        return this.f56986b;
    }

    public final boolean zzc() {
        return this.f56988d;
    }
}
