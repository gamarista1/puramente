package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.C3286a;
import com.facebook.M;
import d2.C1926a;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.g  reason: case insensitive filesystem */
public final class C3292g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f39489f = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static C3292g f39490g;

    /* renamed from: a  reason: collision with root package name */
    private final C1926a f39491a;

    /* renamed from: b  reason: collision with root package name */
    private final C3287b f39492b;

    /* renamed from: c  reason: collision with root package name */
    private C3286a f39493c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f39494d = new AtomicBoolean(false);

    /* renamed from: e  reason: collision with root package name */
    private Date f39495e = new Date(0);

    /* renamed from: com.facebook.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final M c(C3286a aVar, M.b bVar) {
            e f10 = f(aVar);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", f10.a());
            bundle.putString("client_id", aVar.c());
            bundle.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            M x10 = M.f39311n.x(aVar, f10.b(), bVar);
            x10.J(bundle);
            x10.I(T.GET);
            return x10;
        }

        /* access modifiers changed from: private */
        public final M d(C3286a aVar, M.b bVar) {
            Bundle bundle = new Bundle();
            bundle.putString("fields", "permission,status");
            M x10 = M.f39311n.x(aVar, "me/permissions", bVar);
            x10.J(bundle);
            x10.I(T.GET);
            return x10;
        }

        private final e f(C3286a aVar) {
            String i10 = aVar.i();
            if (i10 == null) {
                i10 = "facebook";
            }
            if (C6496s.c(i10, "instagram")) {
                return new c();
            }
            return new b();
        }

        public final C3292g e() {
            C3292g e10;
            C3292g e11 = C3292g.f39490g;
            if (e11 != null) {
                return e11;
            }
            synchronized (this) {
                e10 = C3292g.f39490g;
                if (e10 == null) {
                    C1926a b10 = C1926a.b(I.l());
                    C6496s.g(b10, "getInstance(applicationContext)");
                    C3292g gVar = new C3292g(b10, new C3287b());
                    C3292g.f39490g = gVar;
                    e10 = gVar;
                }
            }
            return e10;
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.g$b */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f39496a = "oauth/access_token";

        /* renamed from: b  reason: collision with root package name */
        private final String f39497b = "fb_extend_sso_token";

        public String a() {
            return this.f39497b;
        }

        public String b() {
            return this.f39496a;
        }
    }

    /* renamed from: com.facebook.g$c */
    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final String f39498a = "refresh_access_token";

        /* renamed from: b  reason: collision with root package name */
        private final String f39499b = "ig_refresh_token";

        public String a() {
            return this.f39499b;
        }

        public String b() {
            return this.f39498a;
        }
    }

    /* renamed from: com.facebook.g$d */
    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        private String f39500a;

        /* renamed from: b  reason: collision with root package name */
        private int f39501b;

        /* renamed from: c  reason: collision with root package name */
        private int f39502c;

        /* renamed from: d  reason: collision with root package name */
        private Long f39503d;

        /* renamed from: e  reason: collision with root package name */
        private String f39504e;

        public final String a() {
            return this.f39500a;
        }

        public final Long b() {
            return this.f39503d;
        }

        public final int c() {
            return this.f39501b;
        }

        public final int d() {
            return this.f39502c;
        }

        public final String e() {
            return this.f39504e;
        }

        public final void f(String str) {
            this.f39500a = str;
        }

        public final void g(Long l10) {
            this.f39503d = l10;
        }

        public final void h(int i10) {
            this.f39501b = i10;
        }

        public final void i(int i10) {
            this.f39502c = i10;
        }

        public final void j(String str) {
            this.f39504e = str;
        }
    }

    /* renamed from: com.facebook.g$e */
    public interface e {
        String a();

        String b();
    }

    public C3292g(C1926a aVar, C3287b bVar) {
        C6496s.h(aVar, "localBroadcastManager");
        C6496s.h(bVar, "accessTokenCache");
        this.f39491a = aVar;
        this.f39492b = bVar;
    }

    /* access modifiers changed from: private */
    public static final void l(C3292g gVar, C3286a.C0623a aVar) {
        C6496s.h(gVar, "this$0");
        gVar.m(aVar);
    }

    private final void m(C3286a.C0623a aVar) {
        C3286a i10 = i();
        if (i10 == null) {
            if (aVar != null) {
                aVar.a(new C3459v("No current access token to refresh"));
            }
        } else if (this.f39494d.compareAndSet(false, true)) {
            this.f39495e = new Date();
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            d dVar = new d();
            a aVar2 = f39489f;
            Q q10 = new Q(aVar2.d(i10, new C3289d(atomicBoolean, hashSet, hashSet2, hashSet3)), aVar2.c(i10, new C3290e(dVar)));
            q10.d(new C3291f(dVar, i10, aVar, atomicBoolean, hashSet, hashSet2, hashSet3, this));
            q10.m();
        } else if (aVar != null) {
            aVar.a(new C3459v("Refresh already in progress"));
        }
    }

    /* access modifiers changed from: private */
    public static final void n(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, S s10) {
        JSONArray optJSONArray;
        C6496s.h(atomicBoolean, "$permissionsCallSucceeded");
        C6496s.h(set, "$permissions");
        C6496s.h(set2, "$declinedPermissions");
        C6496s.h(set3, "$expiredPermissions");
        C6496s.h(s10, "response");
        JSONObject d10 = s10.d();
        if (d10 != null && (optJSONArray = d10.optJSONArray("data")) != null) {
            atomicBoolean.set(true);
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("permission");
                    String optString2 = optJSONObject.optString("status");
                    if (!W.e0(optString) && !W.e0(optString2)) {
                        C6496s.g(optString2, "status");
                        Locale locale = Locale.US;
                        C6496s.g(locale, "US");
                        String lowerCase = optString2.toLowerCase(locale);
                        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        C6496s.g(lowerCase, "status");
                        int hashCode = lowerCase.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && lowerCase.equals("declined")) {
                                    set2.add(optString);
                                }
                            } else if (lowerCase.equals("granted")) {
                                set.add(optString);
                            }
                        } else if (lowerCase.equals("expired")) {
                            set3.add(optString);
                        }
                        Log.w("AccessTokenManager", "Unexpected status: " + lowerCase);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static final void o(d dVar, S s10) {
        C6496s.h(dVar, "$refreshResult");
        C6496s.h(s10, "response");
        JSONObject d10 = s10.d();
        if (d10 != null) {
            dVar.f(d10.optString("access_token"));
            dVar.h(d10.optInt("expires_at"));
            dVar.i(d10.optInt("expires_in"));
            dVar.g(Long.valueOf(d10.optLong("data_access_expiration_time")));
            dVar.j(d10.optString("graph_domain", (String) null));
        }
    }

    /* access modifiers changed from: private */
    public static final void p(d dVar, C3286a aVar, C3286a.C0623a aVar2, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3, C3292g gVar, Q q10) {
        C3286a aVar3;
        boolean z10;
        String str;
        Set set4;
        Set set5;
        Date e10;
        C3286a.C0623a aVar4 = aVar2;
        C3292g gVar2 = gVar;
        C6496s.h(dVar, "$refreshResult");
        C6496s.h(atomicBoolean, "$permissionsCallSucceeded");
        Set set6 = set;
        C6496s.h(set6, "$permissions");
        Set set7 = set2;
        C6496s.h(set7, "$declinedPermissions");
        Set set8 = set3;
        C6496s.h(set8, "$expiredPermissions");
        C6496s.h(gVar2, "this$0");
        C6496s.h(q10, "it");
        String a10 = dVar.a();
        int c10 = dVar.c();
        Long b10 = dVar.b();
        String e11 = dVar.e();
        try {
            a aVar5 = f39489f;
            if (aVar5.e().i() != null) {
                C3286a i10 = aVar5.e().i();
                if (i10 != null) {
                    str = i10.o();
                } else {
                    str = null;
                }
                try {
                    if (str == aVar.o()) {
                        if (!atomicBoolean.get() && a10 == null && c10 == 0) {
                            if (aVar4 != null) {
                                aVar4.a(new C3459v("Failed to refresh access token"));
                            }
                            gVar2.f39494d.set(false);
                            return;
                        }
                        Date h10 = aVar.h();
                        if (dVar.c() != 0) {
                            h10 = new Date(((long) dVar.c()) * 1000);
                        } else if (dVar.d() != 0) {
                            h10 = new Date((((long) dVar.d()) * 1000) + new Date().getTime());
                        }
                        Date date = h10;
                        if (a10 == null) {
                            a10 = aVar.n();
                        }
                        String str2 = a10;
                        String c11 = aVar.c();
                        String o10 = aVar.o();
                        if (atomicBoolean.get()) {
                            set4 = set6;
                        } else {
                            set4 = aVar.k();
                        }
                        Collection collection = set4;
                        if (atomicBoolean.get()) {
                            set5 = set7;
                        } else {
                            set5 = aVar.f();
                        }
                        Collection collection2 = set5;
                        if (!atomicBoolean.get()) {
                            set8 = aVar.g();
                        }
                        Collection collection3 = set8;
                        C3293h l10 = aVar.l();
                        Date date2 = new Date();
                        if (b10 != null) {
                            e10 = new Date(b10.longValue() * 1000);
                        } else {
                            e10 = aVar.e();
                        }
                        Date date3 = e10;
                        if (e11 == null) {
                            e11 = aVar.i();
                        }
                        C3286a aVar6 = new C3286a(str2, c11, o10, collection, collection2, collection3, l10, date, date2, date3, e11);
                        try {
                            aVar5.e().r(aVar6);
                            gVar2.f39494d.set(false);
                            if (aVar4 != null) {
                                aVar4.b(aVar6);
                                return;
                            }
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar3 = aVar6;
                            z10 = false;
                            gVar2.f39494d.set(z10);
                            if (!(aVar4 == null || aVar3 == null)) {
                                aVar4.b(aVar3);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    z10 = false;
                    aVar3 = null;
                    gVar2.f39494d.set(z10);
                    aVar4.b(aVar3);
                    throw th;
                }
            }
            if (aVar4 != null) {
                aVar4.a(new C3459v("No current access token to refresh"));
            }
            gVar2.f39494d.set(false);
        } catch (Throwable th4) {
            th = th4;
            z10 = false;
            aVar3 = null;
            gVar2.f39494d.set(z10);
            aVar4.b(aVar3);
            throw th;
        }
    }

    private final void q(C3286a aVar, C3286a aVar2) {
        Intent intent = new Intent(I.l(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", aVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", aVar2);
        this.f39491a.d(intent);
    }

    private final void s(C3286a aVar, boolean z10) {
        C3286a aVar2 = this.f39493c;
        this.f39493c = aVar;
        this.f39494d.set(false);
        this.f39495e = new Date(0);
        if (z10) {
            if (aVar != null) {
                this.f39492b.g(aVar);
            } else {
                this.f39492b.a();
                W.i(I.l());
            }
        }
        if (!W.e(aVar2, aVar)) {
            q(aVar2, aVar);
            t();
        }
    }

    private final void t() {
        Date date;
        Context l10 = I.l();
        C3286a.c cVar = C3286a.f39402l;
        C3286a e10 = cVar.e();
        AlarmManager alarmManager = (AlarmManager) l10.getSystemService("alarm");
        if (cVar.g()) {
            if (e10 != null) {
                date = e10.h();
            } else {
                date = null;
            }
            if (date != null && alarmManager != null) {
                Intent intent = new Intent(l10, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                try {
                    alarmManager.set(1, e10.h().getTime(), PendingIntent.getBroadcast(l10, 0, intent, 67108864));
                } catch (Exception unused) {
                }
            }
        }
    }

    private final boolean u() {
        C3286a i10 = i();
        if (i10 == null) {
            return false;
        }
        long time = new Date().getTime();
        if (!i10.l().b() || time - this.f39495e.getTime() <= 3600000 || time - i10.j().getTime() <= 86400000) {
            return false;
        }
        return true;
    }

    public final void g() {
        q(i(), i());
    }

    public final void h() {
        if (u()) {
            k((C3286a.C0623a) null);
        }
    }

    public final C3286a i() {
        return this.f39493c;
    }

    public final boolean j() {
        C3286a f10 = this.f39492b.f();
        if (f10 == null) {
            return false;
        }
        s(f10, false);
        return true;
    }

    public final void k(C3286a.C0623a aVar) {
        if (C6496s.c(Looper.getMainLooper(), Looper.myLooper())) {
            m(aVar);
        } else {
            new Handler(Looper.getMainLooper()).post(new C3288c(this, aVar));
        }
    }

    public final void r(C3286a aVar) {
        s(aVar, true);
    }
}
