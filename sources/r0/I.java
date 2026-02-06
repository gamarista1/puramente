package R0;

final class I {

    /* renamed from: a  reason: collision with root package name */
    private final l0 f5503a;

    /* renamed from: b  reason: collision with root package name */
    private int f5504b = -1;

    /* renamed from: c  reason: collision with root package name */
    private float f5505c;

    public I(l0 l0Var) {
        this.f5503a = l0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final float a(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x001f
            R0.l0 r2 = r5.f5503a
            android.text.Layout r2 = r2.i()
            int r2 = R0.K.a(r2, r6, r7)
            R0.l0 r3 = r5.f5503a
            int r3 = r3.v(r2)
            R0.l0 r4 = r5.f5503a
            int r2 = r4.p(r2)
            if (r6 == r3) goto L_0x0021
            if (r6 != r2) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r2 = r1
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            int r3 = r6 * 4
            if (r9 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x002f
            r0 = r1
            goto L_0x002f
        L_0x002a:
            if (r2 == 0) goto L_0x002e
            r0 = 2
            goto L_0x002f
        L_0x002e:
            r0 = 3
        L_0x002f:
            int r3 = r3 + r0
            int r0 = r5.f5504b
            if (r0 != r3) goto L_0x0037
            float r6 = r5.f5505c
            return r6
        L_0x0037:
            if (r9 == 0) goto L_0x0040
            R0.l0 r9 = r5.f5503a
            float r6 = r9.A(r6, r7)
            goto L_0x0046
        L_0x0040:
            R0.l0 r9 = r5.f5503a
            float r6 = r9.D(r6, r7)
        L_0x0046:
            if (r8 == 0) goto L_0x004c
            r5.f5504b = r3
            r5.f5505c = r6
        L_0x004c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.I.a(int, boolean, boolean, boolean):float");
    }

    public final float b(int i10) {
        return a(i10, false, false, true);
    }

    public final float c(int i10) {
        return a(i10, true, true, true);
    }

    public final float d(int i10) {
        return a(i10, false, false, false);
    }

    public final float e(int i10) {
        return a(i10, true, true, false);
    }
}
