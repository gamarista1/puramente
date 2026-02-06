package com.google.android.gms.measurement.internal;

import Ea.e;
import Pa.l;
import Pa.o;
import Pa.q;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.C1587a;
import androidx.collection.C1609x;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzft;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjs;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.C4622h3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.measurement.internal.q2  reason: case insensitive filesystem */
public final class C4681q2 extends C4645k5 implements C4632j {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map f55272d = new C1587a();

    /* renamed from: e  reason: collision with root package name */
    private final Map f55273e = new C1587a();

    /* renamed from: f  reason: collision with root package name */
    private final Map f55274f = new C1587a();

    /* renamed from: g  reason: collision with root package name */
    private final Map f55275g = new C1587a();

    /* renamed from: h  reason: collision with root package name */
    private final Map f55276h = new C1587a();

    /* renamed from: i  reason: collision with root package name */
    private final Map f55277i = new C1587a();

    /* renamed from: j  reason: collision with root package name */
    final C1609x f55278j = new C4710v2(this, 20);

    /* renamed from: k  reason: collision with root package name */
    final zzv f55279k = new C4704u2(this);

    /* renamed from: l  reason: collision with root package name */
    private final Map f55280l = new C1587a();

    /* renamed from: m  reason: collision with root package name */
    private final Map f55281m = new C1587a();

    /* renamed from: n  reason: collision with root package name */
    private final Map f55282n = new C1587a();

    C4681q2(q5 q5Var) {
        super(q5Var);
    }

    private final void A(String str, zzfi.zzd.zza zza) {
        HashSet hashSet = new HashSet();
        C1587a aVar = new C1587a();
        C1587a aVar2 = new C1587a();
        C1587a aVar3 = new C1587a();
        if (zza != null) {
            for (zzfi.zzb zzb : zza.zze()) {
                hashSet.add(zzb.zzb());
            }
            for (int i10 = 0; i10 < zza.zza(); i10++) {
                zzfi.zzc.zza zza2 = (zzfi.zzc.zza) zza.zza(i10).zzcc();
                if (zza2.zzb().isEmpty()) {
                    zzj().G().a("EventConfig contained null event name");
                } else {
                    String zzb2 = zza2.zzb();
                    String b10 = q.b(zza2.zzb());
                    if (!TextUtils.isEmpty(b10)) {
                        zza2 = zza2.zza(b10);
                        zza.zza(i10, zza2);
                    }
                    if (zza2.zze() && zza2.zzc()) {
                        aVar.put(zzb2, Boolean.TRUE);
                    }
                    if (zza2.zzf() && zza2.zzd()) {
                        aVar2.put(zza2.zzb(), Boolean.TRUE);
                    }
                    if (zza2.zzg()) {
                        if (zza2.zza() < 2 || zza2.zza() > 65535) {
                            zzj().G().c("Invalid sampling rate. Event name, sample rate", zza2.zzb(), Integer.valueOf(zza2.zza()));
                        } else {
                            aVar3.put(zza2.zzb(), Integer.valueOf(zza2.zza()));
                        }
                    }
                }
            }
        }
        this.f55273e.put(str, hashSet);
        this.f55274f.put(str, aVar);
        this.f55275g.put(str, aVar2);
        this.f55277i.put(str, aVar3);
    }

    private final void B(String str, zzfi.zzd zzd) {
        if (zzd.zza() == 0) {
            this.f55278j.remove(str);
            return;
        }
        zzj().F().b("EES programs found", Integer.valueOf(zzd.zza()));
        zzft.zzc zzc = zzd.zzm().get(0);
        try {
            zzb zzb = new zzb();
            zzb.zza("internal.remoteConfig", new C4686r2(this, str));
            zzb.zza("internal.appMetadata", new l(this, str));
            zzb.zza("internal.logger", new C4698t2(this));
            zzb.zza(zzc);
            this.f55278j.put(str, zzb);
            zzj().F().c("EES program loaded for appId, activities", str, Integer.valueOf(zzc.zza().zza()));
            for (zzft.zzb zzb2 : zzc.zza().zzd()) {
                zzj().F().b("EES program activity", zzb2.zzb());
            }
        } catch (zzc unused) {
            zzj().B().b("Failed to load EES program. appId", str);
        }
    }

    private final void c0(String str) {
        p();
        i();
        C4536s.f(str);
        if (this.f55276h.get(str) == null) {
            C4653m E02 = l().E0(str);
            if (E02 == null) {
                this.f55272d.put(str, (Object) null);
                this.f55274f.put(str, (Object) null);
                this.f55273e.put(str, (Object) null);
                this.f55275g.put(str, (Object) null);
                this.f55276h.put(str, (Object) null);
                this.f55280l.put(str, (Object) null);
                this.f55281m.put(str, (Object) null);
                this.f55282n.put(str, (Object) null);
                this.f55277i.put(str, (Object) null);
                return;
            }
            zzfi.zzd.zza zza = (zzfi.zzd.zza) w(str, E02.f55233a).zzcc();
            A(str, zza);
            this.f55272d.put(str, y((zzfi.zzd) ((zzjk) zza.zzai())));
            this.f55276h.put(str, (zzfi.zzd) ((zzjk) zza.zzai()));
            B(str, (zzfi.zzd) ((zzjk) zza.zzai()));
            this.f55280l.put(str, zza.zzc());
            this.f55281m.put(str, E02.f55234b);
            this.f55282n.put(str, E02.f55235c);
        }
    }

    static /* synthetic */ zzb v(C4681q2 q2Var, String str) {
        q2Var.p();
        C4536s.f(str);
        if (!q2Var.S(str)) {
            return null;
        }
        if (!q2Var.f55276h.containsKey(str) || q2Var.f55276h.get(str) == null) {
            q2Var.c0(str);
        } else {
            q2Var.B(str, (zzfi.zzd) q2Var.f55276h.get(str));
        }
        return (zzb) q2Var.f55278j.snapshot().get(str);
    }

    private final zzfi.zzd w(String str, byte[] bArr) {
        Long l10;
        if (bArr == null) {
            return zzfi.zzd.zzg();
        }
        try {
            zzfi.zzd zzd = (zzfi.zzd) ((zzjk) ((zzfi.zzd.zza) x5.B(zzfi.zzd.zze(), bArr)).zzai());
            X1 F10 = zzj().F();
            String str2 = null;
            if (zzd.zzs()) {
                l10 = Long.valueOf(zzd.zzc());
            } else {
                l10 = null;
            }
            if (zzd.zzq()) {
                str2 = zzd.zzi();
            }
            F10.c("Parsed config. version, gmp_app_id", l10, str2);
            return zzd;
        } catch (zzjs e10) {
            zzj().G().c("Unable to merge remote config. appId", V1.q(str), e10);
            return zzfi.zzd.zzg();
        } catch (RuntimeException e11) {
            zzj().G().c("Unable to merge remote config. appId", V1.q(str), e11);
            return zzfi.zzd.zzg();
        }
    }

    private static C4622h3.a x(zzfi.zza.zze zze) {
        int i10 = C4722x2.f55398b[zze.ordinal()];
        if (i10 == 1) {
            return C4622h3.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return C4622h3.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return C4622h3.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return C4622h3.a.AD_PERSONALIZATION;
    }

    private static Map y(zzfi.zzd zzd) {
        C1587a aVar = new C1587a();
        if (zzd != null) {
            for (zzfi.zzg next : zzd.zzn()) {
                aVar.put(next.zzb(), next.zzc());
            }
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        p();
        i();
        C4536s.f(str);
        zzfi.zzd.zza zza = (zzfi.zzd.zza) w(str, bArr).zzcc();
        if (zza == null) {
            return false;
        }
        A(str, zza);
        B(str, (zzfi.zzd) ((zzjk) zza.zzai()));
        this.f55276h.put(str, (zzfi.zzd) ((zzjk) zza.zzai()));
        this.f55280l.put(str, zza.zzc());
        this.f55281m.put(str, str2);
        this.f55282n.put(str, str3);
        this.f55272d.put(str, y((zzfi.zzd) ((zzjk) zza.zzai())));
        l().V(str, new ArrayList(zza.zzd()));
        try {
            zza.zzb();
            bArr = ((zzfi.zzd) ((zzjk) zza.zzai())).zzbz();
        } catch (RuntimeException e10) {
            zzj().G().c("Unable to serialize reduced-size config. Storing full config instead. appId", V1.q(str), e10);
        }
        C4646l l10 = l();
        C4536s.f(str);
        l10.i();
        l10.p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) l10.w().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                l10.zzj().B().b("Failed to update remote config (got 0). appId", V1.q(str));
            }
        } catch (SQLiteException e11) {
            l10.zzj().B().c("Error storing remote config. appId", V1.q(str), e11);
        }
        this.f55276h.put(str, (zzfi.zzd) ((zzjk) zza.zzai()));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int D(String str, String str2) {
        Integer num;
        i();
        c0(str);
        Map map = (Map) this.f55277i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final zzfi.zza E(String str) {
        i();
        c0(str);
        zzfi.zzd G10 = G(str);
        if (G10 == null || !G10.zzp()) {
            return null;
        }
        return G10.zzd();
    }

    /* access modifiers changed from: package-private */
    public final C4622h3.a F(String str, C4622h3.a aVar) {
        i();
        c0(str);
        zzfi.zza E10 = E(str);
        if (E10 == null) {
            return null;
        }
        for (zzfi.zza.zzc next : E10.zze()) {
            if (aVar == x(next.zzc())) {
                return x(next.zzb());
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final zzfi.zzd G(String str) {
        p();
        i();
        C4536s.f(str);
        c0(str);
        return (zzfi.zzd) this.f55276h.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean H(String str, C4622h3.a aVar) {
        i();
        c0(str);
        zzfi.zza E10 = E(str);
        if (E10 == null) {
            return false;
        }
        Iterator<zzfi.zza.C0826zza> it = E10.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfi.zza.C0826zza next = it.next();
            if (aVar == x(next.zzc())) {
                if (next.zzb() == zzfi.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean I(String str, String str2) {
        Boolean bool;
        i();
        c0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f55275g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String J(String str) {
        i();
        return (String) this.f55282n.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean K(String str, String str2) {
        Boolean bool;
        i();
        c0(str);
        if (T(str) && B5.E0(str2)) {
            return true;
        }
        if (V(str) && B5.G0(str2)) {
            return true;
        }
        Map map = (Map) this.f55274f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String L(String str) {
        i();
        return (String) this.f55281m.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String M(String str) {
        i();
        c0(str);
        return (String) this.f55280l.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Set N(String str) {
        i();
        c0(str);
        return (Set) this.f55273e.get(str);
    }

    /* access modifiers changed from: package-private */
    public final SortedSet O(String str) {
        i();
        c0(str);
        TreeSet treeSet = new TreeSet();
        zzfi.zza E10 = E(str);
        if (E10 == null) {
            return treeSet;
        }
        for (zzfi.zza.zzf zzb : E10.zzc()) {
            treeSet.add(zzb.zzb());
        }
        return treeSet;
    }

    /* access modifiers changed from: protected */
    public final void P(String str) {
        i();
        this.f55281m.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void Q(String str) {
        i();
        this.f55276h.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean R(String str) {
        i();
        zzfi.zzd G10 = G(str);
        if (G10 == null) {
            return false;
        }
        return G10.zzo();
    }

    public final boolean S(String str) {
        zzfi.zzd zzd;
        if (TextUtils.isEmpty(str) || (zzd = (zzfi.zzd) this.f55276h.get(str)) == null || zzd.zza() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean T(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean U(String str) {
        i();
        c0(str);
        zzfi.zza E10 = E(str);
        if (E10 != null && E10.zzh() && !E10.zzg()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean V(String str) {
        return "1".equals(b(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    public final boolean W(String str) {
        i();
        c0(str);
        if (this.f55273e.get(str) == null || !((Set) this.f55273e.get(str)).contains("app_instance_id")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean X(String str) {
        i();
        c0(str);
        if (this.f55273e.get(str) == null) {
            return false;
        }
        if (((Set) this.f55273e.get(str)).contains("device_model") || ((Set) this.f55273e.get(str)).contains("device_info")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean Y(String str) {
        i();
        c0(str);
        if (this.f55273e.get(str) == null || !((Set) this.f55273e.get(str)).contains("enhanced_user_id")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean Z(String str) {
        i();
        c0(str);
        if (this.f55273e.get(str) == null || !((Set) this.f55273e.get(str)).contains("google_signals")) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C4618h a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(String str) {
        i();
        c0(str);
        if (this.f55273e.get(str) == null) {
            return false;
        }
        if (((Set) this.f55273e.get(str)).contains("os_version") || ((Set) this.f55273e.get(str)).contains("device_info")) {
            return true;
        }
        return false;
    }

    public final String b(String str, String str2) {
        i();
        c0(str);
        Map map = (Map) this.f55272d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final boolean b0(String str) {
        i();
        c0(str);
        if (this.f55273e.get(str) == null || !((Set) this.f55273e.get(str)).contains("user_id")) {
            return false;
        }
        return true;
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
    public final long t(String str) {
        String b10 = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(b10)) {
            return 0;
        }
        try {
            return Long.parseLong(b10);
        } catch (NumberFormatException e10) {
            zzj().G().c("Unable to parse timezone offset. appId", V1.q(str), e10);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final o u(String str, C4622h3.a aVar) {
        i();
        c0(str);
        zzfi.zza E10 = E(str);
        if (E10 == null) {
            return o.UNINITIALIZED;
        }
        for (zzfi.zza.C0826zza next : E10.zzf()) {
            if (x(next.zzc()) == aVar) {
                int i10 = C4722x2.f55399c[next.zzb().ordinal()];
                if (i10 == 1) {
                    return o.DENIED;
                }
                if (i10 != 2) {
                    return o.UNINITIALIZED;
                }
                return o.GRANTED;
            }
        }
        return o.UNINITIALIZED;
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
