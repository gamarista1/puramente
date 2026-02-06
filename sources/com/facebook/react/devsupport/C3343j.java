package com.facebook.react.devsupport;

import a8.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.react.devsupport.j  reason: case insensitive filesystem */
public final class C3343j implements V7.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40818e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final b f40819a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f40820b;

    /* renamed from: c  reason: collision with root package name */
    private final d f40821c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f40822d = E7.a.f30669b;

    /* renamed from: com.facebook.react.devsupport.j$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.react.devsupport.j$b */
    public interface b {
        void a();
    }

    public C3343j(Context context, b bVar) {
        C6496s.h(context, "applicationContext");
        this.f40819a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        C6496s.g(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f40820b = defaultSharedPreferences;
        this.f40821c = new d(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
    }

    public boolean a() {
        return this.f40820b.getBoolean("inspector_debug", false);
    }

    public void b(boolean z10) {
        this.f40820b.edit().putBoolean("inspector_debug", z10).apply();
    }

    public boolean c() {
        return this.f40820b.getBoolean("fps_debug", false);
    }

    public void d(boolean z10) {
        this.f40820b.edit().putBoolean("hot_module_replacement", z10).apply();
    }

    public boolean e() {
        return this.f40820b.getBoolean("hot_module_replacement", true);
    }

    public boolean f() {
        return this.f40822d;
    }

    public boolean g() {
        return this.f40820b.getBoolean("js_minify_debug", false);
    }

    public boolean h() {
        return this.f40820b.getBoolean("js_dev_mode_debug", true);
    }

    public d i() {
        return this.f40821c;
    }

    public void j(boolean z10) {
        this.f40820b.edit().putBoolean("fps_debug", z10).apply();
    }

    public void k(boolean z10) {
        this.f40820b.edit().putBoolean("remote_js_debug", z10).apply();
    }

    public void l(boolean z10) {
        this.f40820b.edit().putBoolean("js_dev_mode_debug", z10).apply();
    }

    public boolean m() {
        return this.f40820b.getBoolean("remote_js_debug", false);
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C6496s.h(sharedPreferences, "sharedPreferences");
        if (this.f40819a == null) {
            return;
        }
        if (C6496s.c("fps_debug", str) || C6496s.c("js_dev_mode_debug", str) || C6496s.c("js_minify_debug", str)) {
            this.f40819a.a();
        }
    }
}
