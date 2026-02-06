package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.collection.C1587a;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zzoc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class J5 extends C4645k5 {

    /* renamed from: d  reason: collision with root package name */
    private String f54738d;

    /* renamed from: e  reason: collision with root package name */
    private Set f54739e;

    /* renamed from: f  reason: collision with root package name */
    private Map f54740f;

    /* renamed from: g  reason: collision with root package name */
    private Long f54741g;

    /* renamed from: h  reason: collision with root package name */
    private Long f54742h;

    J5(q5 q5Var) {
        super(q5Var);
    }

    private final K5 t(Integer num) {
        if (this.f54740f.containsKey(num)) {
            return (K5) this.f54740f.get(num);
        }
        K5 k52 = new K5(this, this.f54738d);
        this.f54740f.put(num, k52);
        return k52;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
        if (r7.zzi() == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010f, code lost:
        r9 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0117, code lost:
        r5.c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void w(java.util.List r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            androidx.collection.a r0 = new androidx.collection.a
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0010:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x012a
            java.lang.Object r1 = r14.next()
            com.google.android.gms.internal.measurement.zzfn$zzo r1 = (com.google.android.gms.internal.measurement.zzfn.zzo) r1
            java.lang.String r2 = r1.zzg()
            java.lang.Object r3 = r0.get(r2)
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.l r3 = r13.l()
            java.lang.String r4 = r13.f54738d
            java.util.Map r3 = r3.H0(r4, r2)
            r0.put(r2, r3)
        L_0x0035:
            java.util.Set r2 = r3.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0010
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r5 = r4.intValue()
            java.util.Set r6 = r13.f54739e
            boolean r6 = r6.contains(r4)
            if (r6 == 0) goto L_0x0063
            com.google.android.gms.measurement.internal.V1 r1 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r1 = r1.F()
            java.lang.String r2 = "Skipping failed audience ID"
            r1.b(r2, r4)
            goto L_0x0010
        L_0x0063:
            java.lang.Object r6 = r3.get(r4)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x006e:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0121
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.zzff$zze r7 = (com.google.android.gms.internal.measurement.zzff.zze) r7
            com.google.android.gms.measurement.internal.V1 r8 = r13.zzj()
            r9 = 2
            boolean r8 = r8.x(r9)
            r9 = 0
            if (r8 == 0) goto L_0x00c4
            com.google.android.gms.measurement.internal.V1 r8 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r8 = r8.F()
            boolean r10 = r7.zzi()
            if (r10 == 0) goto L_0x009d
            int r10 = r7.zza()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x009e
        L_0x009d:
            r10 = r9
        L_0x009e:
            com.google.android.gms.measurement.internal.R1 r11 = r13.d()
            java.lang.String r12 = r7.zze()
            java.lang.String r11 = r11.g(r12)
            java.lang.String r12 = "Evaluating filter. audience, filter, property"
            r8.d(r12, r4, r10, r11)
            com.google.android.gms.measurement.internal.V1 r8 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r8 = r8.F()
            com.google.android.gms.measurement.internal.x5 r10 = r13.j()
            java.lang.String r10 = r10.G(r7)
            java.lang.String r11 = "Filter definition"
            r8.b(r11, r10)
        L_0x00c4:
            boolean r8 = r7.zzi()
            if (r8 == 0) goto L_0x00fb
            int r8 = r7.zza()
            r10 = 256(0x100, float:3.59E-43)
            if (r8 <= r10) goto L_0x00d3
            goto L_0x00fb
        L_0x00d3:
            com.google.android.gms.measurement.internal.d r8 = new com.google.android.gms.measurement.internal.d
            java.lang.String r9 = r13.f54738d
            r8.<init>(r13, r9, r5, r7)
            java.lang.Long r9 = r13.f54741g
            java.lang.Long r10 = r13.f54742h
            int r7 = r7.zza()
            boolean r7 = r13.y(r5, r7)
            boolean r7 = r8.k(r9, r10, r1, r7)
            if (r7 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.K5 r9 = r13.t(r4)
            r9.c(r8)
            goto L_0x006e
        L_0x00f5:
            java.util.Set r5 = r13.f54739e
            r5.add(r4)
            goto L_0x0121
        L_0x00fb:
            com.google.android.gms.measurement.internal.V1 r5 = r13.zzj()
            com.google.android.gms.measurement.internal.X1 r5 = r5.G()
            java.lang.String r6 = r13.f54738d
            java.lang.Object r6 = com.google.android.gms.measurement.internal.V1.q(r6)
            boolean r8 = r7.zzi()
            if (r8 == 0) goto L_0x0117
            int r7 = r7.zza()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
        L_0x0117:
            java.lang.String r7 = java.lang.String.valueOf(r9)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r5.c(r8, r6, r7)
            r7 = 0
        L_0x0121:
            if (r7 != 0) goto L_0x003d
            java.util.Set r5 = r13.f54739e
            r5.add(r4)
            goto L_0x003d
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.J5.w(java.util.List):void");
    }

    private final void x(List list, boolean z10) {
        C4725y yVar;
        L5 l52;
        Integer num;
        Map map;
        long j10;
        if (!list.isEmpty()) {
            String str = null;
            L5 l53 = new L5(this);
            C1587a aVar = new C1587a();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzfn.zzf zzf = (zzfn.zzf) it.next();
                zzfn.zzf a10 = l53.a(this.f54738d, zzf);
                if (a10 != null) {
                    C4646l l10 = l();
                    String str2 = this.f54738d;
                    String zzg = a10.zzg();
                    C4725y B02 = l10.B0(str2, zzf.zzg());
                    if (B02 == null) {
                        l10.zzj().G().c("Event aggregate wasn't created during raw event logging. appId, event", V1.q(str2), l10.d().c(zzg));
                        yVar = new C4725y(str2, zzf.zzg(), 1, 1, 1, zzf.zzd(), 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                    } else {
                        yVar = new C4725y(B02.f55403a, B02.f55404b, B02.f55405c + 1, B02.f55406d + 1, B02.f55407e + 1, B02.f55408f, B02.f55409g, B02.f55410h, B02.f55411i, B02.f55412j, B02.f55413k);
                    }
                    C4725y yVar2 = yVar;
                    l().P(yVar2);
                    if (!zznk.zza() || !a().B(str, F.f54628W0) || !z10) {
                        long j11 = yVar2.f55405c;
                        String zzg2 = a10.zzg();
                        Map map2 = (Map) aVar.get(zzg2);
                        if (map2 == null) {
                            map2 = l().F0(this.f54738d, zzg2);
                            aVar.put(zzg2, map2);
                        }
                        Map map3 = map2;
                        for (Integer num2 : map3.keySet()) {
                            int intValue = num2.intValue();
                            if (this.f54739e.contains(num2)) {
                                zzj().F().b("Skipping failed audience ID", num2);
                            } else {
                                Iterator it2 = ((List) map3.get(num2)).iterator();
                                boolean z11 = true;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        l52 = l53;
                                        num = num2;
                                        map = map3;
                                        j10 = j11;
                                        break;
                                    }
                                    zzff.zzb zzb = (zzff.zzb) it2.next();
                                    C4576b bVar = new C4576b(this, this.f54738d, intValue, zzb);
                                    C4576b bVar2 = bVar;
                                    l52 = l53;
                                    num = num2;
                                    int i10 = intValue;
                                    map = map3;
                                    j10 = j11;
                                    z11 = bVar.k(this.f54741g, this.f54742h, a10, j11, yVar2, y(intValue, zzb.zzb()));
                                    if (!z11) {
                                        this.f54739e.add(num);
                                        break;
                                    }
                                    t(num).c(bVar2);
                                    num2 = num;
                                    l53 = l52;
                                    intValue = i10;
                                    map3 = map;
                                    j11 = j10;
                                }
                                if (!z11) {
                                    this.f54739e.add(num);
                                }
                                l53 = l52;
                                map3 = map;
                                j11 = j10;
                                str = null;
                            }
                        }
                    }
                }
            }
        }
    }

    private final boolean y(int i10, int i11) {
        K5 k52 = (K5) this.f54740f.get(Integer.valueOf(i10));
        if (k52 == null) {
            return false;
        }
        return k52.f54752d.get(i11);
    }

    private final List z() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.f54740f.keySet();
        keySet.removeAll(this.f54739e);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            K5 k52 = (K5) this.f54740f.get(num);
            C4536s.l(k52);
            zzfn.zzd a10 = k52.a(intValue);
            arrayList.add(a10);
            C4646l l10 = l();
            String str = this.f54738d;
            zzfn.zzm zzd = a10.zzd();
            l10.p();
            l10.i();
            C4536s.f(str);
            C4536s.l(zzd);
            byte[] zzbz = zzd.zzbz();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", zzbz);
            try {
                if (l10.w().insertWithOnConflict("audience_filter_values", (String) null, contentValues, 5) == -1) {
                    l10.zzj().B().b("Failed to insert filter results (got -1). appId", V1.q(str));
                }
            } catch (SQLiteException e10) {
                l10.zzj().B().c("Error storing filter results. appId", V1.q(str), e10);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final List u(String str, List list, List list2, Long l10, Long l11) {
        return v(str, list, list2, l10, l11, false);
    }

    /* access modifiers changed from: package-private */
    public final List v(String str, List list, List list2, Long l10, Long l11, boolean z10) {
        boolean z11;
        C1587a aVar;
        List<zzff.zzb> list3;
        Iterator it;
        Map map;
        Iterator<zzfn.zzn> it2;
        Iterator it3;
        Map map2;
        List list4 = list;
        List list5 = list2;
        boolean z12 = z10;
        C4536s.f(str);
        C4536s.l(list);
        C4536s.l(list2);
        this.f54738d = str;
        this.f54739e = new HashSet();
        this.f54740f = new C1587a();
        this.f54741g = l10;
        this.f54742h = l11;
        Iterator it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                if ("_s".equals(((zzfn.zzf) it4.next()).zzg())) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        boolean z13 = zzoc.zza() && a().B(this.f54738d, F.f54658l0);
        boolean z14 = zzoc.zza() && a().B(this.f54738d, F.f54656k0);
        if (z11) {
            C4646l l12 = l();
            String str2 = this.f54738d;
            l12.p();
            l12.i();
            C4536s.f(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", 0);
            try {
                l12.w().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e10) {
                l12.zzj().B().c("Error resetting session-scoped event counts. appId", V1.q(str2), e10);
            }
        }
        Map emptyMap = Collections.emptyMap();
        if (z14 && z13) {
            emptyMap = l().P0(this.f54738d);
        }
        Map O02 = l().O0(this.f54738d);
        if (!O02.isEmpty()) {
            HashSet hashSet = new HashSet(O02.keySet());
            if (z11) {
                String str3 = this.f54738d;
                Map Q02 = l().Q0(this.f54738d);
                C4536s.f(str3);
                C4536s.l(O02);
                C1587a aVar2 = new C1587a();
                if (!O02.isEmpty()) {
                    Iterator it5 = O02.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer num = (Integer) it5.next();
                        num.intValue();
                        zzfn.zzm zzm = (zzfn.zzm) O02.get(num);
                        List list6 = (List) Q02.get(num);
                        if (list6 == null || list6.isEmpty()) {
                            map2 = Q02;
                            it3 = it5;
                            aVar2.put(num, zzm);
                        } else {
                            List K10 = j().K(zzm.zzi(), list6);
                            if (!K10.isEmpty()) {
                                zzfn.zzm.zza zzb = ((zzfn.zzm.zza) zzm.zzcc()).zzb().zzb(K10);
                                zzb.zzd().zzd(j().K(zzm.zzk(), list6));
                                ArrayList arrayList = new ArrayList();
                                for (zzfn.zze next : zzm.zzh()) {
                                    Map map3 = Q02;
                                    Iterator it6 = it5;
                                    if (!list6.contains(Integer.valueOf(next.zza()))) {
                                        arrayList.add(next);
                                    }
                                    Q02 = map3;
                                    it5 = it6;
                                }
                                map2 = Q02;
                                it3 = it5;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfn.zzn next2 : zzm.zzj()) {
                                    if (!list6.contains(Integer.valueOf(next2.zzb()))) {
                                        arrayList2.add(next2);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                aVar2.put(num, (zzfn.zzm) ((zzjk) zzb.zzai()));
                            }
                        }
                        Q02 = map2;
                        it5 = it3;
                    }
                }
                aVar = aVar2;
            } else {
                aVar = O02;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num2 = (Integer) it7.next();
                num2.intValue();
                zzfn.zzm zzm2 = (zzfn.zzm) aVar.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                C1587a aVar3 = new C1587a();
                if (!(zzm2 == null || zzm2.zza() == 0)) {
                    for (zzfn.zze next3 : zzm2.zzh()) {
                        if (next3.zzf()) {
                            aVar3.put(Integer.valueOf(next3.zza()), next3.zze() ? Long.valueOf(next3.zzb()) : null);
                        }
                    }
                }
                C1587a aVar4 = new C1587a();
                if (!(zzm2 == null || zzm2.zzc() == 0)) {
                    Iterator<zzfn.zzn> it8 = zzm2.zzj().iterator();
                    while (it8.hasNext()) {
                        zzfn.zzn next4 = it8.next();
                        if (!next4.zzf() || next4.zza() <= 0) {
                            it2 = it8;
                            map = aVar;
                        } else {
                            it2 = it8;
                            map = aVar;
                            aVar4.put(Integer.valueOf(next4.zzb()), Long.valueOf(next4.zza(next4.zza() - 1)));
                        }
                        it8 = it2;
                        aVar = map;
                    }
                }
                Map map4 = aVar;
                if (zzm2 != null) {
                    int i10 = 0;
                    while (i10 < (zzm2.zzd() << 6)) {
                        if (x5.a0(zzm2.zzk(), i10)) {
                            it = it7;
                            zzj().F().c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i10));
                            bitSet2.set(i10);
                            if (x5.a0(zzm2.zzi(), i10)) {
                                bitSet.set(i10);
                                i10++;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        aVar3.remove(Integer.valueOf(i10));
                        i10++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                zzfn.zzm zzm3 = (zzfn.zzm) O02.get(num2);
                if (!(!z14 || !z13 || (list3 = (List) emptyMap.get(num2)) == null || this.f54742h == null || this.f54741g == null)) {
                    for (zzff.zzb zzb2 : list3) {
                        int zzb3 = zzb2.zzb();
                        long longValue = this.f54742h.longValue() / 1000;
                        if (zzb2.zzi()) {
                            longValue = this.f54741g.longValue() / 1000;
                        }
                        if (aVar3.containsKey(Integer.valueOf(zzb3))) {
                            aVar3.put(Integer.valueOf(zzb3), Long.valueOf(longValue));
                        }
                        if (aVar4.containsKey(Integer.valueOf(zzb3))) {
                            aVar4.put(Integer.valueOf(zzb3), Long.valueOf(longValue));
                        }
                    }
                }
                this.f54740f.put(num2, new K5(this, this.f54738d, zzm3, bitSet, bitSet2, aVar3, aVar4));
                it7 = it9;
                O02 = O02;
                aVar = map4;
            }
        }
        if (!zznk.zza() || !a().B((String) null, F.f54628W0)) {
            x(list4, true);
            w(list5);
            return z();
        }
        x(list4, z12);
        if (z12) {
            return new ArrayList();
        }
        w(list5);
        return z();
    }
}
