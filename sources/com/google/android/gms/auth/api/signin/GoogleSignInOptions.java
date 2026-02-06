package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ua.C5222e;
import va.C5242a;
import va.C5243b;
import za.C5298a;
import za.c;

@Deprecated
public class GoogleSignInOptions extends C5298a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new e();

    /* renamed from: l  reason: collision with root package name */
    public static final GoogleSignInOptions f53847l;

    /* renamed from: m  reason: collision with root package name */
    public static final GoogleSignInOptions f53848m;

    /* renamed from: n  reason: collision with root package name */
    public static final Scope f53849n = new Scope("profile");

    /* renamed from: o  reason: collision with root package name */
    public static final Scope f53850o = new Scope("email");

    /* renamed from: p  reason: collision with root package name */
    public static final Scope f53851p = new Scope("openid");

    /* renamed from: q  reason: collision with root package name */
    public static final Scope f53852q;

    /* renamed from: r  reason: collision with root package name */
    public static final Scope f53853r = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: s  reason: collision with root package name */
    private static final Comparator f53854s = new d();

    /* renamed from: a  reason: collision with root package name */
    final int f53855a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f53856b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Account f53857c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f53858d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final boolean f53859e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final boolean f53860f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public String f53861g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f53862h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f53863i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f53864j;

    /* renamed from: k  reason: collision with root package name */
    private Map f53865k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f53852q = scope;
        a aVar = new a();
        aVar.b();
        aVar.d();
        f53847l = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        f53848m = aVar2.a();
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, C5222e eVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    /* access modifiers changed from: private */
    public static Map I0(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C5242a aVar = (C5242a) it.next();
                hashMap.put(Integer.valueOf(aVar.o0()), aVar);
            }
        }
        return hashMap;
    }

    public static GoogleSignInOptions x0(String str) {
        String str2;
        Account account;
        String str3;
        String str4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        if (jSONObject.has("accountName")) {
            str2 = jSONObject.optString("accountName");
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            account = new Account(str2, "com.google");
        } else {
            account = null;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        if (jSONObject.has("serverClientId")) {
            str3 = jSONObject.optString("serverClientId");
        } else {
            str3 = null;
        }
        if (jSONObject.has("hostedDomain")) {
            str4 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, str3, str4, (Map) new HashMap(), (String) null);
    }

    public final String B0() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f53856b, f53854s);
            Iterator it = this.f53856b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).o0());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f53857c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f53858d);
            jSONObject.put("forceCodeForRefreshToken", this.f53860f);
            jSONObject.put("serverAuthRequested", this.f53859e);
            if (!TextUtils.isEmpty(this.f53861g)) {
                jSONObject.put("serverClientId", this.f53861g);
            }
            if (!TextUtils.isEmpty(this.f53862h)) {
                jSONObject.put("hostedDomain", this.f53862h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.o0()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f53863i     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f53863i     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.isEmpty()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f53856b     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.r0()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f53856b     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.r0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f53857c     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.o0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.o0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f53861g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.s0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f53861g     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.s0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f53860f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.t0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f53858d     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.u0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f53859e     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.v0()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f53864j     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.q0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f53856b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).o0());
        }
        Collections.sort(arrayList);
        C5243b bVar = new C5243b();
        bVar.a(arrayList);
        bVar.a(this.f53857c);
        bVar.a(this.f53861g);
        bVar.c(this.f53860f);
        bVar.c(this.f53858d);
        bVar.c(this.f53859e);
        bVar.a(this.f53864j);
        return bVar.b();
    }

    public Account o0() {
        return this.f53857c;
    }

    public ArrayList p0() {
        return this.f53863i;
    }

    public String q0() {
        return this.f53864j;
    }

    public ArrayList r0() {
        return new ArrayList(this.f53856b);
    }

    public String s0() {
        return this.f53861g;
    }

    public boolean t0() {
        return this.f53860f;
    }

    public boolean u0() {
        return this.f53858d;
    }

    public boolean v0() {
        return this.f53859e;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f53855a;
        int a10 = c.a(parcel);
        c.t(parcel, 1, i11);
        c.H(parcel, 2, r0(), false);
        c.B(parcel, 3, o0(), i10, false);
        c.g(parcel, 4, u0());
        c.g(parcel, 5, v0());
        c.g(parcel, 6, t0());
        c.D(parcel, 7, s0(), false);
        c.D(parcel, 8, this.f53862h, false);
        c.H(parcel, 9, p0(), false);
        c.D(parcel, 10, q0(), false);
        c.b(parcel, a10);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Set f53866a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        private boolean f53867b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f53868c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f53869d;

        /* renamed from: e  reason: collision with root package name */
        private String f53870e;

        /* renamed from: f  reason: collision with root package name */
        private Account f53871f;

        /* renamed from: g  reason: collision with root package name */
        private String f53872g;

        /* renamed from: h  reason: collision with root package name */
        private Map f53873h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private String f53874i;

        public a() {
        }

        private final String j(String str) {
            C4536s.f(str);
            String str2 = this.f53870e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            C4536s.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f53866a.contains(GoogleSignInOptions.f53853r)) {
                Set set = this.f53866a;
                Scope scope = GoogleSignInOptions.f53852q;
                if (set.contains(scope)) {
                    this.f53866a.remove(scope);
                }
            }
            if (this.f53869d && (this.f53871f == null || !this.f53866a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f53866a), this.f53871f, this.f53869d, this.f53867b, this.f53868c, this.f53870e, this.f53872g, this.f53873h, this.f53874i, (C5222e) null);
        }

        public a b() {
            this.f53866a.add(GoogleSignInOptions.f53851p);
            return this;
        }

        public a c(String str) {
            this.f53869d = true;
            j(str);
            this.f53870e = str;
            return this;
        }

        public a d() {
            this.f53866a.add(GoogleSignInOptions.f53849n);
            return this;
        }

        public a e(Scope scope, Scope... scopeArr) {
            this.f53866a.add(scope);
            this.f53866a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a f(String str, boolean z10) {
            this.f53867b = true;
            j(str);
            this.f53870e = str;
            this.f53868c = z10;
            return this;
        }

        public a g(String str) {
            this.f53871f = new Account(C4536s.f(str), "com.google");
            return this;
        }

        public a h(String str) {
            this.f53872g = C4536s.f(str);
            return this;
        }

        public a i(String str) {
            this.f53874i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            C4536s.l(googleSignInOptions);
            this.f53866a = new HashSet(googleSignInOptions.f53856b);
            this.f53867b = googleSignInOptions.f53859e;
            this.f53868c = googleSignInOptions.f53860f;
            this.f53869d = googleSignInOptions.f53858d;
            this.f53870e = googleSignInOptions.f53861g;
            this.f53871f = googleSignInOptions.f53857c;
            this.f53872g = googleSignInOptions.f53862h;
            this.f53873h = GoogleSignInOptions.I0(googleSignInOptions.f53863i);
            this.f53874i = googleSignInOptions.f53864j;
        }
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, I0(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f53855a = i10;
        this.f53856b = arrayList;
        this.f53857c = account;
        this.f53858d = z10;
        this.f53859e = z11;
        this.f53860f = z12;
        this.f53861g = str;
        this.f53862h = str2;
        this.f53863i = new ArrayList(map.values());
        this.f53865k = map;
        this.f53864j = str3;
    }
}
