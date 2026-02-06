package w;

import kotlin.jvm.internal.C6496s;

final class A0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    private final C2765I f27148a;

    /* renamed from: b  reason: collision with root package name */
    private C2805q f27149b;

    /* renamed from: c  reason: collision with root package name */
    private C2805q f27150c;

    /* renamed from: d  reason: collision with root package name */
    private C2805q f27151d;

    /* renamed from: e  reason: collision with root package name */
    private final float f27152e;

    public A0(C2765I i10) {
        this.f27148a = i10;
        this.f27152e = i10.a();
    }

    public float a() {
        return this.f27152e;
    }

    public C2805q b(C2805q qVar, C2805q qVar2) {
        if (this.f27151d == null) {
            this.f27151d = C2806r.g(qVar);
        }
        C2805q qVar3 = this.f27151d;
        if (qVar3 == null) {
            C6496s.v("targetVector");
            qVar3 = null;
        }
        int b10 = qVar3.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar4 = this.f27151d;
            if (qVar4 == null) {
                C6496s.v("targetVector");
                qVar4 = null;
            }
            qVar4.e(i10, this.f27148a.d(qVar.a(i10), qVar2.a(i10)));
        }
        C2805q qVar5 = this.f27151d;
        if (qVar5 != null) {
            return qVar5;
        }
        C6496s.v("targetVector");
        return null;
    }

    public long c(C2805q qVar, C2805q qVar2) {
        if (this.f27150c == null) {
            this.f27150c = C2806r.g(qVar);
        }
        C2805q qVar3 = this.f27150c;
        if (qVar3 == null) {
            C6496s.v("velocityVector");
            qVar3 = null;
        }
        int b10 = qVar3.b();
        long j10 = 0;
        for (int i10 = 0; i10 < b10; i10++) {
            j10 = Math.max(j10, this.f27148a.c(qVar.a(i10), qVar2.a(i10)));
        }
        return j10;
    }

    public C2805q d(long j10, C2805q qVar, C2805q qVar2) {
        if (this.f27149b == null) {
            this.f27149b = C2806r.g(qVar);
        }
        C2805q qVar3 = this.f27149b;
        if (qVar3 == null) {
            C6496s.v("valueVector");
            qVar3 = null;
        }
        int b10 = qVar3.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar4 = this.f27149b;
            if (qVar4 == null) {
                C6496s.v("valueVector");
                qVar4 = null;
            }
            qVar4.e(i10, this.f27148a.e(j10, qVar.a(i10), qVar2.a(i10)));
        }
        C2805q qVar5 = this.f27149b;
        if (qVar5 != null) {
            return qVar5;
        }
        C6496s.v("valueVector");
        return null;
    }

    public C2805q e(long j10, C2805q qVar, C2805q qVar2) {
        if (this.f27150c == null) {
            this.f27150c = C2806r.g(qVar);
        }
        C2805q qVar3 = this.f27150c;
        if (qVar3 == null) {
            C6496s.v("velocityVector");
            qVar3 = null;
        }
        int b10 = qVar3.b();
        for (int i10 = 0; i10 < b10; i10++) {
            C2805q qVar4 = this.f27150c;
            if (qVar4 == null) {
                C6496s.v("velocityVector");
                qVar4 = null;
            }
            qVar4.e(i10, this.f27148a.b(j10, qVar.a(i10), qVar2.a(i10)));
        }
        C2805q qVar5 = this.f27150c;
        if (qVar5 != null) {
            return qVar5;
        }
        C6496s.v("velocityVector");
        return null;
    }
}
