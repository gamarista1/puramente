package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.C3884A;
import o7.C3899o;
import o7.C3906w;
import org.json.JSONObject;

/* renamed from: com.facebook.y  reason: case insensitive filesystem */
public final class C3462y implements Parcelable {
    public static final Parcelable.Creator<C3462y> CREATOR = new b();

    /* renamed from: o  reason: collision with root package name */
    public static final c f42569o = new c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public static final d f42570p = new d(200, 299);

    /* renamed from: a  reason: collision with root package name */
    private final int f42571a;

    /* renamed from: b  reason: collision with root package name */
    private final int f42572b;

    /* renamed from: c  reason: collision with root package name */
    private final int f42573c;

    /* renamed from: d  reason: collision with root package name */
    private final String f42574d;

    /* renamed from: e  reason: collision with root package name */
    private final String f42575e;

    /* renamed from: f  reason: collision with root package name */
    private final String f42576f;

    /* renamed from: g  reason: collision with root package name */
    private final JSONObject f42577g;

    /* renamed from: h  reason: collision with root package name */
    private final JSONObject f42578h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f42579i;

    /* renamed from: j  reason: collision with root package name */
    private final HttpURLConnection f42580j;

    /* renamed from: k  reason: collision with root package name */
    private final String f42581k;

    /* renamed from: l  reason: collision with root package name */
    private C3459v f42582l;

    /* renamed from: m  reason: collision with root package name */
    private final a f42583m;

    /* renamed from: n  reason: collision with root package name */
    private final String f42584n;

    /* renamed from: com.facebook.y$a */
    public enum a {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    /* renamed from: com.facebook.y$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public C3462y createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "parcel");
            return new C3462y(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public C3462y[] newArray(int i10) {
            return new C3462y[i10];
        }
    }

    /* renamed from: com.facebook.y$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00ce A[Catch:{ JSONException -> 0x0123 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.facebook.C3462y a(org.json.JSONObject r20, java.lang.Object r21, java.net.HttpURLConnection r22) {
            /*
                r19 = this;
                r9 = r20
                java.lang.String r0 = "error_code"
                java.lang.String r1 = "error"
                java.lang.String r2 = "FACEBOOK_NON_JSON_RESULT"
                java.lang.String r3 = "body"
                java.lang.String r4 = "code"
                java.lang.String r5 = "singleResult"
                kotlin.jvm.internal.C6496s.h(r9, r5)
                r15 = 0
                boolean r5 = r9.has(r4)     // Catch:{ JSONException -> 0x0123 }
                if (r5 == 0) goto L_0x0123
                int r5 = r9.getInt(r4)     // Catch:{ JSONException -> 0x0123 }
                java.lang.Object r6 = o7.W.P(r9, r3, r2)     // Catch:{ JSONException -> 0x0123 }
                if (r6 == 0) goto L_0x00ef
                boolean r7 = r6 instanceof org.json.JSONObject     // Catch:{ JSONException -> 0x0123 }
                if (r7 == 0) goto L_0x00ef
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0123 }
                boolean r7 = r7.has(r1)     // Catch:{ JSONException -> 0x0123 }
                r8 = 1
                java.lang.String r10 = "error_subcode"
                r11 = 0
                r12 = -1
                if (r7 == 0) goto L_0x0082
                r0 = r6
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0123 }
                java.lang.Object r0 = o7.W.P(r0, r1, r15)     // Catch:{ JSONException -> 0x0123 }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0123 }
                if (r0 == 0) goto L_0x0046
                java.lang.String r1 = "type"
                java.lang.String r1 = r0.optString(r1, r15)     // Catch:{ JSONException -> 0x0123 }
                goto L_0x0047
            L_0x0046:
                r1 = r15
            L_0x0047:
                if (r0 == 0) goto L_0x0050
                java.lang.String r7 = "message"
                java.lang.String r7 = r0.optString(r7, r15)     // Catch:{ JSONException -> 0x0123 }
                goto L_0x0051
            L_0x0050:
                r7 = r15
            L_0x0051:
                if (r0 == 0) goto L_0x0058
                int r4 = r0.optInt(r4, r12)     // Catch:{ JSONException -> 0x0123 }
                goto L_0x0059
            L_0x0058:
                r4 = r12
            L_0x0059:
                if (r0 == 0) goto L_0x005f
                int r12 = r0.optInt(r10, r12)     // Catch:{ JSONException -> 0x0123 }
            L_0x005f:
                if (r0 == 0) goto L_0x0068
                java.lang.String r10 = "error_user_msg"
                java.lang.String r10 = r0.optString(r10, r15)     // Catch:{ JSONException -> 0x0123 }
                goto L_0x0069
            L_0x0068:
                r10 = r15
            L_0x0069:
                if (r0 == 0) goto L_0x0072
                java.lang.String r13 = "error_user_title"
                java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ JSONException -> 0x0123 }
                goto L_0x0073
            L_0x0072:
                r13 = r15
            L_0x0073:
                if (r0 == 0) goto L_0x007b
                java.lang.String r14 = "is_transient"
                boolean r11 = r0.optBoolean(r14, r11)     // Catch:{ JSONException -> 0x0123 }
            L_0x007b:
                r14 = r11
                r11 = r8
                r8 = r7
                r7 = r12
                r12 = r4
            L_0x0080:
                r4 = r1
                goto L_0x00cc
            L_0x0082:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0123 }
                boolean r1 = r1.has(r0)     // Catch:{ JSONException -> 0x0123 }
                java.lang.String r4 = "error_reason"
                java.lang.String r7 = "error_msg"
                if (r1 != 0) goto L_0x00a9
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0123 }
                boolean r1 = r1.has(r7)     // Catch:{ JSONException -> 0x0123 }
                if (r1 != 0) goto L_0x00a9
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0123 }
                boolean r1 = r1.has(r4)     // Catch:{ JSONException -> 0x0123 }
                if (r1 == 0) goto L_0x00a2
                goto L_0x00a9
            L_0x00a2:
                r14 = r11
                r7 = r12
                r4 = r15
                r8 = r4
                r10 = r8
                r13 = r10
                goto L_0x00cc
            L_0x00a9:
                r1 = r6
                org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch:{ JSONException -> 0x0123 }
                java.lang.String r1 = r1.optString(r4, r15)     // Catch:{ JSONException -> 0x0123 }
                r4 = r6
                org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ JSONException -> 0x0123 }
                java.lang.String r4 = r4.optString(r7, r15)     // Catch:{ JSONException -> 0x0123 }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0123 }
                int r0 = r7.optInt(r0, r12)     // Catch:{ JSONException -> 0x0123 }
                r7 = r6
                org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ JSONException -> 0x0123 }
                int r7 = r7.optInt(r10, r12)     // Catch:{ JSONException -> 0x0123 }
                r12 = r0
                r14 = r11
                r10 = r15
                r13 = r10
                r11 = r8
                r8 = r4
                goto L_0x0080
            L_0x00cc:
                if (r11 == 0) goto L_0x00ef
                com.facebook.y r16 = new com.facebook.y     // Catch:{ JSONException -> 0x0123 }
                r11 = r6
                org.json.JSONObject r11 = (org.json.JSONObject) r11     // Catch:{ JSONException -> 0x0123 }
                r17 = 0
                r18 = 0
                r0 = r16
                r1 = r5
                r2 = r12
                r3 = r7
                r5 = r8
                r6 = r13
                r7 = r10
                r8 = r11
                r9 = r20
                r10 = r21
                r11 = r22
                r12 = r17
                r13 = r14
                r14 = r18
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0123 }
                return r16
            L_0x00ef:
                com.facebook.y$d r0 = r19.c()     // Catch:{ JSONException -> 0x0123 }
                boolean r0 = r0.a(r5)     // Catch:{ JSONException -> 0x0123 }
                if (r0 != 0) goto L_0x0123
                com.facebook.y r16 = new com.facebook.y     // Catch:{ JSONException -> 0x0123 }
                boolean r0 = r9.has(r3)     // Catch:{ JSONException -> 0x0123 }
                if (r0 == 0) goto L_0x0109
                java.lang.Object r0 = o7.W.P(r9, r3, r2)     // Catch:{ JSONException -> 0x0123 }
                org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0123 }
                r8 = r0
                goto L_0x010a
            L_0x0109:
                r8 = r15
            L_0x010a:
                r13 = 0
                r14 = 0
                r2 = -1
                r3 = -1
                r4 = 0
                r6 = 0
                r7 = 0
                r10 = 0
                r12 = 0
                r0 = r16
                r1 = r5
                r5 = r6
                r6 = r7
                r7 = r10
                r9 = r20
                r10 = r21
                r11 = r22
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x0123 }
                return r16
            L_0x0123:
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3462y.c.a(org.json.JSONObject, java.lang.Object, java.net.HttpURLConnection):com.facebook.y");
        }

        public final synchronized C3899o b() {
            C3906w f10 = C3884A.f(I.m());
            if (f10 == null) {
                return C3899o.f47275g.b();
            }
            return f10.h();
        }

        public final d c() {
            return C3462y.f42570p;
        }

        private c() {
        }
    }

    /* renamed from: com.facebook.y$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final int f42589a;

        /* renamed from: b  reason: collision with root package name */
        private final int f42590b;

        public d(int i10, int i11) {
            this.f42589a = i10;
            this.f42590b = i11;
        }

        public final boolean a(int i10) {
            int i11 = this.f42589a;
            if (i10 > this.f42590b || i11 > i10) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ C3462y(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C3459v vVar, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, str, str2, str3, str4, jSONObject, jSONObject2, obj, httpURLConnection, vVar, z10);
    }

    public final Object b() {
        return this.f42579i;
    }

    public final int c() {
        return this.f42572b;
    }

    public final String d() {
        String str = this.f42581k;
        if (str != null) {
            return str;
        }
        C3459v vVar = this.f42582l;
        if (vVar != null) {
            return vVar.getLocalizedMessage();
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f42574d;
    }

    public final String f() {
        return this.f42576f;
    }

    public final String g() {
        return this.f42575e;
    }

    public final C3459v h() {
        return this.f42582l;
    }

    public final JSONObject i() {
        return this.f42578h;
    }

    public final JSONObject j() {
        return this.f42577g;
    }

    public final int k() {
        return this.f42571a;
    }

    public final int l() {
        return this.f42573c;
    }

    public String toString() {
        String str = "{HttpStatus: " + this.f42571a + ", errorCode: " + this.f42572b + ", subErrorCode: " + this.f42573c + ", errorType: " + this.f42574d + ", errorMessage: " + d() + "}";
        C6496s.g(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "out");
        parcel.writeInt(this.f42571a);
        parcel.writeInt(this.f42572b);
        parcel.writeInt(this.f42573c);
        parcel.writeString(this.f42574d);
        parcel.writeString(d());
        parcel.writeString(this.f42575e);
        parcel.writeString(this.f42576f);
    }

    public /* synthetic */ C3462y(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private C3462y(int i10, int i11, int i12, String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, C3459v vVar, boolean z10) {
        a aVar;
        this.f42571a = i10;
        this.f42572b = i11;
        this.f42573c = i12;
        this.f42574d = str;
        this.f42575e = str3;
        this.f42576f = str4;
        this.f42577g = jSONObject;
        this.f42578h = jSONObject2;
        this.f42579i = obj;
        this.f42580j = httpURLConnection;
        this.f42581k = str2;
        if (vVar != null) {
            this.f42582l = vVar;
            aVar = a.OTHER;
        } else {
            this.f42582l = new K(this, d());
            aVar = f42569o.b().c(i11, i12, z10);
        }
        this.f42583m = aVar;
        this.f42584n = f42569o.b().d(aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3462y(java.net.HttpURLConnection r17, java.lang.Exception r18) {
        /*
            r16 = this;
            r0 = r18
            boolean r1 = r0 instanceof com.facebook.C3459v
            if (r1 == 0) goto L_0x000a
            com.facebook.v r0 = (com.facebook.C3459v) r0
            r14 = r0
            goto L_0x0010
        L_0x000a:
            com.facebook.v r1 = new com.facebook.v
            r1.<init>((java.lang.Throwable) r0)
            r14 = r1
        L_0x0010:
            r15 = 0
            r3 = -1
            r4 = -1
            r5 = -1
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = r16
            r13 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3462y.<init>(java.net.HttpURLConnection, java.lang.Exception):void");
    }

    public C3462y(int i10, String str, String str2) {
        this(-1, i10, -1, str, str2, (String) null, (String) null, (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (C3459v) null, false);
    }

    private C3462y(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JSONObject) null, (JSONObject) null, (Object) null, (HttpURLConnection) null, (C3459v) null, false);
    }
}
