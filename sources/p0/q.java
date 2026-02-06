package p0;

import G0.a;
import a0.C1538b;
import androidx.collection.K;
import androidx.collection.V;
import androidx.compose.ui.focus.FocusTargetNode;
import lf.C6527k;
import yf.C6787a;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final K f25114a = V.d();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C1538b f25115b = new C1538b(new C6787a[16], 0);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f25116c;

    /* access modifiers changed from: private */
    public final void f() {
        this.f25116c = true;
    }

    /* access modifiers changed from: private */
    public final void g() {
        this.f25114a.h();
        int i10 = 0;
        this.f25116c = false;
        C1538b bVar = this.f25115b;
        int q10 = bVar.q();
        if (q10 > 0) {
            Object[] p10 = bVar.p();
            do {
                ((C6787a) p10[i10]).invoke();
                i10++;
            } while (i10 < q10);
        }
        this.f25115b.i();
    }

    /* access modifiers changed from: private */
    public final void h() {
        K k10 = this.f25114a;
        Object[] objArr = k10.f12124b;
        long[] jArr = k10.f12123a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & -9187201950435737472L) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            ((FocusTargetNode) objArr[(i10 << 3) + i12]).p2();
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                }
                if (i10 == length) {
                    break;
                }
                i10++;
            }
        }
        this.f25114a.h();
        this.f25116c = false;
        this.f25115b.i();
    }

    public final m i(FocusTargetNode focusTargetNode) {
        return (m) this.f25114a.b(focusTargetNode);
    }

    public final void j(FocusTargetNode focusTargetNode, m mVar) {
        K k10 = this.f25114a;
        if (mVar != null) {
            k10.r(focusTargetNode, mVar);
        } else {
            a.c("requires a non-null focus state");
            throw new C6527k();
        }
    }
}
