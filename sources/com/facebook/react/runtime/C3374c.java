package com.facebook.react.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.facebook.react.runtime.c  reason: case insensitive filesystem */
public final class C3374c {

    /* renamed from: c  reason: collision with root package name */
    private static final a f41294c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f41295a;

    /* renamed from: b  reason: collision with root package name */
    private final List f41296b = Collections.synchronizedList(new ArrayList());

    /* renamed from: com.facebook.react.runtime.c$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C3374c(boolean z10) {
        this.f41295a = z10;
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        C6496s.h(str, "state");
        U5.a.I("BridgelessReact", str);
        if (this.f41295a) {
            this.f41296b.add(str);
        }
    }
}
