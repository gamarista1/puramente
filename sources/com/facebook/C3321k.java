package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;

/* renamed from: com.facebook.k  reason: case insensitive filesystem */
public final class C3321k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40108b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f40109a;

    /* renamed from: com.facebook.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3321k(SharedPreferences sharedPreferences) {
        C6496s.h(sharedPreferences, "sharedPreferences");
        this.f40109a = sharedPreferences;
    }

    public final void a() {
        this.f40109a.edit().remove("com.facebook.AuthenticationManager.CachedAuthenticationToken").apply();
    }

    public final void b(C3320j jVar) {
        C6496s.h(jVar, "authenticationToken");
        try {
            this.f40109a.edit().putString("com.facebook.AuthenticationManager.CachedAuthenticationToken", jVar.b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3321k() {
        /*
            r3 = this;
            android.content.Context r0 = com.facebook.I.l()
            java.lang.String r1 = "com.facebook.AuthenticationTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "getApplicationContext()\n…ME, Context.MODE_PRIVATE)"
            kotlin.jvm.internal.C6496s.g(r0, r1)
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3321k.<init>():void");
    }
}
