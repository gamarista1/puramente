package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d2.C1926a;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;
import o7.X;

/* renamed from: com.facebook.i  reason: case insensitive filesystem */
public abstract class C3294i {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39728d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f39729e = C3294i.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f39730a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final C1926a f39731b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39732c;

    /* renamed from: com.facebook.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.facebook.i$b */
    private final class b extends BroadcastReceiver {
        public b() {
        }

        public void onReceive(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, "intent");
            if (C6496s.c("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction())) {
                W.l0(C3294i.f39729e, "AccessTokenChanged");
                C3294i.this.d((C3286a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN"), (C3286a) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN"));
            }
        }
    }

    public C3294i() {
        X.o();
        C1926a b10 = C1926a.b(I.l());
        C6496s.g(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.f39731b = b10;
        e();
    }

    private final void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f39731b.c(this.f39730a, intentFilter);
    }

    public final boolean c() {
        return this.f39732c;
    }

    /* access modifiers changed from: protected */
    public abstract void d(C3286a aVar, C3286a aVar2);

    public final void e() {
        if (!this.f39732c) {
            b();
            this.f39732c = true;
        }
    }

    public final void f() {
        if (this.f39732c) {
            this.f39731b.e(this.f39730a);
            this.f39732c = false;
        }
    }
}
