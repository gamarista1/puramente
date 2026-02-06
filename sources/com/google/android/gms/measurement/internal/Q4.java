package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class Q4 extends C4645k5 {

    /* renamed from: d  reason: collision with root package name */
    private final Map f54838d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final C4649l2 f54839e;

    /* renamed from: f  reason: collision with root package name */
    public final C4649l2 f54840f;

    /* renamed from: g  reason: collision with root package name */
    public final C4649l2 f54841g;

    /* renamed from: h  reason: collision with root package name */
    public final C4649l2 f54842h;

    /* renamed from: i  reason: collision with root package name */
    public final C4649l2 f54843i;

    Q4(q5 q5Var) {
        super(q5Var);
        C4614g2 e10 = e();
        Objects.requireNonNull(e10);
        this.f54839e = new C4649l2(e10, "last_delete_stale", 0);
        C4614g2 e11 = e();
        Objects.requireNonNull(e11);
        this.f54840f = new C4649l2(e11, "backoff", 0);
        C4614g2 e12 = e();
        Objects.requireNonNull(e12);
        this.f54841g = new C4649l2(e12, "last_upload", 0);
        C4614g2 e13 = e();
        Objects.requireNonNull(e13);
        this.f54842h = new C4649l2(e13, "last_upload_attempt", 0);
        C4614g2 e14 = e();
        Objects.requireNonNull(e14);
        this.f54843i = new C4649l2(e14, "midnight_offset", 0);
    }

    private final Pair t(String str) {
        P4 p42;
        AdvertisingIdClient.Info info;
        i();
        long a10 = zzb().a();
        P4 p43 = (P4) this.f54838d.get(str);
        if (p43 != null && a10 < p43.f54819c) {
            return new Pair(p43.f54817a, Boolean.valueOf(p43.f54818b));
        }
        AdvertisingIdClient.a(true);
        long w10 = a().w(str) + a10;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
        } catch (PackageManager.NameNotFoundException unused) {
            if (p43 != null) {
                try {
                    if (a10 < p43.f54819c + a().u(str, F.f54639c)) {
                        return new Pair(p43.f54817a, Boolean.valueOf(p43.f54818b));
                    }
                } catch (Exception e10) {
                    zzj().A().b("Unable to get advertising id", e10);
                    p42 = new P4("", false, w10);
                }
            }
            info = null;
        }
        if (info == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        if (id2 != null) {
            p42 = new P4(id2, info.isLimitAdTrackingEnabled(), w10);
        } else {
            p42 = new P4("", info.isLimitAdTrackingEnabled(), w10);
        }
        this.f54838d.put(str, p42);
        AdvertisingIdClient.a(false);
        return new Pair(p42.f54817a, Boolean.valueOf(p42.f54818b));
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ C4713w c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ R1 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C4614g2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ B5 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ x5 j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ J5 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ C4646l l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C4681q2 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ Q4 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ o5 o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair u(String str, C4622h3 h3Var) {
        if (h3Var.A()) {
            return t(str);
        }
        return new Pair("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    public final String v(String str, boolean z10) {
        String str2;
        i();
        if (z10) {
            str2 = (String) t(str).first;
        } else {
            str2 = "00000000-0000-0000-0000-000000000000";
        }
        MessageDigest Q02 = B5.Q0();
        if (Q02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, Q02.digest(str2.getBytes()))});
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C4583c zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ V1 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ C4734z2 zzl() {
        return super.zzl();
    }
}
