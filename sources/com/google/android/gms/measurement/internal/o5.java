package com.google.android.gms.measurement.internal;

import Ea.e;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzpn;
import java.util.HashMap;

public final class o5 extends C4652l5 {
    o5(q5 q5Var) {
        super(q5Var);
    }

    private final String q(String str) {
        String M10 = m().M(str);
        if (TextUtils.isEmpty(M10)) {
            return (String) F.f54669r.a((Object) null);
        }
        Uri parse = Uri.parse((String) F.f54669r.a((Object) null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        buildUpon.authority(M10 + "." + authority);
        return buildUpon.build().toString();
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

    public final C4659m5 p(String str) {
        Z1 C02;
        String str2;
        if (zzpn.zza() && a().o(F.f54674t0)) {
            f();
            if (B5.C0(str)) {
                zzj().F().a("sgtm feature flag enabled.");
                Z1 C03 = l().C0(str);
                if (C03 == null) {
                    return new C4659m5(q(str), 1);
                }
                String m10 = C03.m();
                zzfi.zzd G10 = m().G(str);
                if (G10 == null || (C02 = l().C0(str)) == null || ((!G10.zzr() || G10.zzh().zza() != 100) && !f().z0(str, C02.v()) && (TextUtils.isEmpty(m10) || m10.hashCode() % 100 >= G10.zzh().zza()))) {
                    return new C4659m5(q(str), 1);
                }
                C4659m5 m5Var = null;
                if (C03.C()) {
                    zzj().F().a("sgtm upload enabled in manifest.");
                    zzfi.zzd G11 = m().G(C03.l());
                    if (G11 != null && G11.zzr()) {
                        String zze = G11.zzh().zze();
                        if (!TextUtils.isEmpty(zze)) {
                            String zzd = G11.zzh().zzd();
                            X1 F10 = zzj().F();
                            if (TextUtils.isEmpty(zzd)) {
                                str2 = "Y";
                            } else {
                                str2 = "N";
                            }
                            F10.c("sgtm configured with upload_url, server_info", zze, str2);
                            if (TextUtils.isEmpty(zzd)) {
                                m5Var = new C4659m5(zze, 3);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("x-sgtm-server-info", zzd);
                                if (!TextUtils.isEmpty(C03.v())) {
                                    hashMap.put("x-gtm-server-preview", C03.v());
                                }
                                m5Var = new C4659m5(zze, hashMap, 3);
                            }
                        }
                    }
                }
                if (m5Var != null) {
                    return m5Var;
                }
            }
        }
        return new C4659m5(q(str), 1);
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
