package M;

import W0.C1450s;
import android.view.inputmethod.EditorInfo;

/* renamed from: M.z  reason: case insensitive filesystem */
public abstract class C1284z {
    private static final boolean a(int i10, int i11) {
        if ((i10 & i11) == i11) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(android.view.inputmethod.EditorInfo r8, java.lang.CharSequence r9, long r10, W0.C1450s r12, java.lang.String[] r13) {
        /*
            int r0 = r12.e()
            W0.r$a r1 = W0.r.f8593b
            int r2 = r1.a()
            boolean r2 = W0.r.m(r0, r2)
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 6
            r7 = 1
            if (r2 == 0) goto L_0x001e
            boolean r0 = r12.h()
            if (r0 == 0) goto L_0x001c
            goto L_0x0070
        L_0x001c:
            r6 = r5
            goto L_0x0070
        L_0x001e:
            int r2 = r1.e()
            boolean r2 = W0.r.m(r0, r2)
            if (r2 == 0) goto L_0x002a
            r6 = r7
            goto L_0x0070
        L_0x002a:
            int r2 = r1.c()
            boolean r2 = W0.r.m(r0, r2)
            if (r2 == 0) goto L_0x0036
            r6 = r4
            goto L_0x0070
        L_0x0036:
            int r2 = r1.d()
            boolean r2 = W0.r.m(r0, r2)
            if (r2 == 0) goto L_0x0042
            r6 = 5
            goto L_0x0070
        L_0x0042:
            int r2 = r1.f()
            boolean r2 = W0.r.m(r0, r2)
            if (r2 == 0) goto L_0x004e
            r6 = 7
            goto L_0x0070
        L_0x004e:
            int r2 = r1.g()
            boolean r2 = W0.r.m(r0, r2)
            if (r2 == 0) goto L_0x005a
            r6 = r3
            goto L_0x0070
        L_0x005a:
            int r2 = r1.h()
            boolean r2 = W0.r.m(r0, r2)
            if (r2 == 0) goto L_0x0066
            r6 = 4
            goto L_0x0070
        L_0x0066:
            int r2 = r1.b()
            boolean r0 = W0.r.m(r0, r2)
            if (r0 == 0) goto L_0x01c6
        L_0x0070:
            r8.imeOptions = r6
            r12.g()
            M.t0 r0 = M.t0.f4274a
            X0.e r2 = r12.d()
            r0.a(r8, r2)
            int r0 = r12.f()
            W0.y$a r2 = W0.C1456y.f8623b
            int r6 = r2.h()
            boolean r6 = W0.C1456y.n(r0, r6)
            if (r6 == 0) goto L_0x0091
        L_0x008e:
            r3 = r7
            goto L_0x00fa
        L_0x0091:
            int r6 = r2.a()
            boolean r6 = W0.C1456y.n(r0, r6)
            if (r6 == 0) goto L_0x00a3
            int r0 = r8.imeOptions
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r3
            r8.imeOptions = r0
            goto L_0x008e
        L_0x00a3:
            int r6 = r2.d()
            boolean r6 = W0.C1456y.n(r0, r6)
            if (r6 == 0) goto L_0x00af
            r3 = r4
            goto L_0x00fa
        L_0x00af:
            int r4 = r2.g()
            boolean r4 = W0.C1456y.n(r0, r4)
            if (r4 == 0) goto L_0x00ba
            goto L_0x00fa
        L_0x00ba:
            int r3 = r2.j()
            boolean r3 = W0.C1456y.n(r0, r3)
            if (r3 == 0) goto L_0x00c7
            r3 = 17
            goto L_0x00fa
        L_0x00c7:
            int r3 = r2.c()
            boolean r3 = W0.C1456y.n(r0, r3)
            if (r3 == 0) goto L_0x00d4
            r3 = 33
            goto L_0x00fa
        L_0x00d4:
            int r3 = r2.f()
            boolean r3 = W0.C1456y.n(r0, r3)
            if (r3 == 0) goto L_0x00e1
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x00fa
        L_0x00e1:
            int r3 = r2.e()
            boolean r3 = W0.C1456y.n(r0, r3)
            if (r3 == 0) goto L_0x00ee
            r3 = 18
            goto L_0x00fa
        L_0x00ee:
            int r3 = r2.b()
            boolean r0 = W0.C1456y.n(r0, r3)
            if (r0 == 0) goto L_0x01be
            r3 = 8194(0x2002, float:1.1482E-41)
        L_0x00fa:
            r8.inputType = r3
            boolean r0 = r12.h()
            if (r0 != 0) goto L_0x0126
            int r0 = r8.inputType
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x0126
            int r0 = r8.inputType
            r3 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r3
            r8.inputType = r0
            int r0 = r12.e()
            int r1 = r1.a()
            boolean r0 = W0.r.m(r0, r1)
            if (r0 == 0) goto L_0x0126
            int r0 = r8.imeOptions
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r0 | r1
            r8.imeOptions = r0
        L_0x0126:
            int r0 = r8.inputType
            boolean r0 = a(r0, r7)
            if (r0 == 0) goto L_0x0174
            int r0 = r12.c()
            W0.x$a r1 = W0.C1455x.f8616b
            int r3 = r1.a()
            boolean r3 = W0.C1455x.i(r0, r3)
            if (r3 == 0) goto L_0x0145
            int r0 = r8.inputType
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r8.inputType = r0
            goto L_0x0166
        L_0x0145:
            int r3 = r1.e()
            boolean r3 = W0.C1455x.i(r0, r3)
            if (r3 == 0) goto L_0x0156
            int r0 = r8.inputType
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r8.inputType = r0
            goto L_0x0166
        L_0x0156:
            int r1 = r1.c()
            boolean r0 = W0.C1455x.i(r0, r1)
            if (r0 == 0) goto L_0x0166
            int r0 = r8.inputType
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r8.inputType = r0
        L_0x0166:
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x0174
            int r0 = r8.inputType
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 | r1
            r8.inputType = r0
        L_0x0174:
            int r0 = Q0.Q.n(r10)
            r8.initialSelStart = r0
            int r10 = Q0.Q.i(r10)
            r8.initialSelEnd = r10
            A1.c.f(r8, r9)
            if (r13 == 0) goto L_0x0188
            A1.c.d(r8, r13)
        L_0x0188:
            int r9 = r8.imeOptions
            r10 = 33554432(0x2000000, float:9.403955E-38)
            r9 = r9 | r10
            r8.imeOptions = r9
            boolean r9 = K.c.a()
            if (r9 == 0) goto L_0x01ba
            int r9 = r12.f()
            int r10 = r2.f()
            boolean r9 = W0.C1456y.n(r9, r10)
            if (r9 != 0) goto L_0x01ba
            int r9 = r12.f()
            int r10 = r2.e()
            boolean r9 = W0.C1456y.n(r9, r10)
            if (r9 != 0) goto L_0x01ba
            A1.c.g(r8, r7)
            M.y r9 = M.C1283y.f4288a
            r9.a(r8)
            goto L_0x01bd
        L_0x01ba:
            A1.c.g(r8, r5)
        L_0x01bd:
            return
        L_0x01be:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Invalid Keyboard Type"
            r8.<init>(r9)
            throw r8
        L_0x01c6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "invalid ImeAction"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M.C1284z.b(android.view.inputmethod.EditorInfo, java.lang.CharSequence, long, W0.s, java.lang.String[]):void");
    }

    public static /* synthetic */ void c(EditorInfo editorInfo, CharSequence charSequence, long j10, C1450s sVar, String[] strArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        b(editorInfo, charSequence, j10, sVar, strArr);
    }
}
