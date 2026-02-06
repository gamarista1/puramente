package com.google.android.gms.measurement.internal;

import androidx.collection.C1587a;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzoc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class K5 {

    /* renamed from: a  reason: collision with root package name */
    private String f54749a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f54750b;

    /* renamed from: c  reason: collision with root package name */
    private zzfn.zzm f54751c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f54752d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f54753e;

    /* renamed from: f  reason: collision with root package name */
    private Map f54754f;

    /* renamed from: g  reason: collision with root package name */
    private Map f54755g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ J5 f54756h;

    /* access modifiers changed from: package-private */
    public final zzfn.zzd a(int i10) {
        ArrayList arrayList;
        List list;
        zzfn.zzd.zza zzb = zzfn.zzd.zzb();
        zzb.zza(i10);
        zzb.zza(this.f54750b);
        zzfn.zzm zzm = this.f54751c;
        if (zzm != null) {
            zzb.zza(zzm);
        }
        zzfn.zzm.zza zzd = zzfn.zzm.zze().zzb(x5.J(this.f54752d)).zzd(x5.J(this.f54753e));
        if (this.f54754f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f54754f.size());
            for (Integer num : this.f54754f.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.f54754f.get(num);
                if (l10 != null) {
                    arrayList.add((zzfn.zze) ((zzjk) zzfn.zze.zzc().zza(intValue).zza(l10.longValue()).zzai()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.f54755g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f54755g.size());
            for (Integer num2 : this.f54755g.keySet()) {
                zzfn.zzn.zza zza = zzfn.zzn.zzc().zza(num2.intValue());
                List list2 = (List) this.f54755g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zza.zza((Iterable<? extends Long>) list2);
                }
                arrayList2.add((zzfn.zzn) ((zzjk) zza.zzai()));
            }
            list = arrayList2;
        }
        zzd.zzc(list);
        zzb.zza(zzd);
        return (zzfn.zzd) ((zzjk) zzb.zzai());
    }

    /* access modifiers changed from: package-private */
    public final void c(M5 m52) {
        int a10 = m52.a();
        Boolean bool = m52.f54785c;
        if (bool != null) {
            this.f54753e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = m52.f54786d;
        if (bool2 != null) {
            this.f54752d.set(a10, bool2.booleanValue());
        }
        if (m52.f54787e != null) {
            Long l10 = (Long) this.f54754f.get(Integer.valueOf(a10));
            long longValue = m52.f54787e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f54754f.put(Integer.valueOf(a10), Long.valueOf(longValue));
            }
        }
        if (m52.f54788f != null) {
            List list = (List) this.f54755g.get(Integer.valueOf(a10));
            if (list == null) {
                list = new ArrayList();
                this.f54755g.put(Integer.valueOf(a10), list);
            }
            if (m52.j()) {
                list.clear();
            }
            if (zzoc.zza() && this.f54756h.a().B(this.f54749a, F.f54658l0) && m52.i()) {
                list.clear();
            }
            if (!zzoc.zza() || !this.f54756h.a().B(this.f54749a, F.f54658l0)) {
                list.add(Long.valueOf(m52.f54788f.longValue() / 1000));
                return;
            }
            long longValue2 = m52.f54788f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    private K5(J5 j52, String str) {
        this.f54756h = j52;
        this.f54749a = str;
        this.f54750b = true;
        this.f54752d = new BitSet();
        this.f54753e = new BitSet();
        this.f54754f = new C1587a();
        this.f54755g = new C1587a();
    }

    private K5(J5 j52, String str, zzfn.zzm zzm, BitSet bitSet, BitSet bitSet2, Map map, Map map2) {
        this.f54756h = j52;
        this.f54749a = str;
        this.f54752d = bitSet;
        this.f54753e = bitSet2;
        this.f54754f = map;
        this.f54755g = new C1587a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f54755g.put(num, arrayList);
            }
        }
        this.f54750b = false;
        this.f54751c = zzm;
    }
}
