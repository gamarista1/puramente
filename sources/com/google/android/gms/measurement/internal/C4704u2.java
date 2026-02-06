package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzs;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.u2  reason: case insensitive filesystem */
final class C4704u2 implements zzv {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C4681q2 f55362a;

    C4704u2(C4681q2 q2Var) {
        this.f55362a = q2Var;
    }

    public final void zza(zzs zzs, String str, List list, boolean z10, boolean z11) {
        X1 x12;
        int i10 = C4722x2.f55397a[zzs.ordinal()];
        if (i10 == 1) {
            x12 = this.f55362a.zzj().A();
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    x12 = this.f55362a.zzj().E();
                } else {
                    x12 = this.f55362a.zzj().F();
                }
            } else if (z10) {
                x12 = this.f55362a.zzj().I();
            } else if (!z11) {
                x12 = this.f55362a.zzj().H();
            } else {
                x12 = this.f55362a.zzj().G();
            }
        } else if (z10) {
            x12 = this.f55362a.zzj().D();
        } else if (!z11) {
            x12 = this.f55362a.zzj().C();
        } else {
            x12 = this.f55362a.zzj().B();
        }
        int size = list.size();
        if (size == 1) {
            x12.b(str, list.get(0));
        } else if (size == 2) {
            x12.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            x12.a(str);
        } else {
            x12.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
