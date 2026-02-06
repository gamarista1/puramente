package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzph;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.b4  reason: case insensitive filesystem */
final class C4581b4 extends C4645k5 {
    public C4581b4(q5 q5Var) {
        super(q5Var);
    }

    private static String b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    public final byte[] t(D d10, String str) {
        C5 c52;
        zzfn.zzj.zzb zzb;
        zzfn.zzk.zza zza;
        byte[] bArr;
        Z1 z12;
        Bundle bundle;
        C4725y yVar;
        long j10;
        D d11 = d10;
        String str2 = str;
        i();
        this.f55074a.L();
        C4536s.l(d10);
        C4536s.f(str);
        if (!a().z(str2, F.f54650h0)) {
            zzj().A().b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(d11.f54497a) || "_iapx".equals(d11.f54497a)) {
            zzfn.zzj.zzb zzb2 = zzfn.zzj.zzb();
            l().S0();
            Z1 C02 = l().C0(str2);
            if (C02 == null) {
                zzj().A().b("Log and bundle not available. package_name", str2);
                byte[] bArr2 = new byte[0];
                l().U0();
                return bArr2;
            } else if (!C02.A()) {
                zzj().A().b("Log and bundle disabled. package_name", str2);
                byte[] bArr3 = new byte[0];
                l().U0();
                return bArr3;
            } else {
                zzfn.zzk.zza zzp = zzfn.zzk.zzw().zzh(1).zzp("android");
                if (!TextUtils.isEmpty(C02.l())) {
                    zzp.zzb(C02.l());
                }
                if (!TextUtils.isEmpty(C02.n())) {
                    zzp.zzd((String) C4536s.l(C02.n()));
                }
                if (!TextUtils.isEmpty(C02.o())) {
                    zzp.zze((String) C4536s.l(C02.o()));
                }
                if (C02.U() != -2147483648L) {
                    zzp.zze((int) C02.U());
                }
                zzp.zzf(C02.z0()).zzd(C02.v0());
                String q10 = C02.q();
                String j11 = C02.j();
                if (!TextUtils.isEmpty(q10)) {
                    zzp.zzm(q10);
                } else if (!TextUtils.isEmpty(j11)) {
                    zzp.zza(j11);
                }
                zzp.zzj(C02.J0());
                C4622h3 N10 = this.f55232b.N(str2);
                zzp.zzc(C02.t0());
                if (this.f55074a.k() && a().H(zzp.zzt()) && N10.A() && !TextUtils.isEmpty((CharSequence) null)) {
                    zzp.zzj((String) null);
                }
                zzp.zzg(N10.y());
                if (N10.A() && C02.z()) {
                    Pair u10 = n().u(C02.l(), N10);
                    if (C02.z() && u10 != null && !TextUtils.isEmpty((CharSequence) u10.first)) {
                        try {
                            zzp.zzq(b((String) u10.first, Long.toString(d11.f54500d)));
                            Object obj = u10.second;
                            if (obj != null) {
                                zzp.zzc(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            zzj().A().b("Resettable device id encryption failed", e10.getMessage());
                            return new byte[0];
                        } finally {
                            l().U0();
                        }
                    }
                }
                c().k();
                zzfn.zzk.zza zzi = zzp.zzi(Build.MODEL);
                c().k();
                zzi.zzo(Build.VERSION.RELEASE).zzj((int) c().q()).zzs(c().r());
                try {
                    if (N10.B() && C02.m() != null) {
                        zzp.zzc(b((String) C4536s.l(C02.m()), Long.toString(d11.f54500d)));
                    }
                    if (!TextUtils.isEmpty(C02.p())) {
                        zzp.zzl((String) C4536s.l(C02.p()));
                    }
                    String l10 = C02.l();
                    List N02 = l().N0(l10);
                    Iterator it = N02.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c52 = null;
                            break;
                        }
                        c52 = (C5) it.next();
                        if ("_lte".equals(c52.f54494c)) {
                            break;
                        }
                    }
                    if (c52 == null || c52.f54496e == null) {
                        C5 c53 = new C5(l10, "auto", "_lte", zzb().currentTimeMillis(), 0L);
                        N02.add(c53);
                        l().a0(c53);
                    }
                    zzfn.zzo[] zzoArr = new zzfn.zzo[N02.size()];
                    for (int i10 = 0; i10 < N02.size(); i10++) {
                        zzfn.zzo.zza zzb3 = zzfn.zzo.zze().zza(((C5) N02.get(i10)).f54494c).zzb(((C5) N02.get(i10)).f54495d);
                        j().R(zzb3, ((C5) N02.get(i10)).f54496e);
                        zzoArr[i10] = (zzfn.zzo) ((zzjk) zzb3.zzai());
                    }
                    zzp.zze((Iterable<? extends zzfn.zzo>) Arrays.asList(zzoArr));
                    j().Q(zzp);
                    this.f55232b.s(C02, zzp);
                    if (zzoj.zza() && a().o(F.f54610N0)) {
                        this.f55232b.T(C02, zzp);
                    }
                    C4572a2 b10 = C4572a2.b(d10);
                    f().I(b10.f55003d, l().A0(str2));
                    f().R(b10, a().p(str2));
                    Bundle bundle2 = b10.f55003d;
                    bundle2.putLong("_c", 1);
                    zzj().A().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", d11.f54499c);
                    if (f().z0(zzp.zzt(), C02.v())) {
                        f().J(bundle2, "_dbg", 1L);
                        f().J(bundle2, "_r", 1L);
                    }
                    C4725y B02 = l().B0(str2, d11.f54497a);
                    if (B02 == null) {
                        bundle = bundle2;
                        zza = zzp;
                        zzb = zzb2;
                        z12 = C02;
                        bArr = null;
                        yVar = new C4725y(str, d11.f54497a, 0, 0, d11.f54500d, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j10 = 0;
                    } else {
                        bundle = bundle2;
                        zza = zzp;
                        zzb = zzb2;
                        z12 = C02;
                        bArr = null;
                        j10 = B02.f55408f;
                        yVar = B02.a(d11.f54500d);
                    }
                    l().P(yVar);
                    A a10 = new A(this.f55074a, d11.f54499c, str, d11.f54497a, d11.f54500d, j10, bundle);
                    zzfn.zzf.zza zza2 = zzfn.zzf.zze().zzb(a10.f54428d).zza(a10.f54426b).zza(a10.f54429e);
                    Iterator it2 = a10.f54430f.iterator();
                    while (it2.hasNext()) {
                        String str3 = (String) it2.next();
                        zzfn.zzh.zza zza3 = zzfn.zzh.zze().zza(str3);
                        Object t02 = a10.f54430f.t0(str3);
                        if (t02 != null) {
                            j().P(zza3, t02);
                            zza2.zza(zza3);
                        }
                    }
                    zzfn.zzk.zza zza4 = zza;
                    zza4.zza(zza2).zza(zzfn.zzl.zza().zza(zzfn.zzg.zza().zza(yVar.f55405c).zza(d11.f54497a)));
                    zza4.zza((Iterable<? extends zzfn.zzd>) k().u(z12.l(), Collections.emptyList(), zza4.zzab(), Long.valueOf(zza2.zzc()), Long.valueOf(zza2.zzc())));
                    if (zza2.zzg()) {
                        zza4.zzi(zza2.zzc()).zze(zza2.zzc());
                    }
                    long D02 = z12.D0();
                    int i11 = (D02 > 0 ? 1 : (D02 == 0 ? 0 : -1));
                    if (i11 != 0) {
                        zza4.zzg(D02);
                    }
                    long H02 = z12.H0();
                    if (H02 != 0) {
                        zza4.zzh(H02);
                    } else if (i11 != 0) {
                        zza4.zzh(D02);
                    }
                    String u11 = z12.u();
                    if (zzph.zza()) {
                        if (a().z(str, F.f54672s0) && u11 != null) {
                            zza4.zzr(u11);
                        }
                    } else {
                        String str4 = str;
                    }
                    z12.y();
                    zza4.zzf((int) z12.F0()).zzl(97001).zzk(zzb().currentTimeMillis()).zzd(true);
                    this.f55232b.y(zza4.zzt(), zza4);
                    zzfn.zzj.zzb zzb4 = zzb;
                    zzb4.zza(zza4);
                    Z1 z13 = z12;
                    z13.C0(zza4.zzf());
                    z13.y0(zza4.zze());
                    l().Q(z13, false, false);
                    l().W0();
                    try {
                        return j().d0(((zzfn.zzj) ((zzjk) zzb4.zzai())).zzbz());
                    } catch (IOException e11) {
                        zzj().B().c("Data loss. Failed to bundle and serialize. appId", V1.q(str), e11);
                        return bArr;
                    }
                } catch (SecurityException e12) {
                    zzj().A().b("app instance id encryption failed", e12.getMessage());
                    byte[] bArr4 = new byte[0];
                    l().U0();
                    return bArr4;
                }
            }
        } else {
            zzj().A().c("Generating a payload for this event is not available. package_name, event_name", str2, d11.f54497a);
            return null;
        }
    }
}
