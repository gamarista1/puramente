package com.facebook.react.module.model;

import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ReactModuleInfo {

    /* renamed from: g  reason: collision with root package name */
    public static final a f40951g = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f40952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40953b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f40954c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f40955d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f40956e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f40957f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Class cls) {
            C6496s.h(cls, "clazz");
            return TurboModule.class.isAssignableFrom(cls);
        }

        private a() {
        }
    }

    public ReactModuleInfo(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        C6496s.h(str, "name");
        C6496s.h(str2, "className");
        this.f40952a = str;
        this.f40953b = str2;
        this.f40954c = z10;
        this.f40955d = z11;
        this.f40956e = z12;
        this.f40957f = z13;
    }

    public static final boolean b(Class cls) {
        return f40951g.a(cls);
    }

    public final boolean a() {
        return this.f40954c;
    }

    public final String c() {
        return this.f40953b;
    }

    public final boolean d() {
        return this.f40956e;
    }

    public final boolean e() {
        return this.f40957f;
    }

    public final String f() {
        return this.f40952a;
    }

    public final boolean g() {
        return this.f40955d;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ReactModuleInfo(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this(str, str2, z10, z11, z13, z14);
        C6496s.h(str, "name");
        C6496s.h(str2, "className");
    }
}
