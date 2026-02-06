package com.facebook;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.U;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import o7.W;
import o7.X;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a  reason: case insensitive filesystem */
public final class C3286a implements Parcelable {
    public static final Parcelable.Creator<C3286a> CREATOR = new b();

    /* renamed from: l  reason: collision with root package name */
    public static final c f39402l = new c((DefaultConstructorMarker) null);

    /* renamed from: m  reason: collision with root package name */
    private static final Date f39403m;

    /* renamed from: n  reason: collision with root package name */
    private static final Date f39404n;

    /* renamed from: o  reason: collision with root package name */
    private static final Date f39405o = new Date();

    /* renamed from: p  reason: collision with root package name */
    private static final C3293h f39406p = C3293h.FACEBOOK_APPLICATION_WEB;

    /* renamed from: a  reason: collision with root package name */
    private final Date f39407a;

    /* renamed from: b  reason: collision with root package name */
    private final Set f39408b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f39409c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f39410d;

    /* renamed from: e  reason: collision with root package name */
    private final String f39411e;

    /* renamed from: f  reason: collision with root package name */
    private final C3293h f39412f;

    /* renamed from: g  reason: collision with root package name */
    private final Date f39413g;

    /* renamed from: h  reason: collision with root package name */
    private final String f39414h;

    /* renamed from: i  reason: collision with root package name */
    private final String f39415i;

    /* renamed from: j  reason: collision with root package name */
    private final Date f39416j;

    /* renamed from: k  reason: collision with root package name */
    private final String f39417k;

    /* renamed from: com.facebook.a$a  reason: collision with other inner class name */
    public interface C0623a {
        void a(C3459v vVar);

        void b(C3286a aVar);
    }

    /* renamed from: com.facebook.a$b */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        /* renamed from: a */
        public C3286a createFromParcel(Parcel parcel) {
            C6496s.h(parcel, "source");
            return new C3286a(parcel);
        }

        /* renamed from: b */
        public C3286a[] newArray(int i10) {
            return new C3286a[i10];
        }
    }

    /* renamed from: com.facebook.a$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3286a a(C3286a aVar) {
            C6496s.h(aVar, "current");
            return new C3286a(aVar.n(), aVar.c(), aVar.o(), aVar.k(), aVar.f(), aVar.g(), aVar.l(), new Date(), new Date(), aVar.e(), (String) null, 1024, (DefaultConstructorMarker) null);
        }

        public final C3286a b(JSONObject jSONObject) {
            Collection collection;
            C6496s.h(jSONObject, "jsonObject");
            if (jSONObject.getInt(DiagnosticsEntry.VERSION_KEY) <= 1) {
                String string = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string2 = jSONObject.getString("source");
                C6496s.g(string2, "jsonObject.getString(SOURCE_KEY)");
                C3293h valueOf = C3293h.valueOf(string2);
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                String optString = jSONObject.optString("graph_domain", (String) null);
                C6496s.g(string, "token");
                C6496s.g(string3, "applicationId");
                C6496s.g(string4, "userId");
                C6496s.g(jSONArray, "permissionsArray");
                Collection i02 = W.i0(jSONArray);
                C6496s.g(jSONArray2, "declinedPermissionsArray");
                Collection i03 = W.i0(jSONArray2);
                if (optJSONArray == null) {
                    collection = new ArrayList();
                } else {
                    collection = W.i0(optJSONArray);
                }
                return new C3286a(string, string3, string4, i02, i03, collection, valueOf, date, date2, date3, optString);
            }
            throw new C3459v("Unknown AccessToken serialization format.");
        }

        public final C3286a c(Bundle bundle) {
            String str;
            Bundle bundle2 = bundle;
            C6496s.h(bundle2, "bundle");
            List f10 = f(bundle2, "com.facebook.TokenCachingStrategy.Permissions");
            List f11 = f(bundle2, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List f12 = f(bundle2, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            U.a aVar = U.f39369c;
            String a10 = aVar.a(bundle2);
            if (W.e0(a10)) {
                a10 = I.m();
            }
            String str2 = a10;
            String f13 = aVar.f(bundle2);
            if (f13 == null) {
                return null;
            }
            JSONObject f14 = W.f(f13);
            if (f14 != null) {
                try {
                    str = f14.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                str = null;
            }
            if (str2 == null || str == null) {
                return null;
            }
            return new C3286a(f13, str2, str, f10, f11, f12, aVar.e(bundle2), aVar.c(bundle2), aVar.d(bundle2), (Date) null, (String) null, 1024, (DefaultConstructorMarker) null);
        }

        public final void d() {
            C3286a i10 = C3292g.f39489f.e().i();
            if (i10 != null) {
                i(a(i10));
            }
        }

        public final C3286a e() {
            return C3292g.f39489f.e().i();
        }

        public final List f(Bundle bundle, String str) {
            C6496s.h(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList == null) {
                return C6565s.n();
            }
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
            C6496s.g(unmodifiableList, "{\n            Collection…Permissions))\n          }");
            return unmodifiableList;
        }

        public final boolean g() {
            C3286a i10 = C3292g.f39489f.e().i();
            if (i10 == null || i10.p()) {
                return false;
            }
            return true;
        }

        public final void h(C0623a aVar) {
            C3292g.f39489f.e().k(aVar);
        }

        public final void i(C3286a aVar) {
            C3292g.f39489f.e().r(aVar);
        }

        private c() {
        }
    }

    /* renamed from: com.facebook.a$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39418a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.facebook.h[] r0 = com.facebook.C3293h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.facebook.h r1 = com.facebook.C3293h.FACEBOOK_APPLICATION_WEB     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.facebook.h r1 = com.facebook.C3293h.CHROME_CUSTOM_TAB     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.facebook.h r1 = com.facebook.C3293h.WEB_VIEW     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f39418a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3286a.d.<clinit>():void");
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f39403m = date;
        f39404n = date;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3286a(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.util.Collection r19, java.util.Collection r20, java.util.Collection r21, com.facebook.C3293h r22, java.util.Date r23, java.util.Date r24, java.util.Date r25) {
        /*
            r15 = this;
            java.lang.String r0 = "accessToken"
            r2 = r16
            kotlin.jvm.internal.C6496s.h(r2, r0)
            java.lang.String r0 = "applicationId"
            r3 = r17
            kotlin.jvm.internal.C6496s.h(r3, r0)
            java.lang.String r0 = "userId"
            r4 = r18
            kotlin.jvm.internal.C6496s.h(r4, r0)
            r13 = 1024(0x400, float:1.435E-42)
            r14 = 0
            r12 = 0
            r1 = r15
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3286a.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Collection, java.util.Collection, java.util.Collection, com.facebook.h, java.util.Date, java.util.Date, java.util.Date):void");
    }

    private final void a(StringBuilder sb2) {
        sb2.append(" permissions:");
        sb2.append("[");
        sb2.append(TextUtils.join(", ", this.f39408b));
        sb2.append("]");
    }

    private final C3293h b(C3293h hVar, String str) {
        if (str == null || !str.equals("instagram")) {
            return hVar;
        }
        int i10 = d.f39418a[hVar.ordinal()];
        if (i10 == 1) {
            return C3293h.INSTAGRAM_APPLICATION_WEB;
        }
        if (i10 == 2) {
            return C3293h.INSTAGRAM_CUSTOM_CHROME_TAB;
        }
        if (i10 != 3) {
            return hVar;
        }
        return C3293h.INSTAGRAM_WEB_VIEW;
    }

    public static final C3286a d() {
        return f39402l.e();
    }

    public static final void q(C0623a aVar) {
        f39402l.h(aVar);
    }

    public static final void s(C3286a aVar) {
        f39402l.i(aVar);
    }

    private final String v() {
        if (I.I(V.INCLUDE_ACCESS_TOKENS)) {
            return this.f39411e;
        }
        return "ACCESS_TOKEN_REMOVED";
    }

    public final String c() {
        return this.f39414h;
    }

    public int describeContents() {
        return 0;
    }

    public final Date e() {
        return this.f39416j;
    }

    public boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3286a)) {
            return false;
        }
        C3286a aVar = (C3286a) obj;
        if (C6496s.c(this.f39407a, aVar.f39407a) && C6496s.c(this.f39408b, aVar.f39408b) && C6496s.c(this.f39409c, aVar.f39409c) && C6496s.c(this.f39410d, aVar.f39410d) && C6496s.c(this.f39411e, aVar.f39411e) && this.f39412f == aVar.f39412f && C6496s.c(this.f39413g, aVar.f39413g) && C6496s.c(this.f39414h, aVar.f39414h) && C6496s.c(this.f39415i, aVar.f39415i) && C6496s.c(this.f39416j, aVar.f39416j)) {
            String str = this.f39417k;
            String str2 = aVar.f39417k;
            if (str != null) {
                z10 = C6496s.c(str, str2);
            } else if (str2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final Set f() {
        return this.f39409c;
    }

    public final Set g() {
        return this.f39410d;
    }

    public final Date h() {
        return this.f39407a;
    }

    public int hashCode() {
        int i10;
        int hashCode = (((((((((((((((((((527 + this.f39407a.hashCode()) * 31) + this.f39408b.hashCode()) * 31) + this.f39409c.hashCode()) * 31) + this.f39410d.hashCode()) * 31) + this.f39411e.hashCode()) * 31) + this.f39412f.hashCode()) * 31) + this.f39413g.hashCode()) * 31) + this.f39414h.hashCode()) * 31) + this.f39415i.hashCode()) * 31) + this.f39416j.hashCode()) * 31;
        String str = this.f39417k;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String i() {
        return this.f39417k;
    }

    public final Date j() {
        return this.f39413g;
    }

    public final Set k() {
        return this.f39408b;
    }

    public final C3293h l() {
        return this.f39412f;
    }

    public final String n() {
        return this.f39411e;
    }

    public final String o() {
        return this.f39415i;
    }

    public final boolean p() {
        return new Date().after(this.f39407a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{AccessToken");
        sb2.append(" token:");
        sb2.append(v());
        a(sb2);
        sb2.append("}");
        String sb3 = sb2.toString();
        C6496s.g(sb3, "builder.toString()");
        return sb3;
    }

    public final JSONObject u() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DiagnosticsEntry.VERSION_KEY, 1);
        jSONObject.put("token", this.f39411e);
        jSONObject.put("expires_at", this.f39407a.getTime());
        jSONObject.put("permissions", new JSONArray(this.f39408b));
        jSONObject.put("declined_permissions", new JSONArray(this.f39409c));
        jSONObject.put("expired_permissions", new JSONArray(this.f39410d));
        jSONObject.put("last_refresh", this.f39413g.getTime());
        jSONObject.put("source", this.f39412f.name());
        jSONObject.put("application_id", this.f39414h);
        jSONObject.put("user_id", this.f39415i);
        jSONObject.put("data_access_expiration_time", this.f39416j.getTime());
        String str = this.f39417k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C6496s.h(parcel, "dest");
        parcel.writeLong(this.f39407a.getTime());
        parcel.writeStringList(new ArrayList(this.f39408b));
        parcel.writeStringList(new ArrayList(this.f39409c));
        parcel.writeStringList(new ArrayList(this.f39410d));
        parcel.writeString(this.f39411e);
        parcel.writeString(this.f39412f.name());
        parcel.writeLong(this.f39413g.getTime());
        parcel.writeString(this.f39414h);
        parcel.writeString(this.f39415i);
        parcel.writeLong(this.f39416j.getTime());
        parcel.writeString(this.f39417k);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3286a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C3293h hVar, Date date, Date date2, Date date3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, hVar, date, date2, date3, (i10 & 1024) != 0 ? "facebook" : str4);
    }

    public C3286a(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, C3293h hVar, Date date, Date date2, Date date3, String str4) {
        HashSet hashSet;
        HashSet hashSet2;
        HashSet hashSet3;
        C6496s.h(str, "accessToken");
        C6496s.h(str2, "applicationId");
        C6496s.h(str3, "userId");
        X.j(str, "accessToken");
        X.j(str2, "applicationId");
        X.j(str3, "userId");
        this.f39407a = date == null ? f39404n : date;
        if (collection == null) {
            hashSet = new HashSet();
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C6496s.g(unmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.f39408b = unmodifiableSet;
        if (collection2 == null) {
            hashSet2 = new HashSet();
        }
        Set unmodifiableSet2 = Collections.unmodifiableSet(hashSet2);
        C6496s.g(unmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f39409c = unmodifiableSet2;
        if (collection3 == null) {
            hashSet3 = new HashSet();
        }
        Set unmodifiableSet3 = Collections.unmodifiableSet(hashSet3);
        C6496s.g(unmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f39410d = unmodifiableSet3;
        this.f39411e = str;
        this.f39412f = b(hVar == null ? f39406p : hVar, str4);
        this.f39413g = date2 == null ? f39405o : date2;
        this.f39414h = str2;
        this.f39415i = str3;
        this.f39416j = (date3 == null || date3.getTime() == 0) ? f39404n : date3;
        this.f39417k = str4 == null ? "facebook" : str4;
    }

    public C3286a(Parcel parcel) {
        C3293h hVar;
        C6496s.h(parcel, "parcel");
        this.f39407a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        C6496s.g(unmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f39408b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        C6496s.g(unmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f39409c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        C6496s.g(unmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f39410d = unmodifiableSet3;
        this.f39411e = X.n(parcel.readString(), "token");
        String readString = parcel.readString();
        if (readString != null) {
            hVar = C3293h.valueOf(readString);
        } else {
            hVar = f39406p;
        }
        this.f39412f = hVar;
        this.f39413g = new Date(parcel.readLong());
        this.f39414h = X.n(parcel.readString(), "applicationId");
        this.f39415i = X.n(parcel.readString(), "userId");
        this.f39416j = new Date(parcel.readLong());
        this.f39417k = parcel.readString();
    }
}
