package com.facebook;

import android.content.SharedPreferences;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

public final class X {

    /* renamed from: b  reason: collision with root package name */
    public static final a f39391b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f39392a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public X() {
        SharedPreferences sharedPreferences = I.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        C6496s.g(sharedPreferences, "getApplicationContext()\n…ME, Context.MODE_PRIVATE)");
        this.f39392a = sharedPreferences;
    }

    public final void a() {
        this.f39392a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final W b() {
        String string = this.f39392a.getString("com.facebook.ProfileManager.CachedProfile", (String) null);
        if (string != null) {
            try {
                return new W(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(W w10) {
        C6496s.h(w10, "profile");
        JSONObject i10 = w10.i();
        if (i10 != null) {
            this.f39392a.edit().putString("com.facebook.ProfileManager.CachedProfile", i10.toString()).apply();
        }
    }
}
