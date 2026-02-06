package E;

import E.C1135d;
import Ef.i;
import androidx.collection.H;
import androidx.collection.N;
import androidx.collection.O;
import androidx.compose.foundation.lazy.layout.c;
import kotlin.jvm.internal.C6498u;
import lf.C6514M;
import mf.C6559l;
import yf.C6798l;

public final class K implements c {

    /* renamed from: b  reason: collision with root package name */
    private final N f1580b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f1581c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f1582d;

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f1583a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f1584b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ H f1585c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f1586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, int i11, H h10, K k10) {
            super(1);
            this.f1583a = i10;
            this.f1584b = i11;
            this.f1585c = h10;
            this.f1586d = k10;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0037, code lost:
            if (r3 == null) goto L_0x0039;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(E.C1135d.a r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r7.c()
                E.o$a r0 = (E.C1146o.a) r0
                yf.l r0 = r0.getKey()
                int r1 = r6.f1583a
                int r2 = r7.b()
                int r1 = java.lang.Math.max(r1, r2)
                int r2 = r6.f1584b
                int r3 = r7.b()
                int r4 = r7.a()
                int r3 = r3 + r4
                int r3 = r3 + -1
                int r2 = java.lang.Math.min(r2, r3)
                if (r1 > r2) goto L_0x0057
            L_0x0027:
                if (r0 == 0) goto L_0x0039
                int r3 = r7.b()
                int r3 = r1 - r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r3 = r0.invoke(r3)
                if (r3 != 0) goto L_0x003d
            L_0x0039:
                java.lang.Object r3 = E.I.a(r1)
            L_0x003d:
                androidx.collection.H r4 = r6.f1585c
                r4.r(r3, r1)
                E.K r4 = r6.f1586d
                java.lang.Object[] r4 = r4.f1581c
                E.K r5 = r6.f1586d
                int r5 = r5.f1582d
                int r5 = r1 - r5
                r4[r5] = r3
                if (r1 == r2) goto L_0x0057
                int r1 = r1 + 1
                goto L_0x0027
            L_0x0057:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E.K.a.a(E.d$a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1135d.a) obj);
            return C6514M.f71813a;
        }
    }

    public K(i iVar, C1146o oVar) {
        C1135d g10 = oVar.g();
        int k10 = iVar.k();
        if (k10 >= 0) {
            int min = Math.min(iVar.n(), g10.getSize() - 1);
            if (min < k10) {
                this.f1580b = O.a();
                this.f1581c = new Object[0];
                this.f1582d = 0;
                return;
            }
            int i10 = (min - k10) + 1;
            this.f1581c = new Object[i10];
            this.f1582d = k10;
            H h10 = new H(i10);
            g10.a(k10, min, new a(k10, min, h10, this));
            this.f1580b = h10;
            return;
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public int c(Object obj) {
        N n10 = this.f1580b;
        int a10 = n10.a(obj);
        if (a10 >= 0) {
            return n10.f12108c[a10];
        }
        return -1;
    }

    public Object d(int i10) {
        Object[] objArr = this.f1581c;
        int i11 = i10 - this.f1582d;
        if (i11 < 0 || i11 > C6559l.j0(objArr)) {
            return null;
        }
        return objArr[i11];
    }
}
