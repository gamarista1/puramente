package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import java.util.Iterator;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    final String f54425a;

    /* renamed from: b  reason: collision with root package name */
    final String f54426b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54427c;

    /* renamed from: d  reason: collision with root package name */
    final long f54428d;

    /* renamed from: e  reason: collision with root package name */
    final long f54429e;

    /* renamed from: f  reason: collision with root package name */
    final C f54430f;

    A(E2 e22, String str, String str2, String str3, long j10, long j11, Bundle bundle) {
        C c10;
        C4536s.f(str2);
        C4536s.f(str3);
        this.f54425a = str2;
        this.f54426b = str3;
        this.f54427c = TextUtils.isEmpty(str) ? null : str;
        this.f54428d = j10;
        this.f54429e = j11;
        if (j11 != 0 && j11 > j10) {
            e22.zzj().G().b("Event created with reverse previous/current timestamps. appId", V1.q(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c10 = new C(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    e22.zzj().B().a("Param name can't be null");
                    it.remove();
                } else {
                    Object n02 = e22.G().n0(next, bundle2.get(next));
                    if (n02 == null) {
                        e22.zzj().G().b("Param value can't be null", e22.y().f(next));
                        it.remove();
                    } else {
                        e22.G().J(bundle2, next, n02);
                    }
                }
            }
            c10 = new C(bundle2);
        }
        this.f54430f = c10;
    }

    /* access modifiers changed from: package-private */
    public final A a(E2 e22, long j10) {
        return new A(e22, this.f54427c, this.f54425a, this.f54426b, this.f54428d, j10, this.f54430f);
    }

    public final String toString() {
        String str = this.f54425a;
        String str2 = this.f54426b;
        String valueOf = String.valueOf(this.f54430f);
        return "Event{appId='" + str + "', name='" + str2 + "', params=" + valueOf + "}";
    }

    private A(E2 e22, String str, String str2, String str3, long j10, long j11, C c10) {
        C4536s.f(str2);
        C4536s.f(str3);
        C4536s.l(c10);
        this.f54425a = str2;
        this.f54426b = str3;
        this.f54427c = TextUtils.isEmpty(str) ? null : str;
        this.f54428d = j10;
        this.f54429e = j11;
        if (j11 != 0 && j11 > j10) {
            e22.zzj().G().c("Event created with reverse previous/current timestamps. appId, name", V1.q(str2), V1.q(str3));
        }
        this.f54430f = c10;
    }
}
