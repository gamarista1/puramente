package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjk;
import java.util.ArrayList;
import java.util.List;

final class L5 {

    /* renamed from: a  reason: collision with root package name */
    private zzfn.zzf f54763a;

    /* renamed from: b  reason: collision with root package name */
    private Long f54764b;

    /* renamed from: c  reason: collision with root package name */
    private long f54765c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ J5 f54766d;

    /* access modifiers changed from: package-private */
    public final zzfn.zzf a(String str, zzfn.zzf zzf) {
        boolean z10;
        Object obj;
        String zzg = zzf.zzg();
        List<zzfn.zzh> zzh = zzf.zzh();
        this.f54766d.j();
        Long l10 = (Long) x5.b0(zzf, "_eid");
        if (l10 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && zzg.equals("_ep")) {
            C4536s.l(l10);
            this.f54766d.j();
            zzg = (String) x5.b0(zzf, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.f54766d.zzj().D().b("Extra parameter without an event name. eventId", l10);
                return null;
            }
            if (this.f54763a == null || this.f54764b == null || l10.longValue() != this.f54764b.longValue()) {
                Pair C10 = this.f54766d.l().C(str, l10);
                if (C10 == null || (obj = C10.first) == null) {
                    this.f54766d.zzj().D().c("Extra parameter without existing main event. eventName, eventId", zzg, l10);
                    return null;
                }
                this.f54763a = (zzfn.zzf) obj;
                this.f54765c = ((Long) C10.second).longValue();
                this.f54766d.j();
                this.f54764b = (Long) x5.b0(this.f54763a, "_eid");
            }
            long j10 = this.f54765c - 1;
            this.f54765c = j10;
            if (j10 <= 0) {
                C4646l l11 = this.f54766d.l();
                l11.i();
                l11.zzj().F().b("Clearing complex main event info. appId", str);
                try {
                    l11.w().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e10) {
                    l11.zzj().B().b("Error clearing complex main event", e10);
                }
            } else {
                this.f54766d.l().f0(str, l10, this.f54765c, this.f54763a);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfn.zzh next : this.f54763a.zzh()) {
                this.f54766d.j();
                if (x5.A(zzf, next.zzg()) == null) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(zzh);
                zzh = arrayList;
            } else {
                this.f54766d.zzj().D().b("No unique parameters in main event. eventName", zzg);
            }
        } else if (z10) {
            this.f54764b = l10;
            this.f54763a = zzf;
            this.f54766d.j();
            long longValue = ((Long) x5.E(zzf, "_epc", 0L)).longValue();
            this.f54765c = longValue;
            if (longValue <= 0) {
                this.f54766d.zzj().D().b("Complex event with zero extra param count. eventName", zzg);
            } else {
                this.f54766d.l().f0(str, (Long) C4536s.l(l10), this.f54765c, zzf);
            }
        }
        return (zzfn.zzf) ((zzjk) ((zzfn.zzf.zza) zzf.zzcc()).zza(zzg).zzd().zza((Iterable<? extends zzfn.zzh>) zzh).zzai());
    }

    private L5(J5 j52) {
        this.f54766d = j52;
    }
}
