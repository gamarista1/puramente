package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

/* renamed from: com.facebook.b  reason: case insensitive filesystem */
public final class C3287b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39426d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f39427a;

    /* renamed from: b  reason: collision with root package name */
    private final C0624b f39428b;

    /* renamed from: c  reason: collision with root package name */
    private U f39429c;

    /* renamed from: com.facebook.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.b$b  reason: collision with other inner class name */
    public static final class C0624b {
        public final U a() {
            return new U(I.l(), (String) null, 2, (DefaultConstructorMarker) null);
        }
    }

    public C3287b(SharedPreferences sharedPreferences, C0624b bVar) {
        C6496s.h(sharedPreferences, "sharedPreferences");
        C6496s.h(bVar, "tokenCachingStrategyFactory");
        this.f39427a = sharedPreferences;
        this.f39428b = bVar;
    }

    private final C3286a b() {
        String string = this.f39427a.getString("com.facebook.AccessTokenManager.CachedAccessToken", (String) null);
        if (string == null) {
            return null;
        }
        try {
            return C3286a.f39402l.b(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final C3286a c() {
        Bundle c10 = d().c();
        if (c10 == null || !U.f39369c.g(c10)) {
            return null;
        }
        return C3286a.f39402l.c(c10);
    }

    private final U d() {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            if (this.f39429c == null) {
                synchronized (this) {
                    if (this.f39429c == null) {
                        this.f39429c = this.f39428b.a();
                    }
                    C6514M m10 = C6514M.f71813a;
                }
            }
            U u10 = this.f39429c;
            if (u10 != null) {
                return u10;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final boolean e() {
        return this.f39427a.contains("com.facebook.AccessTokenManager.CachedAccessToken");
    }

    private final boolean h() {
        return I.H();
    }

    public final void a() {
        this.f39427a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (h()) {
            d().a();
        }
    }

    public final C3286a f() {
        if (e()) {
            return b();
        }
        if (!h()) {
            return null;
        }
        C3286a c10 = c();
        if (c10 == null) {
            return c10;
        }
        g(c10);
        d().a();
        return c10;
    }

    public final void g(C3286a aVar) {
        C6496s.h(aVar, "accessToken");
        try {
            this.f39427a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.u().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3287b() {
        /*
            r3 = this;
            android.content.Context r0 = com.facebook.I.l()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "getApplicationContext()\n…ME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            com.facebook.b$b r1 = new com.facebook.b$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3287b.<init>():void");
    }
}
