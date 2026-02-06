package Yg;

import Xg.L;
import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import lf.v;
import qf.C6658d;

public abstract class b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public d[] f66778a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public int f66779b;

    /* renamed from: c  reason: collision with root package name */
    private int f66780c;

    /* renamed from: d  reason: collision with root package name */
    private z f66781d;

    public final L c() {
        z zVar;
        synchronized (this) {
            zVar = this.f66781d;
            if (zVar == null) {
                zVar = new z(this.f66779b);
                this.f66781d = zVar;
            }
        }
        return zVar;
    }

    /* access modifiers changed from: protected */
    public final d i() {
        d dVar;
        z zVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f66778a;
                if (dVarArr == null) {
                    dVarArr = k(2);
                    this.f66778a = dVarArr;
                } else if (this.f66779b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    C6496s.g(copyOf, "copyOf(...)");
                    this.f66778a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i10 = this.f66780c;
                do {
                    dVar = dVarArr[i10];
                    if (dVar == null) {
                        dVar = j();
                        dVarArr[i10] = dVar;
                    }
                    i10++;
                    if (i10 >= dVarArr.length) {
                        i10 = 0;
                    }
                    C6496s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f66780c = i10;
                this.f66779b++;
                zVar = this.f66781d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zVar != null) {
            zVar.a0(1);
        }
        return dVar;
    }

    /* access modifiers changed from: protected */
    public abstract d j();

    /* access modifiers changed from: protected */
    public abstract d[] k(int i10);

    /* access modifiers changed from: protected */
    public final void l(d dVar) {
        z zVar;
        int i10;
        C6658d[] b10;
        synchronized (this) {
            try {
                int i11 = this.f66779b - 1;
                this.f66779b = i11;
                zVar = this.f66781d;
                if (i11 == 0) {
                    this.f66780c = 0;
                }
                C6496s.f(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b10 = dVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (C6658d dVar2 : b10) {
            if (dVar2 != null) {
                v.a aVar = v.f71841b;
                dVar2.resumeWith(v.b(C6514M.f71813a));
            }
        }
        if (zVar != null) {
            zVar.a0(-1);
        }
    }

    /* access modifiers changed from: protected */
    public final int m() {
        return this.f66779b;
    }

    /* access modifiers changed from: protected */
    public final d[] n() {
        return this.f66778a;
    }
}
