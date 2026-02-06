package Fg;

import Eg.n;
import Lf.i;
import Of.C5487e;
import Of.C5490h;
import Of.C5495m;
import Pg.k;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import vg.C6755e;

/* renamed from: Fg.b  reason: case insensitive filesystem */
public abstract class C5361b extends C5389p {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5361b(n nVar) {
        super(nVar);
        if (nVar == null) {
            H(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ void H(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto L_0x000c
            if (r9 == r1) goto L_0x000c
            if (r9 == r0) goto L_0x000c
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x000e
        L_0x000c:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        L_0x000e:
            r4 = 2
            if (r9 == r2) goto L_0x0017
            if (r9 == r1) goto L_0x0017
            if (r9 == r0) goto L_0x0017
            r5 = r1
            goto L_0x0018
        L_0x0017:
            r5 = r4
        L_0x0018:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L_0x002f
            if (r9 == r4) goto L_0x002a
            if (r9 == r1) goto L_0x002f
            if (r9 == r0) goto L_0x002f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L_0x0031
        L_0x002a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L_0x0031
        L_0x002f:
            r5[r7] = r6
        L_0x0031:
            if (r9 == r2) goto L_0x003f
            if (r9 == r1) goto L_0x003a
            if (r9 == r0) goto L_0x003a
            r5[r2] = r6
            goto L_0x0043
        L_0x003a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L_0x0043
        L_0x003f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L_0x0043:
            if (r9 == r2) goto L_0x0054
            if (r9 == r4) goto L_0x0050
            if (r9 == r1) goto L_0x0054
            if (r9 == r0) goto L_0x0054
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L_0x0054
        L_0x0050:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L_0x0054:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L_0x0064
            if (r9 == r1) goto L_0x0064
            if (r9 == r0) goto L_0x0064
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L_0x0069
        L_0x0064:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L_0x0069:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Fg.C5361b.H(int):void");
    }

    public abstract C5487e I();

    /* access modifiers changed from: protected */
    public boolean d(C5490h hVar) {
        if (hVar == null) {
            H(2);
        }
        if (!(hVar instanceof C5487e) || !b(I(), hVar)) {
            return false;
        }
        return true;
    }

    public i m() {
        i m10 = C6755e.m(I());
        if (m10 == null) {
            H(1);
        }
        return m10;
    }

    /* access modifiers changed from: protected */
    public S s() {
        if (i.u0(I())) {
            return null;
        }
        return m().i();
    }

    /* access modifiers changed from: protected */
    public Collection t(boolean z10) {
        C5495m b10 = I().b();
        if (!(b10 instanceof C5487e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                H(3);
            }
            return emptyList;
        }
        k kVar = new k();
        C5487e eVar = (C5487e) b10;
        kVar.add(eVar.p());
        C5487e o02 = eVar.o0();
        if (z10 && o02 != null) {
            kVar.add(o02.p());
        }
        return kVar;
    }
}
