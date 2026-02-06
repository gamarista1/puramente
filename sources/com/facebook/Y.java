package com.facebook;

import android.content.Intent;
import d2.C1926a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;

public final class Y {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39393d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static volatile Y f39394e;

    /* renamed from: a  reason: collision with root package name */
    private final C1926a f39395a;

    /* renamed from: b  reason: collision with root package name */
    private final X f39396b;

    /* renamed from: c  reason: collision with root package name */
    private W f39397c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final synchronized Y a() {
            Y a10;
            try {
                if (Y.f39394e == null) {
                    C1926a b10 = C1926a.b(I.l());
                    C6496s.g(b10, "getInstance(applicationContext)");
                    Y.f39394e = new Y(b10, new X());
                }
                a10 = Y.f39394e;
                if (a10 == null) {
                    C6496s.v("instance");
                    a10 = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
            return a10;
        }

        private a() {
        }
    }

    public Y(C1926a aVar, X x10) {
        C6496s.h(aVar, "localBroadcastManager");
        C6496s.h(x10, "profileCache");
        this.f39395a = aVar;
        this.f39396b = x10;
    }

    private final void e(W w10, W w11) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", w10);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", w11);
        this.f39395a.d(intent);
    }

    private final void g(W w10, boolean z10) {
        W w11 = this.f39397c;
        this.f39397c = w10;
        if (z10) {
            if (w10 != null) {
                this.f39396b.c(w10);
            } else {
                this.f39396b.a();
            }
        }
        if (!W.e(w11, w10)) {
            e(w11, w10);
        }
    }

    public final W c() {
        return this.f39397c;
    }

    public final boolean d() {
        W b10 = this.f39396b.b();
        if (b10 == null) {
            return false;
        }
        g(b10, false);
        return true;
    }

    public final void f(W w10) {
        g(w10, true);
    }
}
