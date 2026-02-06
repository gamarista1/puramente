package H0;

import q0.C2427m;

/* renamed from: H0.i  reason: case insensitive filesystem */
public abstract class C1188i {
    /* access modifiers changed from: private */
    public static final float e(long j10, long j11) {
        return C2427m.i(j11) / C2427m.i(j10);
    }

    /* access modifiers changed from: private */
    public static final float f(long j10, long j11) {
        return Math.max(h(j10, j11), e(j10, j11));
    }

    /* access modifiers changed from: private */
    public static final float g(long j10, long j11) {
        return Math.min(h(j10, j11), e(j10, j11));
    }

    /* access modifiers changed from: private */
    public static final float h(long j10, long j11) {
        return C2427m.k(j11) / C2427m.k(j10);
    }
}
