package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import d2.C1926a;
import kotlin.jvm.internal.C6496s;
import o7.X;

public abstract class Z {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f39398a = new a();

    /* renamed from: b  reason: collision with root package name */
    private final C1926a f39399b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39400c;

    private final class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, "intent");
            if (C6496s.c("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED", intent.getAction())) {
                Z.this.b((W) intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_PROFILE"), (W) intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_PROFILE"));
            }
        }
    }

    public Z() {
        X.o();
        C1926a b10 = C1926a.b(I.l());
        C6496s.g(b10, "getInstance(FacebookSdk.getApplicationContext())");
        this.f39399b = b10;
        c();
    }

    private final void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        this.f39399b.c(this.f39398a, intentFilter);
    }

    /* access modifiers changed from: protected */
    public abstract void b(W w10, W w11);

    public final void c() {
        if (!this.f39400c) {
            a();
            this.f39400c = true;
        }
    }

    public final void d() {
        if (this.f39400c) {
            this.f39399b.e(this.f39398a);
            this.f39400c = false;
        }
    }
}
