package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d2.C1926a;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o7.W;

public final class AuthenticationTokenManager {

    /* renamed from: d  reason: collision with root package name */
    public static final a f39256d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static AuthenticationTokenManager f39257e;

    /* renamed from: a  reason: collision with root package name */
    private final C1926a f39258a;

    /* renamed from: b  reason: collision with root package name */
    private final C3321k f39259b;

    /* renamed from: c  reason: collision with root package name */
    private C3320j f39260c;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Llf/M;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            C6496s.h(context, "context");
            C6496s.h(intent, "intent");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AuthenticationTokenManager a() {
            AuthenticationTokenManager a10;
            AuthenticationTokenManager a11 = AuthenticationTokenManager.f39257e;
            if (a11 != null) {
                return a11;
            }
            synchronized (this) {
                a10 = AuthenticationTokenManager.f39257e;
                if (a10 == null) {
                    C1926a b10 = C1926a.b(I.l());
                    C6496s.g(b10, "getInstance(applicationContext)");
                    AuthenticationTokenManager authenticationTokenManager = new AuthenticationTokenManager(b10, new C3321k());
                    AuthenticationTokenManager.f39257e = authenticationTokenManager;
                    a10 = authenticationTokenManager;
                }
            }
            return a10;
        }

        private a() {
        }
    }

    public AuthenticationTokenManager(C1926a aVar, C3321k kVar) {
        C6496s.h(aVar, "localBroadcastManager");
        C6496s.h(kVar, "authenticationTokenCache");
        this.f39258a = aVar;
        this.f39259b = kVar;
    }

    private final void d(C3320j jVar, C3320j jVar2) {
        Intent intent = new Intent(I.l(), CurrentAuthenticationTokenChangedBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_AUTHENTICATION_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_AUTHENTICATION_TOKEN", jVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_AUTHENTICATION_TOKEN", jVar2);
        this.f39258a.d(intent);
    }

    private final void f(C3320j jVar, boolean z10) {
        C3320j c10 = c();
        this.f39260c = jVar;
        if (z10) {
            if (jVar != null) {
                this.f39259b.b(jVar);
            } else {
                this.f39259b.a();
                W.i(I.l());
            }
        }
        if (!W.e(c10, jVar)) {
            d(c10, jVar);
        }
    }

    public final C3320j c() {
        return this.f39260c;
    }

    public final void e(C3320j jVar) {
        f(jVar, true);
    }
}
