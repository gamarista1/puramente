package com.android.billingclient.api;

import J4.C3046l;
import J4.I;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.s  reason: case insensitive filesystem */
final class C3211s implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f38342a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C3046l f38343b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C3195b f38344c;

    C3211s(C3195b bVar, String str, C3046l lVar) {
        this.f38342a = str;
        this.f38343b = lVar;
        this.f38344c = bVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        I q02 = this.f38344c.c0(this.f38342a, 9);
        if (q02.b() != null) {
            this.f38343b.a(q02.a(), q02.b());
            return null;
        }
        this.f38343b.a(q02.a(), zzco.zzl());
        return null;
    }
}
