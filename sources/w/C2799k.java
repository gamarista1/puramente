package w;

import Y.A1;
import Y.C1510r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: w.k  reason: case insensitive filesystem */
public final class C2799k implements A1 {

    /* renamed from: a  reason: collision with root package name */
    private final r0 f27434a;

    /* renamed from: b  reason: collision with root package name */
    private final C1510r0 f27435b;

    /* renamed from: c  reason: collision with root package name */
    private C2805q f27436c;

    /* renamed from: d  reason: collision with root package name */
    private long f27437d;

    /* renamed from: e  reason: collision with root package name */
    private long f27438e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27439f;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r5 = w.C2806r.e(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2799k(w.r0 r3, java.lang.Object r4, w.C2805q r5, long r6, long r8, boolean r10) {
        /*
            r2 = this;
            r2.<init>()
            r2.f27434a = r3
            r0 = 0
            r1 = 2
            Y.r0 r0 = Y.u1.d(r4, r0, r1, r0)
            r2.f27435b = r0
            if (r5 == 0) goto L_0x0015
            w.q r5 = w.C2806r.e(r5)
            if (r5 != 0) goto L_0x0019
        L_0x0015:
            w.q r5 = w.C2800l.i(r3, r4)
        L_0x0019:
            r2.f27436c = r5
            r2.f27437d = r6
            r2.f27438e = r8
            r2.f27439f = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C2799k.<init>(w.r0, java.lang.Object, w.q, long, long, boolean):void");
    }

    public final long g() {
        return this.f27438e;
    }

    public Object getValue() {
        return this.f27435b.getValue();
    }

    public final long k() {
        return this.f27437d;
    }

    public final r0 m() {
        return this.f27434a;
    }

    public final Object n() {
        return this.f27434a.b().invoke(this.f27436c);
    }

    public final C2805q q() {
        return this.f27436c;
    }

    public final boolean r() {
        return this.f27439f;
    }

    public final void s(long j10) {
        this.f27438e = j10;
    }

    public final void t(long j10) {
        this.f27437d = j10;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + n() + ", isRunning=" + this.f27439f + ", lastFrameTimeNanos=" + this.f27437d + ", finishedTimeNanos=" + this.f27438e + ')';
    }

    public final void u(boolean z10) {
        this.f27439f = z10;
    }

    public void v(Object obj) {
        this.f27435b.setValue(obj);
    }

    public final void w(C2805q qVar) {
        this.f27436c = qVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2799k(r0 r0Var, Object obj, C2805q qVar, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(r0Var, obj, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
